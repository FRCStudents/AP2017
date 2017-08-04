public class CardTester4 {
	public static void main(String[] args) {
    Hand h = new Hand(13);
    Card[] hand = h.getHand();

    while(!h.checkCards()) {
      for(int i=0; i<13; i++){
        hand[i].getRandomValue();
      }
    }
    //h.toString();
    h.totalPoints();
		h.distributionPoints();
		h.orderHandNum();
		h.orderHand();
    System.out.println("Card Points: " + h.getTotalPoints() + " Distribution: " + h.getDistributionPoints());
		System.out.println("Total Points: " + (h.getTotalPoints() + h.getDistributionPoints()));
    System.out.println("Hand: " + h);
	}
}
