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
    }

    public static void sort(int choice) { // 0 for intelligence, 1 for firstName

    }
}