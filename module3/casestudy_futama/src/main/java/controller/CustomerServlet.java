package controller;

import model.customer.Customer;
import model.customer.TypeCustomer;
import service.ICustomerService;
import service.impl.CustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/Customer")
public class CustomerServlet extends HttpServlet {
    ICustomerService icustomerService = new CustomerService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreate(request, response);
                break;
            case "edit":
                showEdit(request, response);
                break;
            case "search":
                searchByName(request,response);
                break;
            default:
                getListCustomer(request, response);


        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createCustomer(request, response);
                break;
            case "edit":
                update(request, response);
                break;
            case "delete":
                delete(request, response);
                break;
            default:
                getListCustomer(request, response);
        }
    }


    public void getListCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = icustomerService.getAllListCustomer();
        request.setAttribute("listCustomer", customerList);
        request.getRequestDispatcher("customer.jsp").forward(request, response);

    }

    public void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<TypeCustomer> customerList = icustomerService.getListType();
        request.setAttribute("typeCustomer", customerList);
        request.getRequestDispatcher("createCustomer.jsp").forward(request, response);

    }

    public void createCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
      request.setCharacterEncoding("UTF-8");
      response.setCharacterEncoding("UTF-8");
        Integer id = Integer.parseInt(request.getParameter("id"));
        String code = request.getParameter("code");
        TypeCustomer typeCustomer = new TypeCustomer(Integer.parseInt(request.getParameter("typeCustomer")), null);
        String name = request.getParameter("name");
        String birthDay = request.getParameter("birthDay");
        Integer gender = Integer.parseInt(request.getParameter("gender"));
        String idCard = request.getParameter("idCard");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        List<Customer> customerList = icustomerService.checkCustomer(id, code);
        if (!customerList.isEmpty()) {
            for (Customer element : customerList) {
                if (element.getId() == id) {
                    String message = "Id đã tồn tại";
                    request.setAttribute("code", code);
                    request.setAttribute("typeCustomer1", typeCustomer);
                    request.setAttribute("name", name);
                    request.setAttribute("birthDay", birthDay);
                    request.setAttribute("gender", gender);
                    request.setAttribute("phone", phone);
                    request.setAttribute("email", email);
                    request.setAttribute("address", address);
                    request.setAttribute("idCard", idCard);
                    request.setAttribute("message1", message);
                    List<TypeCustomer> customerList1 = icustomerService.getListType();
                    request.setAttribute("typeCustomer", customerList1);
                    customerList = new ArrayList<>();
                    request.getRequestDispatcher("createCustomer.jsp").forward(request, response);

                } else if (element.getCustomerCode().equals(code)) {
                    customerList = new ArrayList<>();
                    String message = "code đã tồn tại";
                    request.setAttribute("id", id);
                    request.setAttribute("typeCustomer1", typeCustomer);
                    request.setAttribute("name", name);
                    request.setAttribute("birthDay", birthDay);
                    request.setAttribute("gender", gender);
                    request.setAttribute("phone", phone);
                    request.setAttribute("email", email);
                    request.setAttribute("address", address);
                    request.setAttribute("idCard", idCard);
                    request.setAttribute("message2", message);
                    List<TypeCustomer> customerList1 = icustomerService.getListType();
                    request.setAttribute("typeCustomer", customerList1);
                    customerList = new ArrayList<>();
                    request.getRequestDispatcher("createCustomer.jsp").forward(request, response);

                }
            }
        } else if (customerList.isEmpty()) {
            Customer customer = new Customer(id, typeCustomer, code, name, birthDay, gender, idCard, phone, email, address);
            icustomerService.createCustomer(customer);
            response.sendRedirect("Customer");
        }

    }

    public void showEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        Customer customer = icustomerService.getCustomerById(id);
        List<TypeCustomer> customerList1 = icustomerService.getListType();
        request.setAttribute("typeCustomer", customerList1);
        request.setAttribute("customer", customer);
        request.getRequestDispatcher("editCustomer.jsp").forward(request, response);


    }

    public void update(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Integer id = Integer.parseInt(request.getParameter("id"));
        String code = request.getParameter("code");
        TypeCustomer typeCustomer = new TypeCustomer(Integer.parseInt(request.getParameter("typeCustomer")), null);
        String name = request.getParameter("name");
        String birthDay = request.getParameter("birthDay");
        Integer gender = Integer.parseInt(request.getParameter("gender"));
        String idCard = request.getParameter("idCard");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");

        Customer customer = new Customer(id, typeCustomer, code, name, birthDay, gender, idCard, phone, email, address);
        icustomerService.updateCustomer(customer);
        response.sendRedirect("Customer");

    }

    //    xóa 1 khách hàng
    public void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        icustomerService.deleteById(id);
        response.sendRedirect("Customer");

    }
    public void searchByName(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("search");
        List<Customer>customerList=icustomerService.searchByName(name);
        request.setAttribute("listCustomer", customerList);
        request.getRequestDispatcher("customer.jsp").forward(request, response);
        
    }

}
