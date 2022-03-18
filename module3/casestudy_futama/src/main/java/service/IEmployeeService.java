package service;

import model.Division;
import model.EducationDegree;
import model.Employee;
import model.Position;
import model.deto.EmployeeDeto;

import java.util.List;

public interface IEmployeeService {

    List<EmployeeDeto> findAllEmployee();

    List<Division> selectAllDivision();

    List<EducationDegree> selectAllEducation();

    List<Position> selectAllPosition();
}
