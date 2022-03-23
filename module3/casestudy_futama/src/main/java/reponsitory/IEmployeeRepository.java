package reponsitory;

import model.Division;
import model.EducationDegree;
import model.Employee;
import model.Position;

import java.util.List;

public interface IEmployeeRepository {


    List<Employee> findAllEmployee();

    List<Division> selectAllDivision();

    List<EducationDegree> selectAllEducation();

    List<Position> selectAllPosition();

    void createEployee(Employee employee);

    Employee getEmployeeById(int id);

    void delete(int id);

    List<Employee> search(String name);

    void update(Employee employee);
}
