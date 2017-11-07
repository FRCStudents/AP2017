class Card {
    private String value = "";
    private char suit;
    private boolean isFaceUp;

    public Card(String v, String s) {
        value = v;
        switch (s) {
            case "Spades":
                suit = 's';
                break;
            case "Diamonds":
                suit = 'd';
                break;
            case "Clubs":
                suit = 'c';
                break;
            case "Hearts":
                suit = 'h';
                break;
            default:
                suit = 'x';
                break;
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
