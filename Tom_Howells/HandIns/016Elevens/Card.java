import java.util.*;

class Card {
    private String value = "";
    private String suit;
    private boolean isFaceUp;

    public Card(String v, String s, boolean f) {
        value = v;
        suit = s;
        isFaceUp = f;
    }

    public Card() {
        value = "2";
        suit = "Hearts";
        isFaceUp = true;
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }

    public String toString() {
        if(isFaceUp){
            return value + suit;
        } else {
            return "Facedown";
        }
    }

    // used to get the actual value of the card (like if its a 2 or 5)
    // returns -1 if it's a king, queen, or jack
    // aces are 1 in elevens
    public int getValue() {
        try {
            return Integer.parseInt(value);
        } catch (Exception e){
            if(value.equals("Ace")){
                return 1;
            } else {
                return -1;
            }
        }
    }
}