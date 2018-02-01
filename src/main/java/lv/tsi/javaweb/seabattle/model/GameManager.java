package lv.tsi.javaweb.seabattle.model;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GameManager {
    private Game incomplete;

    public Game register(Player player) { //zapisivaem igrokov v igru
        if (incomplete ==null) {
            incomplete = new Game ();
            incomplete.setPlayer1(player);
            return incomplete;
        } else {
            incomplete.setPlayer2(player);
            Game tmp = incomplete;
            incomplete = null;
            return tmp;
        }
    }
}
