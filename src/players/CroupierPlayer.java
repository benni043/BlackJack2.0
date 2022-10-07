package players;

import enums.Card;


public class CroupierPlayer extends Player {


    public CroupierPlayer() {
        super();
    }

    public void croupierRules() {
        while (super.getCardValue() <= 17) {
            Card newCard = super.getNewCard();
            addCardToList(newCard);
        }
    }

    @Override
    public void move() {
        croupierRules();

        System.out.println("--- Dealer ---");

        System.out.println(getCards().get(0));
        System.out.println(getValueOfCard(getCards().get(0)));
        System.out.println(getCards());
        System.out.println(getCardValue());

        System.out.println("--- Dealer ---");

        System.out.println();
    }
}