//
//note: animals.Animal is not public and
// 	therefore can not be imported!
//
//import animals.Animal;

//
// javac -d puts MammalInt.class in directory animals
//

//
// both of the following imports work
// notice: animals.MammalInt imports exactly one object
// 	   and animals.* imports every object in package animals
//	   but not every object in the directory animals...
//

//import animals.MammalInt;
import animals.*;

public class runMammalInt {
	public static void main(String args[]){
		MammalInt m = new MammalInt();
		m.setNoOfLegs(4);
		m.eat();
		m.travel();
		}
	}

