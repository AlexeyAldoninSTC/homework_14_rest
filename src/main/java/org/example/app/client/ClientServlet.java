package org.example.app.client;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/vars")
public class ClientServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EnvironmentClient client = new EnvironmentClient();
        Map<String, String> vars = client.call();
        request.setAttribute("variables", vars);
        //response.sendRedirect();
        //request.getRequestDispatcher("/variables.xhtml").forward(request, response);
        request.getRequestDispatcher("/environment.jsp").forward(request, response);
    }
}
