package lv.tsi.javaweb.seabattle;

import lv.tsi.javaweb.seabattle.model.Player;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("player-name");
        Player player = new Player();
        player.setName(name);

        response.sendRedirect("waitEnemyRegister");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/WEB-INF/register.jsp")   //objazatelnie parametri
                .include(request, response);    //objazatelnie parametri

    }
}
