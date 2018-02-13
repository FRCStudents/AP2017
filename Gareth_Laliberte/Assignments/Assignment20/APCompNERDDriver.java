public class APCompNERDDriver {
	public static void main(String[] argv){
		APComputerNERD[] arr = new APComputerNERD[10];

		APComputerNERD Nerd = new APComputerNERD();

		APComputerNERD isBigger(APComputerNERD a, APComputerNERD b){
			if(a.compareTo(b) == 1){
				return a;
			}
			return b;
		}
	}
}