class EightBallDriver {
    public static void main(String[] args) {
        EightBall larry = new EightBall();

        System.out.println("Your question: " + args[0]);
        System.out.println("The response: " + larry.getResponse());
    }
}