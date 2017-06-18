
/****************************************************
 * import furniture.* doesn't work
 ****************************************************/
//import furniture.*;
import furniture.Chair;

class useChair{
	public static void main(String args[]){
		Chair c = new Chair();
		c.setSittingSide("North");
		c.setFacingSide("West");
		c.showIt();
		}
	}
