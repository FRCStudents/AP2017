public abstract class Pet {
	private String myName;
	public Pet(String name){
		myName = name;
	}

	public Pet(){
		this("Pet");
	}

	public String getName(){
		return myName;
	}
	public abstract String speak();
}
