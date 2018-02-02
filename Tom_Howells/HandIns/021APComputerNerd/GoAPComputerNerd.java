class GoAPComputerNerd {
    public static APComputerNerd[] arr = new APComputerNerd[3];

    public static void swap(int idx1, int idx2) {
        APComputerNerd placeholder = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = placeholder;
    }
    public static void main(String[] args) {
        arr[0] = new APComputerNerd(9, 10, 8, "Dilbert");
        arr[1] = new APComputerNerd(3, 5, 2, "Rob");
        arr[2] = new APComputerNerd(5, 4, 8, "Aaron");
        System.out.println("name(intelligence, speed, laptopPerformance)");
        System.out.println("\nUnsorted:");
        printArr();

        sort(0);
        System.out.println("\nSorted by intelligence (highest to lowest):");
        printArr();

        sort(1);
        System.out.println("\nSorted by first name (last to first):");
        printArr();
    }

    public static void sort(int choice) { // 0 for intelligence, 1 for firstName
        if (choice == 0) {
            int compare; // test val
            int newValPos; // hold position of new value
            for (int i = 0; i < arr.length; i++) { // current pos
                compare = -1;
                newValPos = -1;
                for (int j = i; j < arr.length; j++) { // loop thru rest
                    if (arr[j].getIntelligence() > compare) {
                        compare = arr[j].getIntelligence();
                        newValPos = j;
                    }
                }
                swap(i, newValPos);
            }
        } else {
            char compare; // test val
            int newValPos; // hold position of new value
            for (int i = 0; i < arr.length; i++) { // current pos
                compare = 0;
                newValPos = -1;
                for (int j = i; j < arr.length; j++) { // loop thru rest
                    if (arr[j].getFirstName().charAt(0) > compare) {
                        compare = arr[j].getFirstName().charAt(0);
                        newValPos = j;
                    }
                }
                swap(i, newValPos);
            }
        }
    }

    public static void printArr() {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1] + "]\n");
    }
}