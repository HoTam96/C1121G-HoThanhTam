package controller;

import model.service.RentType;
import model.service.Service;
import model.service.ServiceType;
import service.IService;
import service.impl.ServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServiceServlet", value = "/Service")
public class ServiceServlet extends HttpServlet {
    IService iService = new ServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreate(request, response);
                break;
            case "edit":

                break;
            case "search":

                break;
            default:
                disPlayService(request, response);
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
                CreateService(request, response);
                break;
            case "edit":

                break;
            case "delete":

                break;
            default:

        }
    }

    public void disPlayService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Service> serviceList = iService.getAllService();
        request.setAttribute("service", serviceList);
        List<ServiceType> serviceType = iService.getListServiceType();
        request.setAttribute("serviceType", serviceType);

        request.getRequestDispatcher("service.jsp").forward(request, response);

    }

    public void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<RentType> renTypeList = iService.getListRenType();
        List<ServiceType> serviceType = iService.getListServiceType();
        Integer id = Integer.parseInt(request.getParameter("id"));

        request.setAttribute("id", id);
        request.setAttribute("rentType", renTypeList);
        request.setAttribute("serviceType", serviceType);
        request.getRequestDispatcher("createService.jsp").forward(request, response);


    }

    public void CreateService(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Integer serviceId = Integer.parseInt(request.getParameter("serviceId"));
       Service service1= iService.checkId(serviceId);


        String serviceName = request.getParameter("serviceName");
        Integer area = Integer.parseInt(request.getParameter("area"));
        double rentalCost = Double.parseDouble(request.getParameter("rentalCost"));
        Integer peopleMax = Integer.parseInt(request.getParameter("peopleMax"));
        String standardRoom = request.getParameter("standardRoom");
        String description = request.getParameter("description");
        double areaPool = Double.parseDouble(request.getParameter("areaPool"));
        Integer numberFloor = Integer.parseInt(request.getParameter("numberFloor"));
        ServiceType serviceType = new ServiceType(Integer.parseInt(request.getParameter("serviceType")), null);
        RentType rentType = new RentType(Integer.parseInt(request.getParameter("rentType")), null, 2);
        Service service = new Service(serviceId, serviceName, area, rentalCost, peopleMax, rentType, serviceType, standardRoom,
                description, areaPool, numberFloor);
        iService.newCreate(service);
        response.sendRedirect("Service");

    }


}
