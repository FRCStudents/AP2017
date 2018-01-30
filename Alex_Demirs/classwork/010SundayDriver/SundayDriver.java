public class SundayDriver{

public static void waitUp(){
	try{
		Thread.sleep(1000);
	}

	catch(InterruptedException ex){
		Thread.currentThread().interrupt();
	}
}

private static String Car1 = "---------\\";
private static String Car2 = "| []   [] \\";
private static String Car3 = "|          |";
private static String Car4 = "------------";
private static String Car5 = " (O)      (O)";
private static String Forward = " ";
private static String X = "Forward";

public static void main(String [] argv){

 for(int b = 0; b <= 80; b++){
			System.out.print("\r");
		}
		for (int t = 0; t <= 0; t++){
		System.out.println(Forward + Car1);
		System.out.println(Forward + Car2);
		System.out.println(Forward + Car3);
		System.out.println(Forward + Car4);
		System.out.println(Forward + Car5);
		waitUp();

}
}
}