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
=======
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

>>>>>>> 8bd5649ddc9f7afefb1e27c03ec2def9b56df2c3
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
