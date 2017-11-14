public class Card{


  String Suit = "";
  int Number = 0;
  String Rank = "";
  boolean Face;
  
        public String getSuit(){
            return Suit;
        }
        
        public int getNumber(){
            return Number;
        }
        
        public String getRank(){
            return Rank;
        }
        
        public boolean getSide(){
            return Face;
        }
        
        public void setSuit(String s){
            Suit = s;
        }
        
        public void setNumber(int n){
            Number = n;
        }
        
        public void setRank(String r){
            Rank = r;
        }
        
        public boolean setSide(boolean f){
            Face = f;
        }
        
        //unsure about this code
        public void displaySuit(){
            setSuit();
            System.out.print("Suit" + s);
        }
        
        //not too sure about this either
        boolean isEqual(Card c){
            if((s && n) == (s && n)){
                return true;
            } else {
                return false;
            }
        }
        
        public void printCard(){
            System.out.println("Card");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Rank: " + r);
            System.out.println("Suit: " + s);
            System.out.println("Number: " + n);
            System.out.println("Side: " + f);
        }
        
        boolean isHigher(){
            
        }
            
}
