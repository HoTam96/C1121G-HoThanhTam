package reposotory;

import Dbcontext.BaseRepository;
import model.User;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static Dbcontext.BaseRepository.getConnection;

public class UserReponsitory implements IUserReponsitory {
    private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?";
    private static final String INSERT_USERS_SQL = "INSERT INTO users (name, email, country) VALUES (?, ?, ?);";

//    thực hành ko sử dụng transiton
    private static final String SQL_INSERT = "INSERT INTO EMPLOYEE (NAME, SALARY, CREATED_DATE) VALUES (?,?,?)";

    private static final String SQL_UPDATE = "UPDATE EMPLOYEE SET SALARY=? WHERE NAME=?";

    private static final String SQL_TABLE_CREATE = "CREATE TABLE EMPLOYEE"+ "("

            + " ID serial,"

            + " NAME varchar(100) NOT NULL,"

            + " SALARY numeric(15, 2) NOT NULL,"

            + " CREATED_DATE timestamp,"

            + " PRIMARY KEY (ID)"

            + ")";
    private static final String SQL_TABLE_DROP = "DROP TABLE IF EXISTS EMPLOYEE";

    //        private static final String INSERT_USERS_SQL = "INSERT INTO users (name, email, country) VALUES (?, ?, ?)";

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    CallableStatement call = null;
    PreparedStatement pstmtAssignment = null;

    @Override
    public void insertUser(User user) throws SQLException {

        String query = "insert into users(name, email, country) values(?,?,?)";
        System.out.println("haha có ta ở đây");
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getCountry());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    @Override
    public User selectUser(int id) {
        String query = "select id,name,email,country from users where id =?";
        User user = null;
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            while (rs.next()) {
                user = new User(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getString(4));
                return user;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;




    }

    @Override
    public List<User> selectAllUsers() {
        String query = "select id,name,email,country from users  order by name desc";
        List<User> userList = new ArrayList<>();
        try {
            conn = getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                User user = new User(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getString(4));
                userList.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return userList;
    }


    @Override
    public boolean deleteUser(int id) throws SQLException {
        String query ="delete from users where id =?";
        boolean rowDeleted;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query);
             ) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getCountry());
            statement.setInt(4, user.getId());

            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }


    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
