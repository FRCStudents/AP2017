public class nerdDriver{
	public static void main(String[] argv){
		
		APCNerd Francis = new APCNerd();	
		Francis.setIntelegence(8);
		Francis.setSpeed(14);
		Francis.setLaptopPerformance(8);
		Francis.setFirstName("Francis");
		
		APCNerd Mike = new APCNerd();	
		Mike.setIntelegence(4);
		Mike.setSpeed(11);
		Mike.setLaptopPerformance(3);
		Mike.setFirstName("Mike");
		
		APCNerd Vickter = new APCNerd();	
		Vickter.setIntelegence(10);
		Vickter.setSpeed(19);
		Vickter.setLaptopPerformance(10);
		Vickter.setFirstName("Vickter");
		
		APCNerd Aretha = new APCNerd();	
		Aretha.setIntelegence(6);
		Aretha.setSpeed(0);
		Aretha.setLaptopPerformance(8);
		Aretha.setFirstName("Aretha");
		
		APCNerd Allison = new APCNerd();	
		Allison.setIntelegence(9);
		Allison.setSpeed(7);
		Allison.setLaptopPerformance(4);
		Allison.setFirstName("Allison");
		
		Allison.sortIntelegence();
		Allison.sortFirstName();
		
	}


}