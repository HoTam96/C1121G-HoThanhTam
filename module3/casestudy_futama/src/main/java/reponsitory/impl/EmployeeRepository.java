package reponsitory.impl;

import Dbcontext.BaseRepository;
import model.*;
import reponsitory.IEmployeeRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;


    @Override
    public List<Employee> findAllEmployee() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        List<Employee> employees = new ArrayList<>();
        String query = "select * from employee;";

        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDouble(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        employeeRepository.position(rs.getInt(9)),
                        employeeRepository.educationDegree(rs.getInt(10)),
                        employeeRepository.division(rs.getInt(11)),
                        employeeRepository.user(rs.getString(12)));
                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return employees;
    }

    @Override
    public List<Division> selectAllDivision() {
        List<Division> divisionList = new ArrayList<>();
        String query = "select * from division";
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Division division = new Division(rs.getInt(1), rs.getString(2));
                divisionList.add(division);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return divisionList;
    }

    @Override
    public List<EducationDegree> selectAllEducation() {

        List<EducationDegree> educationDegreeList = new ArrayList<>();
        String query = "select * from education_degree";
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                EducationDegree degree = new EducationDegree(rs.getInt(1), rs.getString(2));
                educationDegreeList.add(degree);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return educationDegreeList;
    }

    @Override
    public List<Position> selectAllPosition() {


        List<Position> positionList = new ArrayList<>();
        String query = "select * from positionn";
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Position position = new Position(rs.getInt(1), rs.getString(2));
                positionList.add(position);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return positionList;
    }

    @Override
    public void createEployee(Employee employee) {

        String query = "insert into employee values(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, employee.getId());
            ps.setString(2, employee.getName());
            ps.setString(3, employee.getBirthDay());
            ps.setString(4, employee.getId_card());
            ps.setDouble(5, employee.getSalary());
            ps.setString(6, employee.getPhone());
            ps.setString(7, employee.getEmail());
            ps.setString(8, employee.getAddress());
            ps.setInt(9, employee.getPositionId().getPositionId());
            ps.setInt(10, employee.getEducationDegreeId().getEducationDegreeId());
            ps.setInt(11, employee.getDivisionId().getDivisionId());
            ps.setString(12, employee.getUserName().getUserName());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    @Override
    public Employee getEmployeeById(int id) {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        Employee employee = null;
        String query = "select * from employee where employee.employee_id = ?;";

        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                employee = new Employee(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDouble(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        employeeRepository.position(rs.getInt(9)),
                        employeeRepository.educationDegree(rs.getInt(10)),
                        employeeRepository.division(rs.getInt(11)),
                        employeeRepository.user(rs.getString(12)));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return employee;
    }

    @Override
    public void delete(int id) {
        String query = "delete from employee where employee.employee_id = ?;";
        conn = BaseRepository.getConnection();
        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public List<Employee> search(String name) {
        List<Employee> employees = new ArrayList<>();
        String query = "   select * from employee where e_name like ?";
        EmployeeRepository employeeRepository = new EmployeeRepository();
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%"+name+"%");
            rs = ps.executeQuery();
            while (rs.next()) {

                Employee employee = new Employee(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDouble(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        employeeRepository.position(rs.getInt(9)),
                        employeeRepository.educationDegree(rs.getInt(10)),
                        employeeRepository.division(rs.getInt(11)),
                        employeeRepository.user(rs.getString(12)));
                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return employees;
    }

    @Override
    public void update(Employee employee) {
        String query = "update employee set e_name=? , day_of_birth=?,number_cmnd=?,e_salary=?,phone_number=?," +
                "e_email=?,e_address=?,position_id=?,education_degree_id=?,division_id=?,user_name=? where employee_id=?;";
        conn =BaseRepository.getConnection();
        try {
            ps=conn.prepareStatement(query);
            ps.setString(1,employee.getName());
            ps.setString(2,employee.getBirthDay());
            ps.setString(3,employee.getId_card());
            ps.setDouble(4,employee.getSalary());
            ps.setString(5,employee.getPhone());
            ps.setString(6,employee.getEmail());
            ps.setString(7,employee.getAddress());
            ps.setInt(8,employee.getPositionId().getPositionId());
            ps.setInt(9,employee.getEducationDegreeId().getEducationDegreeId());
            ps.setInt(10,employee.getDivisionId().getDivisionId());
            ps.setString(11,employee.getUserName().getUserName());
            ps.setInt(12,employee.getId());
            ps.executeUpdate();
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

//    lấy theo id

    public Position position(int id) {
        Position position = null;
        String query = "select * from positionn where position_id = ? ";
        conn = BaseRepository.getConnection();
        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                position = new Position(rs.getInt(1), rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return position;

    }

    //    lấy theo id
    public EducationDegree educationDegree(int id) {
        EducationDegree educationDegree = null;
        String query = "select * from education_degree where education_degree_id = ? ; ";
        conn = BaseRepository.getConnection();
        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                educationDegree = new EducationDegree(rs.getInt(1), rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return educationDegree;

    }

    // lấy theo id
    public Division division(int id) {
        Division division = null;
        String query = "select * from division where division_id = ? ;";
        conn = BaseRepository.getConnection();
        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                division = new Division(rs.getInt(1), rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return division;

    }
//lấy user theo gamil

    public User user(String users) {
        User user = null;
        String query = "select * from `user` where user_name = ?;";
        conn = BaseRepository.getConnection();
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, users);
            rs = ps.executeQuery();
            while (rs.next()) {
                user = new User(rs.getString(1), rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return user;

    }

    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        Employee employeeList = employeeRepository.getEmployeeById(2);
        System.out.println(employeeList);

    }

}
