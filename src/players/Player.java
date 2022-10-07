package players;

import enums.Card;
import enums.RandomEnum;

import java.util.ArrayList;

public abstract class Player {

    private final ArrayList<Card> cards = new ArrayList<>();
    private int cardValue;

    public ArrayList<Card> getCards() {
        return cards;
    }
    public int getCardValue() {
        return cardValue;
    }

    public void addCardToList(Card card) {
        cards.add(card);
        increaseCardValue(card);
    }

    public void increaseCardValue(Card card) {
        this.cardValue += cardCount(card);
    }

    public int getValueOfCard(Card card) {
        return cardCount(card);
    }

    public Card getNewCard() {
        return RandomEnum.randomEnumCard();
    }

    public abstract void move();

    public static int cardCount(Card randomEnum) {
        int cardValue = 0;

        switch (randomEnum) {
            case CLUB_TWO, SPADE_TWO, HEART_TWO, DIAMOND_TWO -> cardValue += 2;
            case CLUB_THREE, SPADE_THREE, HEART_THREE, DIAMOND_THREE -> cardValue += 3;
            case CLUB_FOUR, SPADE_FOUR, HEART_FOUR, DIAMOND_FOUR -> cardValue += 4;
            case CLUB_FIVE, SPADE_FIVE, HEART_FIVE, DIAMOND_FIVE -> cardValue += 5;
            case CLUB_SIX, SPADE_SIX, HEART_SIX, DIAMOND_SIX -> cardValue += 6;
            case CLUB_SEVEN, SPADE_SEVEN, HEART_SEVEN, DIAMOND_SEVEN -> cardValue += 7;
            case CLUB_EIGHT, SPADE_EIGHT, HEART_EIGHT, DIAMOND_EIGHT -> cardValue += 8;
            case CLUB_NINE, SPADE_NINE, HEART_NINE, DIAMOND_NINE -> cardValue += 9;

            case CLUB_TEN, SPADE_TEN, HEART_TEN, DIAMOND_TEN,
                    CLUB_JACK, SPADE_JACK, HEART_JACK, DIAMOND_JACK,
                    CLUB_QUEEN, SPADE_QUEEN, HEART_QUEEN, DIAMOND_QUEEN,
                    CLUB_KING, SPADE_KING, HEART_KING, DIAMOND_KING -> cardValue += 10;

            case CLUB_ACE, SPADE_ACE, HEART_ACE, DIAMOND_ACE -> cardValue += 11;
        }

        return cardValue;
    }

}