class SundayDriver2 {

    private String car1 = "---------\\";
    private String car2 = "| []   [] \\";
    private String car3 = "------------";
    private String car4 = "(O)      (O)";
    private String space = " ";

    private String bcar1 = " /----------";
    private String bcar2 = "/ []   []  |";
    private String bcar3 = "------------";
    private String bcar4 = "(O)      (O)";
    private String bspace = space;

    SundayDriver2() {
        String car1 = "---------\\";
        String car2 = "| []   [] \\";
        String car3 = "------------";
        String car4 = "(O)      (O)";
        String space = " ";
        String bcar1 = " /----------";
        String bcar2 = "/ []   []  |";
        String bcar3 = "------------";
        String bcar4 = "(O)      (O)";
        String bspace = space;
    }

    public void eraseScreen() {
        for(int i = 0; i < 80; i++) {
            System.out.println();
        }
    }

    public void waitUp() {
        try {
            Thread.sleep(10);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public void moveCarRight() {
        for (int i = 0; i < 80; i+=3) {
            space = space + " ";
            eraseScreen();
            System.out.println(space + car1);
            System.out.println(space + car2);
            System.out.println(space + car3);
            System.out.println(space + car4);
            waitUp();
        }
        bspace = space;
        space = " ";
    }

    public void moveCarLeft() {
        for (int i = 0; i < 80; i+=3) {
            if (bspace.length() >= 2) {
                bspace = bspace.substring(1);
            }
            eraseScreen();
            System.out.println(bspace + bcar1);
            System.out.println(bspace + bcar2);
            System.out.println(bspace + bcar3);
            System.out.println(bspace + bcar4);
            waitUp();
        }
        bspace = space;
    }


}