@Override
    public List<User> getByName(String country, int index) {

        String query = "select users.id,users.name,users.email,users.country from users where country like ? limit ?,3";
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%"+country+"%");
            index=index*3-3;
            ps.setInt(2,index);
            rs = ps.executeQuery();
            List<User> userList = new ArrayList<>();
            while (rs.next()) {
                User user = new User(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getString(4));
                userList.add(user);
            }
            return userList;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
//    search cho ra số lượng phần tử có trong 1 trang

    public int getCount(String name ){
        String query = "select count(users.id) from users where users.country like ?";
        int endPage = 0;
        try {
            conn = BaseRepository.getConnection();
            ps= conn.prepareStatement(query);
            ps.setString(1,"%"+name+"%");
            rs=ps.executeQuery();
            while (rs.next()){
                 endPage = rs.getInt(1);
            }
            return endPage;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                getConnection().close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return endPage;
    }
// new
    @Override
    public User getUserById(int id) {
        User user = null;
        String query = "{CALL get_user_by_id(?)}";
        try {
            conn = getConnection();
            call = conn.prepareCall(query);
            call.setInt(1,id);
            rs= call.executeQuery();
            while (rs.next()){
                String name = rs.getString("name");

                String email = rs.getString("email");

                String country = rs.getString("country");

                user = new User(id, name, email, country);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return user;

    }

//    new
    @Override
    public void insertUserStore(User user) throws SQLException {
        String query = "{CALL insert_user(?,?,?)}";

        try {
            conn=BaseRepository.getConnection();
            call=conn.prepareCall(query);
            call.setString(1,user.getName());
            call.setString(2,user.getEmail());
            call.setString(3,user.getCountry());
            call.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            conn.close();
        }


    }

    @Override
    public void addUserTransaction(User user, int[] permisions) {
        try {
            conn = BaseRepository.getConnection();
            conn.setAutoCommit(false);
            ps = conn.prepareStatement(INSERT_USERS_SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getCountry());
            int rowAffected = ps.executeUpdate();
            rs= ps.getGeneratedKeys();
            int userId = 0;
            if (rs.next()){
                userId = rs.getInt(1);
            }
            if (rowAffected==1){
                String sqlPivot = "INSERT INTO user_permision(users_id,permision_id) "

                        + "VALUES(?,?)";
                pstmtAssignment=conn.prepareStatement(sqlPivot);

                for (int permisionId : permisions) {

                    pstmtAssignment.setInt(1, userId);

                    pstmtAssignment.setInt(2, permisionId);

                    pstmtAssignment.executeUpdate();

                }
                conn.commit();
            }else {

                conn.rollback();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (rs != null) rs.close();

                if (ps != null) ps.close();

                if (pstmtAssignment != null) pstmtAssignment.close();

                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }



    }

    @Override
    public void insertUpdateWithoutTransaction() {

        try {
            conn=BaseRepository.getConnection();
            Statement statement = conn.createStatement();
            PreparedStatement psInsert = conn.prepareStatement(SQL_INSERT);
            PreparedStatement psUpdate = conn.prepareStatement(SQL_UPDATE);
            statement.execute(SQL_TABLE_DROP);
            statement.execute(SQL_TABLE_CREATE);

            psInsert.setString(1, "Quynh");

            psInsert.setBigDecimal(2, new BigDecimal(10));

            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));

            psInsert.execute();

            psInsert.setString(1, "Ngan");

            psInsert.setBigDecimal(2, new BigDecimal(20));

            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));

            psInsert.execute();

            psUpdate.setBigDecimal(2, new BigDecimal(999.99));

            psUpdate.setString(2, "Quynh");

            psUpdate.execute();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }


//    thực hành 4
    @Override
    public void insertUpdateUseTransaction() {
        try (Connection conn = getConnection();

             Statement statement = conn.createStatement();

             PreparedStatement psInsert = conn.prepareStatement(SQL_INSERT);

             PreparedStatement psUpdate = conn.prepareStatement(SQL_UPDATE)) {

            statement.execute(SQL_TABLE_DROP);

            statement.execute(SQL_TABLE_CREATE);

            // start transaction block

            conn.setAutoCommit(false); // default true

            // Run list of insert commands

            psInsert.setString(1, "Quynh");

            psInsert.setBigDecimal(2, new BigDecimal(10));

            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));

            psInsert.execute();



            psInsert.setString(1, "Ngan");

            psInsert.setBigDecimal(2, new BigDecimal(20));

            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));

            psInsert.execute();

            psUpdate.setBigDecimal(2, new BigDecimal(999.99));


            psUpdate.setString(2, "Quynh");

            psUpdate.execute();



            // end transaction block, commit changes

            conn.commit();

            // good practice to set it back to default true

            conn.setAutoCommit(true);



        } catch (Exception e) {

            System.out.println(e.getMessage());

            e.printStackTrace();

        }

    }

    @Override
    public List<User> procedureAllUsers() {
        String query = "{CALL get_List_Users()}";
        List<User> userList = new ArrayList<>();
        try {
            conn = BaseRepository.getConnection();
            call = conn.prepareCall(query);
            rs = call.executeQuery();
            while (rs.next()) {
                User user = new User(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getString(4));
                userList.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return userList;
    }
    //    Update  tin user từ Procedure
    @Override
    public void procedureUpdate(User user) {
        String query = "{call get_Up_Date(?,?,?,?)}";
        try {
            conn = BaseRepository.getConnection();
            call=conn.prepareCall(query);
            call.setInt(1,user.getId());
            call.setString(2,user.getName());
            call.setString(3,user.getEmail());
            call.setString(4,user.getCountry());
            System.out.println("nsnbdbd");
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    @Override
    public void procedureDelete(int id) {
        String query = "{call get_delete(?)}";
        try {
            conn = BaseRepository.getConnection();
            call=conn.prepareCall(query);
            call.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

//    chức năng delete





//    public static void main(String[] args) {
//        UserReponsitory userReponsitory = new UserReponsitory();
//        int b = userReponsitory.getCount("i");
//        System.out.println("số là +" + b);
//    }


}
