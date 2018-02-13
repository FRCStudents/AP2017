public class Deck{
        Card[] Deck = new Card[52];

        public static final String[] Suits = {"Spades"; "Clubs"; "Hearts"; "Diamonds";};
        public static final String[] Values = ("Aces"; "2"; "3"; "4"; "5"; "6"; "7"; "8"; "9"; "10"; "Jacks"; "Queens"; "Kings");
        
        for (i = 0; i < Deck.length; i++){
                Deck[i] = i + 1;
        }

}