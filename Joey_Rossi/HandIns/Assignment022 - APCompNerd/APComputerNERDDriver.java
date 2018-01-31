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

	//
	// Joey! This is perfect! Now you need to figure out
	// how to code these next few lines - 
	// 
	// One way to do that is to get a deck of 3 cards (make them)
	// and lay them face up on the table. then pretend like you are
	// a computer and figure out what you do to sort them...
	//
	// Don't give up!
	//
    public static void sort(int choice) {
        if (choice == 0) {
            for(i = 0; i < arr.length; i++){
		for(j = i; j < arr.length; j++){
			// sometimes swap...
			// i.e. "use the swap, Luke!"
			//
		}
	    }
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
