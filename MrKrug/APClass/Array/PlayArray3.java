
class Junk {
	int i;
	int j;
	int k;

	public Junk(int x, int y, int z){
		i = x;
		j = y;
		k = z;
	}
		
	public int getSum(){
		return i + j + k;
	}

	public int getProduct(){
		return i * j * k;
	}

	public String printString(){
		return getSum() + "\t{" + getProduct() + "}";
	}
}

class PlayArray3 {
	public static void main(String [] argv){
		Junk[] theArray = new Junk[10];

		// load the array with char 

		for(int i=0; i < theArray.length; i++){
			theArray[i] = new Junk(2, 3, i); 
			}

		for(int i=0; i < theArray.length; i++){
			//System.out.println(theArray[i].getSum() + " {" + theArray[i].getProduct() + "}");
			System.out.println(theArray[i].printString());
		}

	}

}
