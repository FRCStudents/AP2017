
class Loops {

	public static String[] arr = new String[] {"this", "that", "the", "other", "but", "not", "the", "first"};
	int size = 0;

	public Loops(){
		size = arr.length;	
	}

        public static void printSix(){
 	       for(int j=0; j < arr.length; j++){  
               		for(int i=arr.length-1; i >= 0; i--){
                        	if(i % 2 == 0)
                        		System.out.print("[" + arr[i] + "]");
			}
                }
        }
	
        public static void printFive(){
                for(int i=arr.length-1; i >= 0; i--){
                        if(i % 4 == 0)
                        System.out.print("[" + arr[i] + "]");
                }
        }

        public static void printFour(){
                for(int i=2; i < arr.length; i++){
                        if(i % 3 == 0)
                        System.out.print("[" + arr[i] + "]");
                }
        }

        public static void printThree(){
                for(int i=arr.length-1; i >= 0; i--){
			if(i % 3 == 0)
                        System.out.print("[" + arr[i] + "]");
                }
        }


        public static void printTwo(){
                for(int i=arr.length-1; i >= 0; i--){
                        System.out.print("[" + arr[i] + "]");
                }
        }

	public static void printOne(){
                for(int i=0; i < arr.length; i++){
                        System.out.print("[" + arr[i] + "]");
                }
 	}

	public static void printIt(int command){
		System.out.println(command + ") ==>");
		if(command == 1)
			printOne();
		if(command == 2)
			printTwo();
		if(command == 3)
			printThree();
		if(command == 4)
			printFour();
		if(command == 5)
			printFive();
		if(command == 6)
			printSix();
		System.out.println("\n==>");
	}

	public static void main(String[] argv){
		String arg = "";
		if(argv.length > 0){
			arg = argv[0];
		}
		System.out.println(arg);
		printIt(1);
		printIt(2);
		printIt(3);
		printIt(4);
		printIt(5);
		printIt(6);
	}



}
