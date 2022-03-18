package service.impl;

import model.Division;
import model.EducationDegree;
import model.Employee;
import model.Position;
import model.deto.EmployeeDeto;
import reponsitory.IEmployeeRepository;
import reponsitory.impl.EmployeeRepository;
import service.IEmployeeService;

import java.util.List;

public class
EmployeeService implements service.IEmployeeService {
    private IEmployeeRepository iEmployeeRepository = new EmployeeRepository();
    @Override
    public List<EmployeeDeto> findAllEmployee() {
        return iEmployeeRepository.findAllEmployee();
    }

    @Override
    public List<Division> selectAllDivision() {
        return iEmployeeRepository.selectAllDivision();
    }

    @Override
    public List<EducationDegree> selectAllEducation() {
        return iEmployeeRepository.selectAllEducation();
    }

    @Override
    public List<Position> selectAllPosition() {
        return iEmployeeRepository.selectAllPosition();
    }
}
