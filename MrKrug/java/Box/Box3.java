
class Box3 {
	public static void main(String[] argv){
		char c = 183;
		System.out.print("\n\n   ");
		for(int i=0; i<23; i++) System.out.print(c);
		System.out.println("");
		System.out.println("  " + c + "                    " + c + " " + c);
		System.out.println(" " + c + "                    " + c + "  " + c);
		for(int i=0; i<22; i++) System.out.print(c);
		System.out.println("   " + c);
		System.out.println(c + "                    " + c + "  " + c);
		System.out.println(c + "                    " + c + " " + c);
		System.out.println(c + "                    " + c + "" + c);
		for(int i=0; i<22; i++) System.out.print(c);
		System.out.println("\n\n\n\n");
	}
}
