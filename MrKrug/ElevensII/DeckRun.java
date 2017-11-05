// Driver

class DeckRun {
  public static void main(String [] argv){
    Deck d = new Deck();
    Deck d2 = new Deck();
    Deck d3;

    d2.copyDeck(d);
    d3 = d2.copyDeck(d);
    //d.showDeck();
    d.shuffle(7);
    d3.showDeck();
    System.out.println("+++++++++++++++++++++++");
    d.showDeck();
    System.out.println("Same Order: " + d.sameOrder(d3));
  }
}
