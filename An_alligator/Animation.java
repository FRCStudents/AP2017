import java.util.concurrent.TimeUnit;

public class Animation extends Thread{ 
	String car = "[o====o]";
	public void animation() throws InterruptedException{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		String spaces="";
		for(int x=0; x<80; x++){
			System.out.print("\r" + spaces + car);
			spaces += " ";	
			Thread.sleep(16);
		}for(int x=0; x<80; x++){
			System.out.print("\r" + spaces + car);
			spaces += "\b";	
			Thread.sleep(16);
		}

	}
}
