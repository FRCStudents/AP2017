public class DriverAPComputerNerd {

    public static APComputerNerd[] array = new APComputerNerd[3];

    public static void swap(int i, int j) {
        APComputerNerd placeholder = array[i];
        array[i] = array[j];
        array[j] = placeholder;
    }
    public static void main(String[] args) {
        array[0] = new APComputerNerd();
        array[1] = new APComputerNerd(3, 8, 4, "Dwight");
        array[2] = new APComputerNerd(2, 3, 6, "Jim");
        System.out.println("Unsorted Nerds:");
        printarray();

        sort(0);
        System.out.println("These Nerds are sorted by their intelligences:");
        printarray();

        sort(1);
        System.out.println("These Nerds are sorted by their first names:");
        printarray();
    }

    public static void sort(int choice) {
        if (choice == 0) {
            //return "Choice: ";
        } else {
            //return "error";
        }
    }

    public static void printarray() {
        System.out.println("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.print(array[array.length - 1] + "]");
    }
}