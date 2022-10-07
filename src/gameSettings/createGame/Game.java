package gameSettings.createGame;

import gameSettings.generalFunctions.WonCheck;
import gameSettings.graphics.Window;
import players.BotPlayer;
import players.CroupierPlayer;
import players.Player;
import players.RealPlayer;

/**
 * Created 01.04.2022
 *
 * @author Benedikt Huff (Benedikt Huff)
 */

public class Game {

    public static final Player[] GENERAL_PLAYERS = new Player[4];

    private static Window window;
    public static Window getWindow() {
        return window;
    }

    public static void main(String[] args) {
        window = new Window();

        GENERAL_PLAYERS[0] = new CroupierPlayer();
        GENERAL_PLAYERS[1] = new RealPlayer();
        //GENERAL_PLAYERS[2] = new BotPlayer();
        //GENERAL_PLAYERS[3] = new BotPlayer();

        for (Player generalPlayer : GENERAL_PLAYERS) {
            generalPlayer.move();
        }

        for (int i = 1; i < GENERAL_PLAYERS.length; i++) {
            System.out.println(WonCheck.check(GENERAL_PLAYERS[0], GENERAL_PLAYERS[i]));
        }
    }

    public static CroupierPlayer getCroupierPlayer() {
        return (CroupierPlayer) GENERAL_PLAYERS[0];
    }

}
