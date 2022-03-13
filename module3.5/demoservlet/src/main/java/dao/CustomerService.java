package dao;

import model.Customer;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService {
    private static final Map<Integer, Customer> listCustomer = new HashMap<>();

    static {

        initCustomer();
    }

    private static void initCustomer() {
        Customer customer1 = new Customer(1, "Hồ thanh tâm", "0788040896", "hotam196@gmail.com");
        Customer customer2 = new Customer(2, "Đoàn phước trung", "01202671270", "trung96@gmail.com");
        Customer customer3 = new Customer(3, "Nguyễn Thanh Hưng", "0782356125", "hung196@gmail.com");
        Customer customer4 = new Customer(4, "Trần văn công", "0788573256", "cong96@gmail.com");
        listCustomer.put(customer1.getId(), customer1);
        listCustomer.put(customer2.getId(), customer2);
        listCustomer.put(customer3.getId(), customer3);
        listCustomer.put(customer4.getId(), customer4);

    }
//    viết phương thức xử lý customer theo id;


    public static Customer getCustomer(int customerId) {
        return listCustomer.get(customerId);

    }

    public static void addCustomer(Customer customer) {
        listCustomer.put(customer.getId(), customer);
    }
//viết phương thức update;

    public static void updateCustomer(Customer customer) {
        listCustomer.put(customer.getId(), customer);
    }
//   phương thức xóa

    public static void delete(int customerId) {
        listCustomer.remove(customerId);

    }

    public static List<Customer> getAllCustomer() {
        List<Customer> customerArrayList = new ArrayList<>(listCustomer.values());

        return customerArrayList;

    }

}
