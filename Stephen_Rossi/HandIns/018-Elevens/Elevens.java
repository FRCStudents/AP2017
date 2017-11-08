public class Elevens{
    Deck newDeck = new Deck();
    public static void main(String[] args){
        for(int i = 0; i < newDeck.getLength(); i++){
            System.out.println(newDeck.getCard(i));
        }
        
    }
}
