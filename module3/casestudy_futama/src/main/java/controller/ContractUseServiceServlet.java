package controller;

import model.DTO.ContractUserServiceDTO;
import service.IContractUseService;
import service.impl.ContracUseService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContractUseServiceServlet", value = "/ContractUseService")
public class ContractUseServiceServlet extends HttpServlet {
    IContractUseService iContractUseService = new ContracUseService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":

                break;
            case "edit":

                break;
            case "delete":

                break;
            default:
                getAllContractUseService(request, response);
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
            case "delete":

                break;
            default:

        }

    }

    private void getAllContractUseService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ContractUserServiceDTO> contractUserServiceList = iContractUseService.getAllContractUseService();
        request.setAttribute("list", contractUserServiceList);
        request.getRequestDispatcher("contractUseService.jsp").forward(request, response);
    }
}
