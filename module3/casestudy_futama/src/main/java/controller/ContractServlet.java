package controller;

import model.Employee;
import model.contract.Contract;
import model.customer.Customer;
import model.service.Service;
import reponsitory.impl.CustomerRepository;
import reponsitory.impl.EmployeeRepository;
import reponsitory.impl.ServiceRepository;
import service.IcontractService;
import service.impl.ContractService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContractServlet", value = "/Contract")
public class ContractServlet extends HttpServlet {
    IcontractService icontractService = new ContractService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showContract(request, response);
                break;
            case "edit":

                break;
            case "delete":

                break;
            default:
                displayAllContract(request, response);
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createContract(request, response);
                break;
            case "edit":

                break;
            case "delete":

                break;
            default:

        }


    }

    public void displayAllContract(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Contract> contractList = icontractService.getListAllContract();
        request.setAttribute("contractList", contractList);
        request.getRequestDispatcher("contract.jsp").forward(request, response);


    }

    public void showContract(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        CustomerRepository customerRepository = new CustomerRepository();
        ServiceRepository serviceRepository = new ServiceRepository();

        List<Employee> employeeList = employeeRepository.findAllEmployee();
        List<Customer> customerList = customerRepository.getAllListCustomer();
        List<Service> serviceList = serviceRepository.getAllService();

        request.setAttribute("employee", employeeList);
        request.setAttribute("customer", customerList);
        request.setAttribute("service", serviceList);
        request.getRequestDispatcher("createContract.jsp").forward(request, response);


    }

    public void createContract(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        Contract contract1 = icontractService.checkContract(id);

        String startDate = request.getParameter("startDate");
        String endDate = request.getParameter("endDate");
        double deposit = Double.parseDouble(request.getParameter("Deposit"));
        double totalMoney = Double.parseDouble(request.getParameter("totalMoney"));
        Employee employee = new Employee(Integer.parseInt(request.getParameter("employee")));
        Customer customer = new Customer(Integer.parseInt(request.getParameter("customer")));
        Service service = new Service(Integer.parseInt(request.getParameter("service")));
        Contract contract = new Contract(id, startDate, endDate, deposit, totalMoney, employee, customer, service);

        if (contract1 == null) {

            icontractService.CreateNewContract(contract);
            response.sendRedirect("Contract");


        } else if (contract1 != null) {
            EmployeeRepository employeeRepository = new EmployeeRepository();
            CustomerRepository customerRepository = new CustomerRepository();
            ServiceRepository serviceRepository = new ServiceRepository();

            List<Employee> employeeList = employeeRepository.findAllEmployee();
            List<Customer> customerList = customerRepository.getAllListCustomer();
            List<Service> serviceList = serviceRepository.getAllService();
            request.setAttribute("id", id);
            request.setAttribute("startDate", startDate);
            request.setAttribute("endDate", endDate);
            request.setAttribute("deposit", deposit);
            request.setAttribute("totalMoney", totalMoney);
            request.setAttribute("employee1", employee);
            request.setAttribute("customer1", customer);
            request.setAttribute("service1", service);
            request.setAttribute("message", "id đã tồn tại");


            request.setAttribute("employee", employeeList);
            request.setAttribute("customer", customerList);
            request.setAttribute("service", serviceList);

            request.getRequestDispatcher("createContract.jsp").forward(request, response);

        }


    }


}
