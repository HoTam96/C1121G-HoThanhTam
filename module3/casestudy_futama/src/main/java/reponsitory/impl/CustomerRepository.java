package reponsitory.impl;

import Dbcontext.BaseRepository;
import model.customer.Customer;
import model.customer.TypeCustomer;
import reponsitory.ICustomerRepository;

import java.awt.image.AreaAveragingScaleFilter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    @Override
    public List<Customer> getAllListCustomer() {
        CustomerRepository customerRepository = new CustomerRepository();
        List<Customer> customerList = new ArrayList<>();
        String query = "select *from customer";
        Customer customer = null;
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                customer = new Customer(rs.getInt(1), customerRepository.typeCustomer(rs.getInt(2)), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9),
                        rs.getString(10));
                customerList.add(customer);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return customerList;
    }

    @Override
    public List<TypeCustomer> getListType() {
        List<TypeCustomer>list = new ArrayList<>();
        String query = "select * from type_customer";
        conn = BaseRepository.getConnection();
        try {
            ps= conn.prepareStatement(query);
            rs= ps.executeQuery();
            while (rs.next()){
                TypeCustomer typeCustomer = new TypeCustomer(rs.getInt(1),rs.getString(2));
           list.add(typeCustomer);
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


        return list;
    }

    @Override
    public void createCustomer(Customer customer) {
        String query="insert into customer values(?,?,?,?,?,?,?,?,?,?)";
        conn = BaseRepository.getConnection();
        try {
            ps= conn.prepareStatement(query);
            ps.setInt(1,customer.getId());
            ps.setInt(2,customer.getTypeCustomerId().getCustomerTypeId());
            ps.setString(3,customer.getCustomerCode());
            ps.setString(4,customer.getName());
            ps.setString(5,customer.getBirthday());
            ps.setInt(6,customer.getGender());
            ps.setString(7,customer.getIdCard());
            ps.setString(8,customer.getPhone());
            ps.setString(9,customer.getEmail());
            ps.setString(10,customer.getAddress());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
//chẹc cus tomer
    @Override
    public List<Customer> checkCustomer (Integer id, String code) {
        CustomerRepository customerRepository = new CustomerRepository();
        Customer customer = null;
        List<Customer>customerList = new ArrayList<>();
        String query = "select * from customer where customer_id =? or customer_code =? ";
        conn = BaseRepository.getConnection();
        try {
            ps= conn.prepareStatement(query);
            ps.setInt(1,id);
            ps.setString(2,code);
            rs= ps.executeQuery();
            while (rs.next()){
                customer = new Customer(rs.getInt(1), customerRepository.typeCustomer(rs.getInt(2)), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9),
                        rs.getString(10));
                customerList.add(customer);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        return customerList;
    }


//    lấy đối tượng cystomer theo id
    @Override
    public Customer getCustomerById(Integer id) {
        CustomerRepository customerRepository = new CustomerRepository();
        String query = "select * from customer where customer_id =?";
        Customer customer=null;
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1,id);
            rs= ps.executeQuery();
            while (rs.next()){
                customer = new Customer(rs.getInt(1), customerRepository.typeCustomer(rs.getInt(2)), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9),
                        rs.getString(10));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return customer;
    }

    @Override
    public void updateCustomer(Customer customer) {
        String query = "update customer \n" +
                "set type_customer_id =? , c_name=?,day_of_birth=?,sex=?,number_cmnd=?,phone_number=?,c_email=?,c_address=?\n" +
                "where customer_id = ?;";
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1,customer.getTypeCustomerId().getCustomerTypeId());
            ps.setString(2,customer.getName());
            ps.setString(3,customer.getBirthday());
            ps.setInt(4,customer.getGender());
            ps.setString(5,customer.getIdCard());
            ps.setString(6,customer.getPhone());
            ps.setString(7,customer.getEmail());
            ps.setString(8,customer.getAddress());
            ps.setInt(9,customer.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteById(Integer id) {
        String query = "delete from customer\n" +
                "where customer_id = ?;";
        try {
            conn= BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> searchByName(String name) {
        String query = "select * from customer where c_name like ?;";
        CustomerRepository customerRepository = new CustomerRepository();
        Customer customer = null;
        List<Customer>customerList = new ArrayList<>();
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%"+name+"%");
            rs = ps.executeQuery();
            while (rs.next()){

                customer = new Customer(rs.getInt(1), customerRepository.typeCustomer(rs.getInt(2)), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9),
                        rs.getString(10));
                customerList.add(customer);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customerList;
    }

    public TypeCustomer typeCustomer(int id) {
        String query = "select *from type_customer where type_customer.type_customer_id = ?;";
        TypeCustomer typeCustomer = null;
        try {
            conn = BaseRepository.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                typeCustomer = new TypeCustomer(rs.getInt(1), rs.getString(2));

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

        return typeCustomer;
    }

}
