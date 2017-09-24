package APLine;
import APLine.APLine;

public class APLineGo{
  public static void main(String args[]){
    APLine apLine = new APLine(3,4, -25);
    System.out.println("Line is: 3x + 4y - 25 = 0");
    System.out.println("Point (3,4) is on line: " + apLine.isOnLine(3,4));
    System.out.println("And the slope: " + apLine.getSlope());

    APLine apLine2 = new APLine(5,10,-35);
    System.out.println("Line is: 5x + 10y - 35 = 0");
    for (int x = 0; x < 20; x++){
	for (int y = 0; y < 20; y++){
		if(apLine.isOnLine(x,y)){ 
			System.out.println("Point (" + x + "," + y + ") is on the line");
			}
		//else {
		//	System.out.println("(" + x + "," + y + ") - nope!");
		//}
	}
    }
    System.out.println("And the slope: " + apLine2.getSlope());
 
  }
}
