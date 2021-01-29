package es.ulpgc.dis;

import java.util.Objects;

public class Card {
    private String suit;
    private String value;

    public Card(String value, String suit) {
        this.suit = value;
        this.value = suit;
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }


    public boolean equals(Card o) {
        if(o.getValue().equals(getValue()))
            if(o.getSuit().equals(getSuit()))
                return true;
        return false;
    }
}
