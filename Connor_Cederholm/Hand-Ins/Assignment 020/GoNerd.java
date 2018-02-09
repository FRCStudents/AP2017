public class GoNerd{

	public static APComputerNerd[] g = new APComputerNerd [6];
		

	public static void main (String [] argv){

		APComputerNerd a = new APComputerNerd();
		APComputerNerd b = new APComputerNerd();
		APComputerNerd c = new APComputerNerd();
		APComputerNerd d = new APComputerNerd();
		APComputerNerd e = new APComputerNerd();
		APComputerNerd f = new APComputerNerd();
		
		a.setIntelligence(1);
		b.setIntelligence(2);
		c.setIntelligence(3);
		d.setIntelligence(4);
		e.setIntelligence(5);
		f.setIntelligence(6);

	 	

	 	g[1] = a;
	 	g[2] = b;
	 	g[3] = c;
	 	g[4] = d;
	 	g[5] = e;
	 	g[0] = f;

	 	a.sortByInt(g);
	 	for(int l = 0; l < g.length; l ++){
	 	System.out.println(g[l].getIntelligence());
	 }

	}
}