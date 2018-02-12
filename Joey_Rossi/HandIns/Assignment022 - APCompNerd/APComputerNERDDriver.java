class APComputerNERDDriver {
    public static APComputerNERD[] arr = new APComputerNERD[3];

    public static void swap(int idx1, int idx2) {
        APComputerNERD placeholder = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = placeholder;
    }
    public static void main(String[] args) {
        arr[0] = new APComputerNERD();
        arr[1] = new APComputerNERD(3, 5, 2, "Bames");
        arr[2] = new APComputerNERD(5, 4, 8, "Boey");
        System.out.println("Notsorted:");
        printArr();
        
        sort(0);
        System.out.println("\nSorting by Intelligence:");
        printArr();

        sort(1);
        System.out.println("Sorting by First Name:");
        printArr();
    }

    public static void sort(int choice) { // 0 for intelligence, 1 for firstName
        if (choice == 0) {
            int compare;
            int newValPos;
            for (int i = 0; i < arr.length; i++) {
                compare = -1;
                newValPos = -1;
                for (int j = i; j < arr.length; j++) {
                    if (arr[j].getIntelligence() > compare) {
                        compare = arr[j].getIntelligence();
                        newValPos = j;
                    }
                }
                swap(i, newValPos);
            }
                    } else {
            char compare; 
            int newValPos; 
            for (int i = 0; i < arr.length; i++) { 
                compare = 0;
                newValPos = -1;
                for (int j = i; j < arr.length; j++) {
                    if (arr[j].getFirstName().charAt(0) > compare) {
                        newValPos = j;
                        compare = arr[j].getFirstName().charAt(0);
                    }
                }
                swap(i, newValPos);
            }
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