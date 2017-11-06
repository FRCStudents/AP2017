class Elevens {
    public static void main(String[] args) {
        Deck a = new Deck();

        Card[] b = a.getDeck();

        for (int i = 0; i < 52; i++){
            System.out.println(a.getCard(i));
        }
    }
}