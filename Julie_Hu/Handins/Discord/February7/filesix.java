public class filesix{

private int oneAttribute;

	public filesix(){
		this.oneAttribute = 17;
	}

	public void printValue(){
		System.out.println("The Value of This Attribute: " + oneAttribute);
	}

public static void main(String[] args){
filesix x = new filesix();
x.printValue();
 }
}