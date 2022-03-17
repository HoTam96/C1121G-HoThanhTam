package reposotory;

import Dbcontext.BaseRepository;
import model.User;

import javax.jws.soap.SOAPBinding;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static Dbcontext.BaseRepository.getConnection;

public class UserReponsitory implements IUserReponsitory {
    private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?";
    //        private static final String INSERT_USERS_SQL = "INSERT INTO users (name, email, country) VALUES (?, ?, ?)";

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

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

    public static void main(String[] args) {
        UserReponsitory userReponsitory = new UserReponsitory();
        int b = userReponsitory.getCount("i");
        System.out.println("số là +" + b);
    }


}
