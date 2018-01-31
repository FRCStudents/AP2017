public class APComputerNerdDriver{

	public static APComputerNerd[] array = new APComputerNerd[3];

	
	public static void swap(int i, int p){
		APComputerNerd placeholder = array[i];
		array[i] = array[p];
		array[p] = placeholder;
	}

	
	public static void main(String[] args) {

        array[0] = new APComputerNerd();
        array[1] = new APComputerNerd(4, 8, 7, "Dwight");
        array[2] = new APComputerNerd(2, 3, 6, "Michael");
        System.out.println("Unsorted Nerds:");
        printArray();

        sort(0);
        System.out.println("These Nerds are sorted by their intelligence:");
        printArr();

        sort(1);
        System.out.println("These Nerds are sorted by their first name:");
        printArray();
    }

	
	public static void sort(int nerd2) {
        if (choice == 0) {
        	return "Nerd2: "
        } else {
        	return "error"
        }
    }

    public static void printArray() {
        System.out.println("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1] + "]");
    }
}