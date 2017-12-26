class StressTest{
public static void main(String [] argv){
	Yada y = new Yada(7);
	SubYada sy = new SubYada();

	y.setIth(4, "Happy");
	sy.setIth(4, "Happy");
	y.setIth(3, "Unhappy");

	sy.setIth(3, "Unhappy");
	y.showYada();

	System.out.println("And now - the sub Yada");
	sy.showYada();
	}
   }
	
