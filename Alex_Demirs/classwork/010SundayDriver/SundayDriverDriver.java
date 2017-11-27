class SundayDriverDriver {

    public static void main(String[] argv) {
    	
        SundayDriver2 s = new SundayDriver2();
        for (int i = 1; i < 5; i++) {
            s.moveCarRight();
            s.moveCarLeft();
            s.eraseScreen();
            System.out.println("You Ran Out of Gas! Repeat to Refill.");
        }

    }
}