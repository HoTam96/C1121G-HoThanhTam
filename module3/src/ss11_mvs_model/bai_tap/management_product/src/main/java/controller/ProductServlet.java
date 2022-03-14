package controller;

import models.Product;
import service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet",urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action){
            case "create":
                createProduct(request,response);
                break;
            case "search":
                searchProduct(request,response);
                break;
            case "edit":
                update(request,response);
                break;
            case "view":
                break;
            default:
                getProductList(response,request);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String action = request.getParameter("action");
      if(action==null){
          action="";
      }
      switch (action){
          case "delete":
              deleteProduct(request,response);
              break;
          case "edit":
              showEdit(request,response);
              break;
          case "view":
              showViewName(request,response);
              break;
          default:
              getProductList(response,request);
      }

    }
//    lấy list sản phẩm
    private void getProductList(HttpServletResponse response ,HttpServletRequest request) throws ServletException, IOException {
        ProductServiceImpl productService = new ProductServiceImpl();
        List<Product> productList = productService.getAllProduct();
        request.setAttribute("list", productList);
        request.getRequestDispatcher("HomePage.jsp").forward(request, response);

    }

    //tạo mới một sản phẩm nhé
    private void createProduct(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException {
        ProductServiceImpl productService = new ProductServiceImpl();
        int id = Integer.parseInt(request.getParameter("id"));
        Product check = productService.getProductById(id);
        if (check==null){
            String name = request.getParameter("name");
            double price = Double.parseDouble(request.getParameter("price"));
            String description = request.getParameter("description");
            String year = request.getParameter("yearOfManufacture");
            String country = request.getParameter("country");
            Product product = new Product(id,name,description,price,year,country);
            productService.create(product);
            response.sendRedirect("product");

        }else {
            String message = "id đã tồn tại";
            String name = request.getParameter("name");
            double price = Double.parseDouble(request.getParameter("price"));
            String description = request.getParameter("description");
            String year = request.getParameter("yearOfManufacture");
            String country = request.getParameter("country");
            Product product = new Product(id,name,description,price,year,country);
            request.setAttribute("product",product);
            request.setAttribute("message",message);
            request.getRequestDispatcher("Create.jsp").forward(request,response);

        }

    }
//    phương thức delete
    private void deleteProduct(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ProductServiceImpl productService = new ProductServiceImpl();
        int id = Integer.parseInt(request.getParameter("id"));
        productService.delete(id);
        response.sendRedirect("product");

    }
    private void showEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductServiceImpl productService = new ProductServiceImpl();
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.getProductById(id);
        request.setAttribute("item",product);
        request.getRequestDispatcher("Edit.jsp").forward(request,response);
    }
    private void update(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ProductServiceImpl productService = new ProductServiceImpl();
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String description = request.getParameter("description");
        String year = request.getParameter("yearOfManufacture");
        String country = request.getParameter("country");
        Product product = new Product(id,name,description,price,year,country);
        productService.update(product);
        response.sendRedirect("product");

    }
    private void searchProduct(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
        ProductServiceImpl productService = new ProductServiceImpl();
        String name = request.getParameter("search");
        List<Product>productList=productService.search(name);
        if (productList!=null){
            request.setAttribute("list", productList);
            request.getRequestDispatcher("HomePage.jsp").forward(request, response);
        }else {
            String message = "không tìm thấy tên sản phẩm";
            request.setAttribute("message",message);
            request.getRequestDispatcher("HomePage.jsp").forward(request, response);
        }




    }
    private void showViewName(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        ProductServiceImpl productService = new ProductServiceImpl();
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.getProductById(id);
        request.setAttribute("product",product);
        request.getRequestDispatcher("View.jsp").forward(request,response);

    }


}
