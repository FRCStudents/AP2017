import java.util.*;

class Elevens {
    // zero relative for next card to pull from deck
    public static int nextCard = 9;
    public static Card[] playArea = new Card[9];
    public static Deck a = new Deck();

    public static void main(String[] args) {
        boolean playing = true;

        // shuffle seven times to maximize randomness and decrease possibility of patterns
        for (int i = 0; i < 7; i++) {
            a.shuffle();
        }

        // fill playarea with first 9 cards from deck
        for (int i = 0; i < playArea.length; i++) {
            playArea[i] = a.getCard(i);
        }

        // main loop
        while (playing) {
            dispCards(playArea);
            if (!movesPossible(playArea)) {
                System.out.println("Sorry, there are no moves that are available to make. You lose!");
                System.exit(0);
            } else {
                askResponse();
            }
            nextCard++;
        }
    }

    public static void dispCards(Card[] cardArr) {
        System.out.println("*****PLAY*AREA*****");
        for(int i = 0; i < cardArr.length; i++) {
            // prints number (1 relative) and card value and suit
            System.out.println((i + 1) + ": " + cardArr[i]);
        }
        System.out.println("*******************");
    }

    public static void askResponse() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers for the cards to select, separated by spaces.");
        parseResponse(s.nextLine());
    }
    public static void parseResponse(String response) {
        // split response into array of Strings (which will be converted to ints)
        String[] sResponse = response.split(" ");
        int[] iResponse = new int[sResponse.length];
        try {
            for (int i = 0; i < sResponse.length; i++) {
                iResponse[i] = Integer.parseInt(sResponse[i]);
            }
        } catch (Exception e) {
            System.out.println("Please only type the number of the card, without any punctuation or letters.");
            askResponse();
        }

        // validate array is either 2 or 3 indexes in length
        // if this fails return to askResponse()
        if (iResponse.length == 2) {
            // if  fails the card.getValue() adding up to 11 return to askResponse and print error message
            // if passes: replace playArea[iResponse[] - 1] with next card from deck (starting at 10) then return to top of main loop
            // when nextCard > 51 put empty card in its place
            if((iResponse[0] + iResponse[1]) == 11) {
                for(int i = 0; i < 2; i++){
                    try {
                        playArea[iResponse[i] - 1] = a.getCard(nextCard);
                        nextCard++;
                    } catch (Exception e) {
                        playArea[iResponse[i] - 1] = new Card("Blank", "Blank", true);
                    }
                }
            } else {
                System.out.println("Your cards did not add up to 11. Please find a pair of cards that add up to 11.");
                askResponse();
            }
        } else if (iResponse.length == 3) {
            // if  fails the card.getValue() adding up to -3 return to askResponse and print error message
            // if passes: replace playArea[iResponse[] - 1] with next card from deck (starting at 10) then return to top of main loop
            if((iResponse[0] + iResponse[1] + iResponse[2]) == -3) {
                for(int i = 0; i < 3; i++){
                    try {
                        playArea[iResponse[i] - 1] = a.getCard(nextCard);
                        nextCard++;
                    } catch (Exception e) {
                        playArea[iResponse[i] - 1] = new Card("Blank", "Blank", true);
                    }
                }
            } else {
                System.out.println("You didn't input three face cards. Try again.");
                askResponse();
            }
        } else {
            System.out.println("Please type in either two card numbers or three card numbers (in the case of face cards).");
            askResponse();
        }
    }

    public static boolean movesPossible(Card[] cardArr) {
        int negCount = 0;
        // make sure there's a possible sum of either -3 (3 card values) or 11 (2 card values)
        for (int i = 0; i < cardArr.length; i++) {
            if (cardArr[i].getValue() == -1) {
                negCount ++;
            }
        }
        if (negCount >= 3) {
            return true;
        }

        // now this is the hard part, making sure that two or more pairs add up to 11
        for (int i = 0; i < cardArr.length; i++) {
            for (int j = i + 1; j < cardArr.length; j++) {
                if ((cardArr[i].getValue() + cardArr[j].getValue()) == 11) {
                    return true;
                }
            }
        }
        return false;
    }
}