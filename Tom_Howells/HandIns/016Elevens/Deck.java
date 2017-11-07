class Deck {
    final String[] suitArr = {"Spades", "Diamonds", "Clubs", "Hearts"};
    final String[] valueArr = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    private Card[] deck = new Card[suitArr.length * valueArr.length];

    public Deck() {
        for (int i = 0; i < suitArr.length; i++) {
            for (int j = 0; j < valueArr.length; j++) {
                deck[(i * valueArr.length) + j] = new Card(valueArr[j], suitArr[i]);
            }
        }
    }

    public Card[] getDeck() {
        return deck;
    }

    public Card getCard(int idx) {
        return deck[idx];
    }
}
