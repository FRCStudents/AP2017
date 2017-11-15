import java.util.*;

class Card {
    // attributes
    private String suit; // "Hearts", "Spades", etc.
    private String name; // "2", "King", "Ace", "10"
    private int value; // 2, -1, 1, 10 (respectively)
    private boolean empty;

    // constructor
    public Card(String s, String n, int v, boolean e) {
        suit = s;
        name = n;
        value = v;
        empty = e;
    }
    public Card() {
        suit = "Hearts";
        name = "5";
        value = 5;
        empty = false;
    }

    // getValue()
    public int getValue() {
        return value;
    }

    // toString()
    public String toString() {
        if (!empty) {
            return name + " of " + suit;
        } else {
            return "Empty";
        }
    }
}