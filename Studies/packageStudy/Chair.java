
/***********************************************
 * package furniture
 * object Chair
 * javac -d . Chair.java
 ***********************************************/

package furniture;

public class Chair extends Furniture {
	String madeOf = "";
	int backHeight = 0;
	int width = 0;
	int seatHeight = 0;
	
	public Chair(){
		super(); 
		this.setLegs(4);
		this.setDoors(0);
		
		madeOf = "wood";
		backHeight = 36;
		width = 15;
		seatHeight = 24;
		}

	public void showIt(){
		super.showIt();
		System.out.println("Type: Chair");
		System.out.println("Back: " + backHeight + " inches");
		System.out.println("Seat: " + seatHeight + " inches");
		System.out.println("Made of: " + madeOf);
		}
	}	
