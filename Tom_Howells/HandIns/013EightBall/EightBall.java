import java.util.*;

class EightBall {
    private String[] results = {
        "You may rely on it",
        "Yes, definitely",
        "Concentrate and ask again",
        "Don't count on it",
        "It is certain",
        "Most likely",
        "My reply is \"no\"",
        "No",
        "Outlook good"};
    private Random rand = new Random();

    public String getResponse() {
        return results[rand.nextInt(results.length - 1)];
    }
}