class Elevens {
    public static void main(String[] args) {
        Deck a = new Deck();

        for (int i = 0; i < 52; i++){
            System.out.println(a.getCard(i));
        }
        System.out.print(a.getCard(51));
    }
}
