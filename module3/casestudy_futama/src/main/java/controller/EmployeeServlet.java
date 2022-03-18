package controller;

import model.Division;
import model.EducationDegree;
import model.Employee;
import model.Position;
import model.deto.EmployeeDeto;
import service.IEmployeeService;
import service.impl.EmployeeService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", value = "/Employee")
public class EmployeeServlet extends HttpServlet {
    private IEmployeeService iEmployeeService = new EmployeeService();

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
            default:
                listEmployee(request, response);

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

                break;
            case "edit":
                break;
            default:
                listEmployee(request, response);

        }


    }

    public void listEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<EmployeeDeto> employeeList = iEmployeeService.findAllEmployee();
        request.setAttribute("list", employeeList);
        request.getRequestDispatcher("employee.jsp").forward(request, response);
    }

    public void showCreate(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Division>divisionList=iEmployeeService.selectAllDivision();

        List<EducationDegree>educationDegrees=iEmployeeService.selectAllEducation();

        List<Position>positionList=iEmployeeService.selectAllPosition();

        request.setAttribute("division",divisionList);
        request.setAttribute("education",educationDegrees);
        request.setAttribute("position",positionList);

        request.getRequestDispatcher("createEmployee.jsp").forward(request,response);
    }

    public void createEmployee(HttpServletRequest request, HttpServletResponse response) {


    }


}
