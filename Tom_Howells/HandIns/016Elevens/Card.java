class Card {
    private String value = "";
    private char suit;
    private boolean isFaceUp;

    public Card(String v, String s) {
        value = v;
        switch (s) {
            case "Spades": suit = 's';
            case "Diamonds": suit = 'd';
            case "Clubs": suit = 'c';
            case "Hearts": suit = 'h';
        }
    }

    public Card() {
        value = "2";
        suit = ((char)'\u2764');
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }

    public String toString() {
        return value + suit;
    }
}