class SundayDriver {
    public static void print80Lines(){
        for (int i = 0; i < 80; i++){
            System.out.println();
        }
    }

    public static void wait(int length){
        try {
            Thread.sleep(length);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        Car a = new Car();
        int k = 0;

        while(k < 2){
            for (int i = 0; i < 80; i += 3){
                print80Lines();
                System.out.println(a.repeatString(" ", i) + a.getForwardVisual(0));
                System.out.println(a.repeatString(" ", i) + a.getForwardVisual(1));
                System.out.println(a.repeatString(" ", i) + a.getForwardVisual(2));
                System.out.println(a.repeatString(" ", i) + a.getForwardVisual(3));
                wait(100);
            }

            for (int i = 80; i > 0; i -= 3){
                print80Lines();
                System.out.println(a.repeatString(" ", i) + a.getBackwardVisual(0));
                System.out.println(a.repeatString(" ", i) + a.getBackwardVisual(1));
                System.out.println(a.repeatString(" ", i) + a.getBackwardVisual(2));
                System.out.println(a.repeatString(" ", i) + a.getBackwardVisual(3));
                wait(100);
            }

            k++;
        }
    }
}