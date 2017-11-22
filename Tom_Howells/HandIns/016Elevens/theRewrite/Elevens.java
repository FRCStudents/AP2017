class Elevens {
    // instantiate global objects
    public static Deck d = new Deck(true); // shuffled deck
    public static Playarea p = new Playarea(d, 9); // 9 space playarea with first cards from d

    // main method
    public static void main(String[] args) {

        while (movesPossible()) {
            p.display();

            // prompt response

            // analyze response (pass response from prompt response)
                // if two ints entered:
                    // make sure p.getCard().getValue() add up to 11
                    // if they do:
                        // replace those two in playarea from deck.getNext or whatever
                        // return to top of while loop
                    // if they do not:
                        // say: nah those sux reenter new ints
                        // reprompt response
                // if three ints entered:
                    // make sure p.getCard().getValue() add up to -3
                    // if they do:
                        // replace those three in playarea from deck.getNext or whatever
                        // return to top of while loop
                    // if they do not:
                        // say: nah those sux reenter new ints
                        // reprompt response
                // else
                    // say nah those sux make sure you reenter two or three ints
                    // reprompt response
        }
    }

    // movesPossible() to see if moves are possible
    public static boolean movesPossible() {
        int negCount = 0;
        // make sure there's a possible sum of either -3 (3 card values) or 11 (2 card values)
        for (int i = 0; i < p.length(); i++) {
            if (p.getCard(i + 1).getValue() == -1) {
                negCount ++;
            }
        }
        if (negCount >= 3) {
            return true;
        }

        // now this is the hard part, making sure that two or more pairs add up to 11
        for (int i = 0; i < p.length(); i++) {
            for (int j = i + 1; j < p.length(); j++) {
                if ((p.getCard(i + 1).getValue() + p.getCard(j + 1).getValue()) == 11) {
                    return true;
                }
            }
        }
        return false;

    }

    public static void promptResponse() {
        
    }

    public static void analyzeResponse(int[] response) {

    }
}