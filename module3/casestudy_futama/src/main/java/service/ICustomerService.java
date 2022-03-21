package service;

import model.customer.Customer;
import model.customer.TypeCustomer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAllListCustomer();

    List<TypeCustomer> getListType();

    void createCustomer(Customer customer);

    List<Customer> checkCustomer (Integer id, String code);

    Customer getCustomerById(Integer id);

    void updateCustomer(Customer customer);

    void deleteById(Integer id);

    List<Customer> searchByName(String name);
}
