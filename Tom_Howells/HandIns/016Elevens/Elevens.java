class Elevens {
    // instantiate global objects
    public static Deck d = new Deck(true); // shuffled deck
    public static Playarea p = new Playarea(d, 9); // 9 space playarea with first cards from d

    // main method
    public static void main(String[] args) {

        while (movesPossible()) {
            p.display();

            // prompt response
                // if two ints entered:
                    // make sure p.getCard().getValue() add up to 11
                    // if they do:
                        // replace those two in playarea from deck.getNext or whatever
                    // if they do not:
                        // say: nah those sux reenter new 
        }
    }

    // movesPossible() to see if moves are possible
    public static boolean movesPossible() {
        return true;
    }

    // 
}