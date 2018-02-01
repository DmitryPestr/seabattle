package lv.tsi.javaweb.seabattle.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShipPlacementServlet", urlPatterns = "/shipPlacement")

public class ShipPlacementServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String[] addresses = request.getParameterValues("addr");
        for (String a: addresses) {
            System.out.println(a);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/shipPlacement.jsp")
                .include(request, response);
    }
}
//comments
