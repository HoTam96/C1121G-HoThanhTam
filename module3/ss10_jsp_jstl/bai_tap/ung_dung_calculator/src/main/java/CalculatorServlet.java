import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@javax.servlet.annotation.WebServlet(name = "CalculatorServlet",urlPatterns = "/calculator")
public class CalculatorServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
double firstOperand =Double.parseDouble( request.getParameter("firstOperand"));
String operand = request.getParameter("calculate");
double secondOperand =Double.parseDouble(request.getParameter("secondOperand"));
double result = 0;


switch (operand){
    case "+":
        result = firstOperand+secondOperand ;
        break;
    case "-":
        result = firstOperand-secondOperand ;
        break;
    case "*":
        result = firstOperand*secondOperand ;
        break;
    case "/":
        try {
            result = firstOperand/secondOperand;
        }catch (Exception e){
            PrintWriter writer = response.getWriter();
            writer.println("<html>");
            writer.println("<h1>Result:</h1>");
            writer.println("Error: " + "không chia được cho 0");
            writer.println("</html>");
        }

        break;
    default:
        System.out.println("không tìm thấy");

}
request.setAttribute("rs",result);
request.getRequestDispatcher("calculator.jsp").forward(request,response);


    }
}
