class GoAPComputerNerd {
    public static APComputerNerd[] arr = new APComputerNerd[3];

    public static void swap(int idx1, int idx2) {
        APComputerNerd placeholder = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = placeholder;
    }
    public static void main(String[] args) {
        arr[0] = new APComputerNerd();
        arr[1] = new APComputerNerd(3, 5, 2, "Rob");
        arr[2] = new APComputerNerd(5, 4, 8, "Aaron");
        System.out.println("Unsorted:");
        printArr();

        sort(0);
        System.out.println("Sorted by intelligence:");
        printArr();

        sort(1);
        System.out.println("Sorted by first name:");
        printArr();
    }

    public static void sort(int choice) { // 0 for intelligence, 1 for firstName
        if (choice == 0) {
            
        } else {

        }
    }

    public static void printArr() {
        System.out.println("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1] + "]");
    }
}