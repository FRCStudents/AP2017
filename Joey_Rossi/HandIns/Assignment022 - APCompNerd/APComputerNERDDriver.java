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
        System.out.println("Intelligence Sorting:");
        printArr();

        sort(1);
        System.out.println("First Name Sorting:");
        printArr();
    }

    public static void sort(int choice) {
        if (choice == 0) {
            for(i = 0; i < arr.length; i++);
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