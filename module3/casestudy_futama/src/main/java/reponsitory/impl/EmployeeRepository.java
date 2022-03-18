package reponsitory.impl;

import Dbcontext.BaseRepository;
import model.Division;
import model.EducationDegree;
import model.Employee;
import model.Position;
import model.deto.EmployeeDeto;
import reponsitory.IEmployeeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public List<EmployeeDeto> findAllEmployee() {
        List<EmployeeDeto>employees=new ArrayList<>();
        String query = "select position_name,education_degree_name, employee_id,division_name,e_name,day_of_birth,number_cmnd,e_salary,phone_number,e_email,e_address from employee join \n" +
                "positionn on employee.position_id = positionn.position_id\n" +
                "join division on division.division_id = employee.division_id\n" +
                "join education_degree on education_degree.education_degree_id = employee.education_degree_id";

        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
                EmployeeDeto employeeDeto = new EmployeeDeto(rs.getString("e_name"),rs.getString("day_of_birth"),rs.getString("number_cmnd"),
                      rs.getString("phone_number"),rs.getString("e_email"),rs.getString("e_address"),rs.getInt("employee_id"),
                      rs.getDouble("e_salary"),rs.getString("position_name"),rs.getString("education_degree_name"),rs.getString("division_name"));
                employees.add(employeeDeto);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
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
        List<Division>divisionList = new ArrayList<>();
        String query = "select * from division";
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            rs=ps.executeQuery();
            while (rs.next()){
                Division division = new Division(rs.getInt(1),rs.getString(2));
                divisionList.add(division);
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

        return divisionList;
    }

    @Override
    public List<EducationDegree> selectAllEducation() {

        List<EducationDegree>educationDegreeList = new ArrayList<>();
        String query = "select * from education_degree";
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            rs=ps.executeQuery();
            while (rs.next()){
                EducationDegree degree = new EducationDegree(rs.getInt(1),rs.getString(2));
                educationDegreeList.add(degree);
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

        return educationDegreeList;
    }

    @Override
    public List<Position> selectAllPosition() {


        List<Position>positionList = new ArrayList<>();
        String query = "select * from positionn";
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            rs=ps.executeQuery();
            while (rs.next()){
                Position position = new Position(rs.getInt(1),rs.getString(2));
                positionList.add(position);
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

        return positionList;
    }


    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository();
       List<Position>employeeList= employeeRepository.selectAllPosition();
        System.out.println(employeeList);

    }

}
