package org.itstep.mywebapp.web;

import org.itstep.mywebapp.model.Pet;
import org.itstep.mywebapp.service.PetServiceImpl;
import org.itstep.mywebapp.service.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/pets")
public class PetServlet extends HttpServlet{
    private Service service = new PetServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        System.out.println(action);
        if (action != null) {
            Integer id = Integer.valueOf(req.getParameter("id"));
            service.delete(id);
            resp.sendRedirect("pets");
        } else {
            List<Pet> petList = service.getAll();
            req.setAttribute("petList", petList);
            req.getRequestDispatcher("/petList.jsp").forward(req, resp);
        }
    }

}
