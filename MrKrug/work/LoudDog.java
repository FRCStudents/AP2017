
public class LoudDog extends Dog {
	public LoudDog(String name){
		super(name);
	}

	public LoudDog(){
		this("Loud Dog");
 	}

	public String speak(){
		String s = super.speak() + super.speak();
		return s;
	}
}
