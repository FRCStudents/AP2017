public class ResortDriver {

	public static void main(String[] argv){

		Resort r = new Resort();
		r.setTemp(41);
		
		System.out.println(r.determineActivity());
	}
}