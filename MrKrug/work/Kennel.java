import java.util.*;

public class Kennel {
	private ArrayList<Pet> petList = new ArrayList<Pet>();

	public Kennel(){
		Cat c = new Cat("Patches");
		Dog d = new Dog("Fido");
		LoudDog ld = new LoudDog("Butch");

		petList.add(c);
		petList.add(d);
		petList.add(ld);
	}

	public void allSpeak(){
		for(int i=0; i < petList.size(); i++){
			System.out.println(
				petList.get(i).getName() + " " +
				petList.get(i).speak());
		}
	}
}
