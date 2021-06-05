import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/get-info")
public class ServletClass extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        double x = Double.parseDouble(request.getParameter("x"));
        double a = Double.parseDouble(request.getParameter("a"));
        double b = Double.parseDouble(request.getParameter("b"));

        //sh(x)
        x = Math.toRadians(x);
        x = Math.sinh(x);

        //a-b
        a -= b;

        //out
        out.println("sh(x) = " + x + "<br>");
        out.println("a-b = " + a + "<br>");
    }
}