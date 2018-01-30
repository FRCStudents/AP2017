
public class Cat extends Pet {
	public Cat(String name){
		super(name);
	}

	public Cat(){
		this("Cat");
	}

	public String speak(){
		return "Meow";
	}
}
