public class arrTesting{
	public static String[] arr = new String[] {"this", "that", "the", "other", "but", "not", "the", "first"};
	
	public static void printOne(){
                for(int i=0; i < arr.length; i++){
                        System.out.print("[" + arr[i] + "]");
                }
        }

        public static void printTwo(){
                for(int i=arr.length-1; i >= 0; i--){
                        System.out.print("[" + arr[i] + "]");
                }
        }
		public static void printThree(){
                for(int i=arr.length-1; i >= 0; i--){
                        if(i % 3 == 0)
                        System.out.print("[" + arr[i] + "]");
                }
        }
		public static void printFour(){
                for(int i=2; i < arr.length; i++){
                        if(i % 3 == 0)
                        System.out.print("[" + arr[i] + "]");
                }
        }
		public static void printFive(){
                for(int i=arr.length-1; i >= 0; i--){
                        if(i % 4 == 0)
                        System.out.print("[" + arr[i] + "]");
                }
        }
		public static void printSix(){
               for(int j=0; j < arr.length; j++){
                        for(int i=arr.length-1; i >= 0; i--){
                                if(i % 2 == 0)
                                        System.out.print("[" + arr[i] + "]");
                        }
                }
        }
    public static void main(String[] args){
    	//printOne();
    	printTwo();
    	//printThree();
    	//printFour();
    	//printFive();
    	//printSix();
    }
}