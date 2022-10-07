package enums;

import java.util.Random;

public class RandomEnum {

    public static Card randomEnumCard() {
        Card[] values = Card.values();
        return values[new Random().nextInt(values.length)];
    }
}