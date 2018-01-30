
public class Dog extends Pet {
	public Dog(String name){
		super(name);
	}


	public Dog(){
		this("Dog");
	}

	public String speak(){
		return "BowWow";
	}
}
