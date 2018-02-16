public  abstract class AC{

	protected int thing1;
	protected int thing2;

		protected abstract void turnOnAC();
		protected abstract void turnOffAC();	

/*		public int getAC(){
			return thing1;
		}

		public void SetAC(int a){
			thing1 = a;
}
		public void printer(){
	System.out.println("______________");
	System.out.println("*	    *");
	System.out.println("*    " + thing1 + "    *");
	System.out.println("*	    *");
	System.out.println("______________");
}
*/
		public String toString() {
				return "AC: " + String.valueOf(thing1);
		}
}
