package controller;

import model.contract.AttachService;
import model.contract.Contract;
import model.contract.ContractDetail;
import service.IContractDetailService;
import service.IcontractService;
import service.impl.ContractDetailService;
import service.impl.ContractService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "contractDetailServlet", value = "/Detail")
public class contractDetailServlet extends HttpServlet {
    IContractDetailService iContractDetailService = new ContractDetailService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
showContractDetail(request,response);
                break;
            case "edit":

                break;
            case "delete":

                break;
            default:
                displayContractDetail(request, response);
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
                insertDetail(request,response);
                break;
            case "edit":

                break;
            case "delete":

                break;
            default:

        }


    }

    private void displayContractDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ContractDetail> contractDetailList = iContractDetailService.getListAll();
        request.setAttribute("detailList", contractDetailList);
        request.getRequestDispatcher("contractDetail.jsp").forward(request, response);

    }
    private void showContractDetail(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        IcontractService icontractService = new ContractService();
        List<AttachService> list = iContractDetailService.getListAttach();
        List<Contract>contractList=icontractService.getListAllContract();
        request.setAttribute("listAttach", list);
        request.setAttribute("list",contractList);
        request.getRequestDispatcher("createContractDetail.jsp").forward(request,response);

    }
    private void insertDetail(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Contract contract = new Contract(Integer.parseInt(request.getParameter("contractId")));
        AttachService attachService = new AttachService(Integer.parseInt(request.getParameter("Attach")));
        Integer quantity= Integer.parseInt(request.getParameter("quantity"));
        ContractDetail contractDetail = new ContractDetail(contract,attachService,quantity);
        iContractDetailService.insertInto(contractDetail);
        response.sendRedirect("Detail");


    }
}
