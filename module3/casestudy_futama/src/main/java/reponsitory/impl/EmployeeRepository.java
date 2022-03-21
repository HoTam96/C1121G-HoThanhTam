package reponsitory.impl;

import Dbcontext.BaseRepository;
import model.*;
import model.deto.EmployeeDeto;
import reponsitory.IEmployeeRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;


    @Override
    public List<EmployeeDeto> findAllEmployee() {
        List<EmployeeDeto> employees = new ArrayList<>();
        String query = "select position_name,education_degree_name, employee_id,division_name,e_name,day_of_birth,number_cmnd,e_salary,phone_number,e_email,e_address from employee join \n" +
                "positionn on employee.position_id = positionn.position_id\n" +
                "join division on division.division_id = employee.division_id\n" +
                "join education_degree on education_degree.education_degree_id = employee.education_degree_id";

        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                EmployeeDeto employeeDeto = new EmployeeDeto(rs.getString("e_name"), rs.getString("day_of_birth"), rs.getString("number_cmnd"),
                        rs.getString("phone_number"), rs.getString("e_email"), rs.getString("e_address"), rs.getInt("employee_id"),
                        rs.getDouble("e_salary"), rs.getString("position_name"), rs.getString("education_degree_name"), rs.getString("division_name"));
                employees.add(employeeDeto);

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
                employee = new Employee(rs.getInt("employee_id"), rs.getString("e_name"), rs.getString("day_of_birth"), rs.getString("number_cmnd"),
                        rs.getString("phone_number"), rs.getString("e_email"), rs.getString("e_address"),
                        rs.getDouble("e_salary"), employeeRepository.position(rs.getInt("position_id")),
                        employeeRepository.educationDegree(rs.getInt("education_degree_id")),
                        employeeRepository.division(rs.getInt("division_id")), employeeRepository.user(rs.getString("user_name")));

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
    public List<EmployeeDeto> search(String name) {
        List<EmployeeDeto> employees = new ArrayList<>();

        String query = "select position_name,education_degree_name, employee_id,division_name,e_name,day_of_birth,number_cmnd,e_salary,phone_number,e_email,e_address from employee\n" +
                " join  positionn on employee.position_id = positionn.position_id\n" +
                "                join division on division.division_id = employee.division_id\n" +
                "                join education_degree on education_degree.education_degree_id = employee.education_degree_id where  e_name like ? ";

        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%"+name+"%");
            rs = ps.executeQuery();
            while (rs.next()) {
                EmployeeDeto employeeDeto = new EmployeeDeto(rs.getString("e_name"), rs.getString("day_of_birth"), rs.getString("number_cmnd"),
                        rs.getString("phone_number"), rs.getString("e_email"), rs.getString("e_address"), rs.getInt("employee_id"),
                        rs.getDouble("e_salary"), rs.getString("position_name"), rs.getString("education_degree_name"), rs.getString("division_name"));
                employees.add(employeeDeto);

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
