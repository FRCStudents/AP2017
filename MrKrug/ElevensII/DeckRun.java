// Driver

class DeckRun {
  public static void main(String [] argv){
    Deck d = new Deck();
    Deck d2 = new Deck();
    Deck d3;

    d2 = d.getCopy();
    //d.showDeck();
    d.shuffle(20);
    d2.showDeck();
    System.out.println("+++++++++++++++++++++++");
    d.showDeck();
    System.out.println("Same Order: " + d.sameOrder(d2));
  }
}
