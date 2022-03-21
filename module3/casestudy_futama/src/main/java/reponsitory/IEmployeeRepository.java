package reponsitory;

import model.Division;
import model.EducationDegree;
import model.Employee;
import model.Position;
import model.deto.EmployeeDeto;

import java.util.List;

public interface IEmployeeRepository {


    List<EmployeeDeto> findAllEmployee();

    List<Division> selectAllDivision();

    List<EducationDegree> selectAllEducation();

    List<Position> selectAllPosition();

    void createEployee(Employee employee);

    Employee getEmployeeById(int id);

    void delete(int id);

    List<EmployeeDeto> search(String name);
}
