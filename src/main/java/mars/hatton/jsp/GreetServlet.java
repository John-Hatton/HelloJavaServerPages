package mars.hatton.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/greet")
public class GreetServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        // Get the name parameter from the request
//        String name = request.getParameter("name");
//
//        // Set the name attribute in the request scope
//        request.setAttribute("name", name);
//
//        // Forward the request to the JSP page
//        request.getRequestDispatcher("/greeting.jsp").forward(request, response);
//    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the name parameter from the request
        String name = request.getParameter("name");

        // Check if the name parameter is null or empty
        if (name == null || name.isEmpty()) {
            // If no name is provided, redirect back to the index page
            response.sendRedirect(request.getContextPath() + "/index.jsp");
            return;
        }

        // Set the name attribute in the request scope
        request.setAttribute("name", name);

        // Forward the request to the greeting JSP page
        request.getRequestDispatcher("/greeting.jsp").forward(request, response);
    }

}