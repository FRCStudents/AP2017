
class ShaylaDriver {
	public static void everyOther(){
		// 6)
		// Please put the code here that will fill the
		// shaylaArr1 with the following:
		// "My", "Dog", "Has", "A Ukelele"
		}

	public static void everyOther2(int x){
		// 7)
		// Please put the code here that will fill the
		// shaylaArr2 with the following:
		// x, x+1, x+2, x+3  
		// that is - starting with x and increasing each
		// entry by 1
		}


	public static void main(String [] argv){
		Shayla s = new Shayla();
		s.setShaylaArr1(2, "Shayla");
		for(int i=0; i < 4; i++){
			System.out.println(s.getShaylaArr1(i));
		}

		// 1)
		// I want to write the following line of code:
		// s.setShaylaArr2(2, 156);
		// But, of course, it will not compile or run!
		// Please make it work - coded consistently with the
		// rest of the Shayla object
		//

		// 2)
		// I want to write the following line of code:
		// s.showShayla()
		// This should display to console both arrays
		// in the Shayla object
		// Please make it work.
		//

		// 3) 
		// Please write a method in Shayla that will print
		// alternating between the two arrays
		// Thing 0 Thing 0 Thing 0 Thing 0

		// 4)
		// Please write a method that will print out the elements of 
		// ShaylaArr1 if (and only if) they are longer than 4 characters

		// 5) 
		// Please write a method that will print out the elements of
		// ShaylaArr2 if (and only if) they are larger than 7
	
	}
}

