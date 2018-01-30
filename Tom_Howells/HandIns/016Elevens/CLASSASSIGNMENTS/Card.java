class Card {
    // attributes
    private String suit; // "Hearts", "Spades", etc.
    private String name; // "2", "King", "Ace", "10"
    private int value; // 2, -1, 1, 10 (respectively)

    // constructor
    public Card(String s, String n, int v) {
        suit = s;
        name = n;
        value = v;
    }
    public Card() {
        suit = "Hearts";
        name = "5";
        value = 5;
    }

    // getters and setters
    public void setSuit(String s) {
        suit = s;
    }
    public String getSuit() {
        return suit;
    }
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    public void setValue(int v) {
        value = v;
    }
    public int getValue() {
        return value;
    }

    // displaySuit()
    public char displaySuit() {
        switch (suit) {
            case "Spades": return (char)'\u2660';
            case "Diamonds": return (char)'\u2666';
            case "Clubs": return (char)'\u2663';
            case "Hearts": return (char)'\u2764';
        }
        return 'N';
    }

    // isEqual()
    public boolean isEqual(Card c) {
        return ((c.getSuit().equals(suit)) && (c.getName().equals(name)) && (c.getValue() == value));
    }

    // printCard()
    public void printCard() {
        System.out.println(name + displaySuit());
    }

    // isHigher() will return true if the passed card is lower than this instantiation
    public boolean isHigher(Card c) {
        if (c.getValue() < value) {
            if ((int)c.displaySuit() < (int)this.displaySuit()) {
                return true;
            }
        }
        return false;

    }

    // toString()
    public String toString() {
        return name + " of " + suit;
    }
}