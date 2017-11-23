class Playarea {
    // attributes
    public int spaces; // track spaces in card[]
    private Card[] theArray; // the actual card[]

    // constructor (takes first s cards in deck)
    public Playarea(Deck d, int s) {
        spaces = s;
        theArray = new Card[spaces];
        for (int i = 0; i < spaces; i++) {
            theArray[i] = d.getNextCard();
        }
    }

    // replace() idx is 1 relative
    public void replace(int idx, Card newCard) {
        theArray[idx - 1] = newCard;
    }

    // display() so print idx + 1, card name, card suit, and card val
    public void display() {
        for (int i = 1; i <= theArray.length; i++) {
            System.out.println(i + ": " + theArray[i - 1]);
        }
    }

    // getCard() so that the game object can use the cards in this class
    // also idx is 1 relative
    public Card getCard(int idx) {
        return theArray[idx - 1];
    }
}