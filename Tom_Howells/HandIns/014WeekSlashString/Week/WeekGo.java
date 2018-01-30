class WeekGo {
    public static void main(String[] args) {
        Week a = new Week();

        System.out.println("Days of the week in order:");
        for (int i = 1; i <= 7; i++) {
            System.out.println("\t" + a.getDay(i));
        }

        System.out.println("\nDays of the week in reverse:");
        for (int i = 7; i >= 1; i--) {
            System.out.println("\t" + a.getDay(i));
        }
    }
}