class card{
int number;
String suit;
String rank;

public card(String r, String s, int n){
  rank = r;
  suit = s;
  number = n;
  
  System.out.println("Suit is " + s);
  System.out.println("Rank is " + r);
  System.out.println("Card Numeral is " + n);
}

public card(){
  this("Ace", "Spades", 1);
}

//getter and setters for number
int getNumber(){
return number;
}

void SetNumber (int newNumber){
number = newNumber;
}

//getters and setters for suit
String getSuit(){
return suit;
}

void setSuit(String x){
suit = x;
}
//getters and setters for rank

String getRank(){
return rank;
}

void setRank(String e){
rank = e;
}

//funtions:
public char displaySuit(card c) {
              switch (c.getSuit()) {
                  case "Spades":
                      return ((char)'\u2660');
                  case "Diamonds":
                      return ((char)'\u2666');
                  case "Clubs":
                      return ((char)'\u2663');
                  case "Hearts":
                      return ((char)'\u2764');
              }
              return ' ';
      }

boolean isEqual(card c){
  return c.getRank().equals(getRank()) && c.getSuit().equals(getSuit()) && c.getNumber() == getNumber();
}

void printCard(){
  String p;
  int w = getNumber();
  if ((w >= 1) && (w <= 13)){
    if (w==1){
      p = "Ace";
        }else{
          return;
          }
    if (w==11){
      p = "Jack";
        }else{
          return;
          }
    if (w==12){
      p = "Queen";
          }else{
            return;
              }
    if (w==13){
      p = "King";
        }else{
          return;
        }

  if ((w >= 2) && (w <= 10)){
   System.out.println("" + w + displaySuit(this));
  }else{
   System.out.println("" + p + displaySuit(this));
   }
 }
}

//string to string
public String toString(){
return "Complete";
 }
}
