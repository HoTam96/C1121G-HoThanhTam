package service;

import model.Division;
import model.EducationDegree;
import model.Employee;
import model.Position;

import java.util.List;

public interface IEmployeeService {

    List<Employee> findAllEmployee();

    List<Division> selectAllDivision();

    List<EducationDegree> selectAllEducation();

    List<Position> selectAllPosition();

    void createEployee(Employee employee);

    Employee getEmployeeById(int id);

    void delele(int id);

    List<Employee> search(String name);

    void update(Employee employee);
}
