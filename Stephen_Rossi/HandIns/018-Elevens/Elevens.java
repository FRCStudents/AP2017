public class Elevens{
    public static void main(String[] args){
        Deck newDeck = new Deck();
        for(int i = 0; i < newDeck.getLength(); i++){
            System.out.println(newDeck.getCard(i));
        }
    }
}
