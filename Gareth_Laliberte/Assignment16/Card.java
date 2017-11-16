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
        
        public void setSide(boolean f){
            Face = f;
        }
        
        //unsure about this code
	// this could be displayCard
	// show the user the pertinent information!
	// number & suit...
	// why do you need to set the suit here? 
        public void displaySuit(){
        //    setSuit();
            System.out.print("Suit" + Suit);
        }
        
        //not too sure about this either
	// i don't see s or n defined anywhere...
	// then you compare (a and b) (either true or false... true if both a and b are true
	// to (b and a) (either trun or false... true if both a and b are true - just like above!)
	//
	// you should be comparing this.Number to c.Number (or c.getNumber())...
	//
        boolean isEqual(Card c){
            if((getNumber() == c.getNumber()) == (getSuit() == c.getSuit())){
                return true;
            } else {
                return false;
            }
        }
        
        public void printCard(){
            System.out.println("Card");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Rank: " + Rank);
            System.out.println("Suit: " + Suit);
            System.out.println("Number: " + Number);
            System.out.println("Side: " + Face);
        }
      
	//  
	// how do you want to compare Strings?
	//
        boolean isHigher(Card c){
		return true;
        }
            
}
