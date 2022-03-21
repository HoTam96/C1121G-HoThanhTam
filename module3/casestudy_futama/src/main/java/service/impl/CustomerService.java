package service.impl;

import model.customer.Customer;
import model.customer.TypeCustomer;
import reponsitory.ICustomerRepository;
import reponsitory.impl.CustomerRepository;
import service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    ICustomerRepository iCustomerRepository = new CustomerRepository();

    @Override
    public List<Customer> getAllListCustomer() {
        return iCustomerRepository.getAllListCustomer();
    }

    @Override
    public List<TypeCustomer> getListType() {
        return iCustomerRepository.getListType();
    }

    @Override
    public void createCustomer(Customer customer) {
        iCustomerRepository.createCustomer(customer);
    }

    @Override
    public List<Customer> checkCustomer (Integer id, String code) {
        return iCustomerRepository.checkCustomer(id,code);
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return iCustomerRepository.getCustomerById(id);
    }

    @Override
    public void updateCustomer(Customer customer) {
        iCustomerRepository.updateCustomer(customer);
    }

    @Override
    public void deleteById(Integer id) {
        iCustomerRepository.deleteById(id);
    }

    @Override
    public List<Customer> searchByName(String name) {
        return iCustomerRepository.searchByName(name);
    }
}