package reponsitory.impl;

import Dbcontext.BaseRepository;
import model.contract.Contract;
import reponsitory.IContractRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractRepository implements IContractRepository {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public List<Contract> getListAllContract() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        CustomerRepository customerRepository = new CustomerRepository();
        ServiceRepository serviceRepository = new ServiceRepository();
        List<Contract> contractList = new ArrayList<>();
        String query = "select * from contract ";
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Contract contract = new Contract(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getDouble(4), rs.getDouble(5), employeeRepository.getEmployeeById(rs.getInt(6)),
                        customerRepository.getCustomerById(rs.getInt(7)), serviceRepository.checkId(rs.getInt(8)));
                contractList.add(contract);
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


        return contractList;
    }

    @Override
    public Contract checkContract(Integer id) {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        CustomerRepository customerRepository = new CustomerRepository();
        ServiceRepository serviceRepository = new ServiceRepository();
        String query = "select * from contract where contract_id =?;";
        conn = BaseRepository.getConnection();
        Contract contract = null;
        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            while (rs.next()){
                contract = new Contract(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getDouble(4), rs.getDouble(5), employeeRepository.getEmployeeById(rs.getInt(6)),
                        customerRepository.getCustomerById(rs.getInt(7)), serviceRepository.checkId(rs.getInt(8)));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

return contract;
    }

    @Override
    public void createContract(Contract contract) {
        String query = "   insert into contract values (?,?,?,?,?,?,?,?)";
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1,contract.getContractId());
            ps.setString(2,contract.getStartDate());
            ps.setString(3,contract.getEndDate());
           ps.setDouble(4,contract.getContractDeposit());
           ps.setDouble(5,contract.getTotalMoney());
           ps.setInt(6,contract.getEmployeeId().getId());
           ps.setInt(7,contract.getCustomerId().getId());
           ps.setInt(8,contract.getServiceId().getServiceId());
           ps.executeUpdate();

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


//    public Employee getEmployeeById(int id){
//        EmployeeRepository employeeRepository = new EmployeeRepository();
//        String query = "select * from employee where employee_id = ?;";
//        conn = BaseRepository.getConnection();
//        try {
//            ps = conn.prepareStatement(query);
//            ps.setInt(1,id);
//            rs = ps.executeQuery();
//            while (rs.next()){
//
//
//
//
//            }
//
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//return null;
//    }


}
