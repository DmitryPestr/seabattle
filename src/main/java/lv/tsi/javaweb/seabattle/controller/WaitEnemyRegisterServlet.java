package lv.tsi.javaweb.seabattle.controller;

import lv.tsi.javaweb.seabattle.model.PlayerGameContext;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "WaitEnemyRegisterServlet", urlPatterns = "/waitEnemyRegister")
public class WaitEnemyRegisterServlet extends HttpServlet {
    @Inject
    private PlayerGameContext playerGameContext;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (playerGameContext.getGame().isComplete()) {
            response.sendRedirect("shipPlacement");
        } else
            request.getRequestDispatcher("/WEB-INF/waitEnemyRegister.jsp")   //objazatelnie parametri
                .include(request, response);    //objazatelnie parametri

    }
}
