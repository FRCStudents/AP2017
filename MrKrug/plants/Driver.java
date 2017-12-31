
public class Driver {
	public static void main(String[] argv){
		Plant[] plants = new Plant[10];
		for(int i=0; i<10; i++){
		    if(i % 2 == 0){
			plants[i] = new Tree();
			plants[i].setStuntFactor(i);
			plants[i].raiseStunt();
			}
		    else {
			plants[i] = new Bush();
			// Bushes start with a disadvantage (height)
			plants[i].setStuntFactor(i * 2);
			plants[i].lowerStunt();
		    }
		}
		for(int i=0; i < 10; i++){
			growThem(plants);
		 	showThem(plants);
		}

		showResults(plants);
	}

	private static void growThem(Plant[] plants){
		for(int i=0; i < plants.length; i++){
			plants[i].growPlant();
		}
	}

	private static void showThem(Plant[] plants){
		for(int i=0; i < plants.length; i++){
			System.out.println(plants[i]);
		}
	}

	private static void showResults(Plant[] plants){
		for(int i=0; i < plants.length; i++){
			if(plants[i].getType().equals("Bush")){
				System.out.print("[" + plants[i].getSize() + "]");
				}
			else {
				System.out.print("{" + plants[i].getSize() + "}");
			}
		}
	}
}
