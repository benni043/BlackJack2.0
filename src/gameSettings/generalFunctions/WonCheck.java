package gameSettings.generalFunctions;

import players.Player;

/**
 * Created 01.04.2022
 *
 * @author Benedikt Huff (Benedikt Huff)
 */
public class WonCheck {

    public static boolean check(Player croupierCard, Player playerCard) {
        if(playerCard.getCardValue() > 21) {
            return false;
        } else if(croupierCard.getCardValue() > 21) {
            return true;
        } else return playerCard.getCardValue() > croupierCard.getCardValue();
    }
}
