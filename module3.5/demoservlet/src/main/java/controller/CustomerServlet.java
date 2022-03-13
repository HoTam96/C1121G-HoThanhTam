package controller;

import dao.CustomerService;
import model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String action = request.getServletPath();
switch (action){
    case "/create":
        createCustomer(request,response);
        break;
    case "/update":
        updateCustomer(request,response);
        break;
}




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();

        switch (action) {
            case "/new":
                showNewForm(request,response);
                break;
            case "/delete":
                deleteCustomer(request,response);
                break;
            case "/edit":
                showEditForm(request,response);
                break;
            default:
                listCustomer(request, response);
                break;
        }


    }

//    viết phương thức để lấy dữ liệu từ trang list

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = CustomerService.getAllCustomer();
        request.setAttribute("list", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/index.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }


    }
    private  void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        CustomerService.delete(id);
       response.sendRedirect("/");

    }
//    viết phương thức hiển thị trang thêm mới cưstomer

    private void showNewForm(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("customer/newCustomer.jsp").forward(request,response);

    }

//    phương thức thêm mới
    private void createCustomer(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException {

        int id = Integer.parseInt(request.getParameter("id"));
        Customer customers = CustomerService.getCustomer(id);
        if (customers==null){
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");

            Customer customer = new Customer(id,name,phone,email);
            CustomerService.addCustomer(customer);
            response.sendRedirect("/");

        }else {
            String message ="id đã tồn tại" ;
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            Customer customer = new Customer(id,name,phone,email);
            request.setAttribute("message", message);
            request.setAttribute("customer",customer);
            request.getRequestDispatcher("customer/newCustomer.jsp").forward(request,response);

        }

    }
//    phương thức edit
    private void showEditForm(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customerEdit = CustomerService.getCustomer(id);
        request.setAttribute("customer", customerEdit);
        request.getRequestDispatcher("customer/editCustomer.jsp").forward(request,response);

    }

    public void updateCustomer(HttpServletRequest request , HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        Customer customer = new Customer(id,name,phone,email);
        CustomerService.updateCustomer(customer);
        response.sendRedirect("/");

    }



}
