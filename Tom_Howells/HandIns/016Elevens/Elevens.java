import java.util.*;

class Elevens {
    public static void main(String[] args) {
        Deck a = new Deck();

        for (int i = 0; i < 52; i++){
            System.out.println(a.getCard(i) + " " + a.getCard(i).getValue());
        }
    }
}