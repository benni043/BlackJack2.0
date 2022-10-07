package players;

import enums.Card;
import gameSettings.createGame.Game;

public class BotPlayer extends Player {

    public BotPlayer() {
        super();
    }

    public void botRules(Card firstCard) {
        addCardToList(super.getNewCard());
        addCardToList(super.getNewCard());
        while (hit(firstCard)) {
            super.addCardToList(super.getNewCard());
        }
    }

    private boolean hit(Card firstDealersCard) {
        switch (super.getCardValue()) {
            case 4, 5, 6, 7, 8, 9, 10, 11 -> {
                return true;
            }
            case 12 -> {
                switch (firstDealersCard) {
                    case CLUB_TWO, SPADE_TWO, HEART_TWO, DIAMOND_TWO, CLUB_THREE, SPADE_THREE, HEART_THREE, DIAMOND_THREE, CLUB_ACE, SPADE_ACE, HEART_ACE, DIAMOND_ACE, CLUB_TEN, SPADE_TEN, HEART_TEN, DIAMOND_TEN, CLUB_JACK, SPADE_JACK, HEART_JACK, DIAMOND_JACK, CLUB_QUEEN, SPADE_QUEEN, HEART_QUEEN, DIAMOND_QUEEN, CLUB_KING, SPADE_KING, HEART_KING, DIAMOND_KING, CLUB_NINE, SPADE_NINE, HEART_NINE, DIAMOND_NINE, CLUB_SEVEN, SPADE_SEVEN, HEART_SEVEN, DIAMOND_SEVEN, CLUB_EIGHT, SPADE_EIGHT, HEART_EIGHT, DIAMOND_EIGHT -> {
                        return true;
                    }
                    case CLUB_FOUR, SPADE_FOUR, HEART_FOUR, DIAMOND_FOUR, CLUB_FIVE, SPADE_FIVE, HEART_FIVE, DIAMOND_FIVE, CLUB_SIX, SPADE_SIX, HEART_SIX, DIAMOND_SIX -> {
                        return false;
                    }

                }
            }
            case 13, 14, 15, 16 -> {
                switch (firstDealersCard) {
                    case CLUB_ACE, SPADE_ACE, HEART_ACE, DIAMOND_ACE, CLUB_TEN, SPADE_TEN, HEART_TEN, DIAMOND_TEN, CLUB_JACK, SPADE_JACK, HEART_JACK, DIAMOND_JACK, CLUB_QUEEN, SPADE_QUEEN, HEART_QUEEN, DIAMOND_QUEEN, CLUB_KING, SPADE_KING, HEART_KING, DIAMOND_KING, CLUB_NINE, SPADE_NINE, HEART_NINE, DIAMOND_NINE, CLUB_SEVEN, SPADE_SEVEN, HEART_SEVEN, DIAMOND_SEVEN, CLUB_EIGHT, SPADE_EIGHT, HEART_EIGHT, DIAMOND_EIGHT -> {
                        return true;
                    }
                    case CLUB_TWO, SPADE_TWO, HEART_TWO, DIAMOND_TWO, CLUB_THREE, SPADE_THREE, HEART_THREE, DIAMOND_THREE, CLUB_FOUR, SPADE_FOUR, HEART_FOUR, DIAMOND_FOUR, CLUB_FIVE, SPADE_FIVE, HEART_FIVE, DIAMOND_FIVE, CLUB_SIX, SPADE_SIX, HEART_SIX, DIAMOND_SIX -> {
                        return false;
                    }
                }
            }
            default -> {
                return false;
            }
        }
        return false;
    }

    @Override
    public void move() {
        botRules(Game.getCroupierPlayer().getCards().get(0));

        System.out.println("--- Bot ---");

        System.out.println(getCards().get(0) + " " + getCards().get(1));
        System.out.println(getValueOfCard(getCards().get(0)) + getValueOfCard(getCards().get(1)));
        System.out.println(getCards());
        System.out.println(getCardValue());

        System.out.println("--- Bot ---");
        System.out.println();
    }
}
