
class Face1{
	public static void printBlanks(int i){
		for(int x=0; x < i; x++){
			System.out.print(' ');
			}
		}

	public static void printLines(int i){
		for(int x=0; x<i; x++){
			System.out.println();
			}
		}

	public static void main(String argv[]){
		printBlanks(32);
		for(int i=0; i < 32; i++){
			System.out.print("*");
			}
		printLines(2);
		printBlanks(35);
		for(int i=0; i < 5; i++){
			System.out.print('^');
			}
		printBlanks(16);
		for(int i=0; i < 5; i++){
			System.out.print('^');
			}
		printLines(1);
		printBlanks(35);
		for(int i=0; i < 2; i++) { System.out.print('>'); }
		printBlanks(19);
		for(int i=0; i<2; i++){ System.out.print('>'); }

		printLines(2);
		printBlanks(46);
		for(int i=0; i<3; i++){ System.out.print('@'); }
		printLines(2);

		System.out.println("etc...");
		for(int i=0; i < 10; i++){
			System.out.println();
			}
	}
}

