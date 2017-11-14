public class Card{


  String Suit = "";
  int Number = 0;
  String Rank = "";
  
        public String getSuit(){
            return Suit;
        }
        
        public int getNumber(){
            return Number;
        }
        
        public String getRank(){
            return Rank;
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
        
        public void displaySuit(){
            setSuit();
            System.out.print(s);
        }
        
        boolean isEqual(Card c){
            if((s && n) == (s && n)){
                return true;
            } else {
                return false;
            }
        }
}