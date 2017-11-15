class Elevens {
    public static void main(String[] args) {
        Deck d = new Deck();
        Playarea p = new Playarea(d, 9);

        // shuffling a few times to decrease possibility of patterns
        d.shuffle();
        d.shuffle();
        d.shuffle();
    }
}