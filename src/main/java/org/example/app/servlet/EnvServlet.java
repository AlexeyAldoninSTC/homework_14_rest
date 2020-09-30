package org.example.app.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.app.bean.EnvironmentEjb;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "environment", urlPatterns = "/environment1")
public class EnvServlet extends HttpServlet {

    @EJB
    EnvironmentEjb environmentEjb;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Map<String, String> variables = environmentEjb.getEnvironmentVars();
        request.setAttribute("variables", variables);
        //response.getWriter().write(environmentEjb.getEnvironmentVars().toString());
        request.getRequestDispatcher("/environment.jsp").forward(request, response);
        ObjectMapper mapper = new ObjectMapper();
        String valueAsString = mapper.writeValueAsString(variables);

    }
}
