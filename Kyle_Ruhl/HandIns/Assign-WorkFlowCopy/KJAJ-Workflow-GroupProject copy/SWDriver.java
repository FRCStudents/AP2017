//first part of the workflow project--DRIVER
//Project by Kyle Ruhl, James Dimino, Julie Hu, Archit Sahay

public class SWDriver{
	public static void main(String[] argv){
		
		scanAndWrite b = new scanAndWrite();
		
		b.scanForName();
		b.scanForAge();
		b.scanForOccupation();
		b.scanForHeight();
		b.scanForSpeed();
		b.scanForShoeSize();
		b.scanForHatSize();
		
		b.displayAttributes();
		
		//this function uses recursion to redo scanners and then re-display the attributes and redo itself
		b.askCorrections(); 
		
		b.writeTextFile();
	}
}
