public class CardTester3 {
	public static void main(String[] args) {
    Hand h = new Hand(13);
    Card[] hand = h.getHand();

    while(!h.checkCards()) {
      for(int i=0; i<13; i++){
        hand[i].getRandomValue();
      }
    }
    h.toString();
    h.totalPoints();
    System.out.println("Total Points: " + h.getTotalPoints());
    System.out.println("Hand: " + h);
	}
}
