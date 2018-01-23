public class APComputerNERDDriver{


	APComputerNERD[] Nerd = new APComputerNERD[10];

		public void arrPrinter(){

		int x;

			for(x=1;x<10;x++){
			System.out.print(Nerd[x]);
	}
	}
	


public static void main (String[] argv){

	APComputerNERD n = new APComputerNERD();

	n.arrPrinter();

}
}