public class CarRacer{

public static void waitUp(){
	try{
		Thread.sleep(1000);
	}

	catch(InterruptedException ex){
		Thread.currentThread().interrupt();
	}
}

public static void main(String [] argv){
	System.out.print("\n       ---------\\ ");
	waitUp();
	System.out.print("\n      | []    [] \\ ");
	waitUp();
	System.out.print("\n      |           |");
	waitUp();
	System.out.print("\n      ------------");
	waitUp();
	System.out.print("\n      (O)      (O)");
	waitUp();
	System.out.print("\n                                                       ---------\\ ");
	waitUp();
	System.out.print("\n                                    -------------     | []    []\\ ");
	waitUp();
	System.out.print("\n                                                      |          |");
	waitUp();
	System.out.print("\n                                    -------------     ------------");
	waitUp();
	System.out.print("\n                                                      (O)      (O)");
	waitUp();
	System.out.print("\n        /----------");
	waitUp();
	System.out.print("\n       / []    [] |        -----------------");  
	waitUp();
	System.out.print("\n       |          |");
	waitUp();
	System.out.print("\n       -----------         -----------------");
	waitUp();
	System.out.print("\n       (O)      (O)");
	waitUp();
	System.out.println("");
	}
}