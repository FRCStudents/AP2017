import java.util.*; 

class APComputerNerdDriver {

    public static APComputerNerd[] array = new APComputerNerd[3];

    public static void swap(int x, int s) {
        APComputerNerd placeholder = array[x];
        array[x] = array[s];
        array[x] = placeholder;
    }

    public static void main(String[] args) {
        array[0] = new APComputerNerd();
        array[1] = new APComputerNerd(3, 8, 4, "Dwight");
        array[2] = new APComputerNerd(2, 3, 6, "Jim");
        System.out.println("UnsortSectioned Nerds:");
        printarray();

        System.out.println("");

        sortSection(0);
        System.out.println("These Nerds are sortSectioned by their intelligences:");
        printarray();

        System.out.println("");

        sortSection(1);
        System.out.println("These Nerds are sortSectioned by their first names:");
        printarray();
    }

    public static void sortSection(int choice) { 
        if (choice == 0) {
            int comp;
            int value;
                for (int x = 0; x < array.length; x++) { 
                comp = 0;
                value = -1;
                for (int s = x; s < array.length; s++) { 
                        if (array[s].getIntelligence() > comp) {
                        comp = array[s].getIntelligence();
                        value = s;
                    }
                }
                swap(x, value);
            }
        
        } else {
            char comp; 
            int value;
            for (int x = 0; x < array.length; x++) { 
                comp = 1;
                value = 0;
                for (int s = x; s < array.length; s++) { 
                    if (array[s].getFirstName().charAt(0) > comp) {
                        comp = array[s].getFirstName().charAt(0);
                        value = s;
                    }
                }
                swap(x, value);
            } 
        } 
    }

    public static void printarray() {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i]);
        }

        System.out.print(array[array.length - 1]);
    }
}

