
class HappyDude {
	private int myBalance;
	public  int myDebts;
	public HappyDude (){
		myBalance = 9999999;
		myDebts = 0;
		}

	public void print(){
		System.out.println("\n\tHappy Dude: ");
		System.out.println("\tHere I am, the happiest guy in the world");
		System.out.println("\tEverything is good. I have a balance in my");
		System.out.println("\tbank account: $" + myBalance);
		System.out.println("\n\tAnd my debts are: " + myDebts);
		System.out.println("\n\tWhich means I really have: $" + (myBalance - myDebts));
		System.out.print("\n\n\t");
		if((myBalance - myDebts) > 50000) System.out.println("Wheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		else				  System.out.println("Oh no. I have been foiled! Oh dear. What shall I do?");
		}
	}

public class EvilDude{
	public static void main(String [] argv){
		System.out.println("\n\nEvil Dude:"); 
		System.out.println("Hello, my find world. This is what I am faced with");
		System.out.println("every single day of my binary existance...");
		System.out.println("This, this, this... sappy happy guy: \n\n");
		HappyDude HD = new HappyDude();
		HD.print();

		System.out.println("\nEvil Dude Returns:");
		System.out.println("Well, frankly, I am just sick of it....");
 
		HD.myDebts = 9997888;
		System.out.println("\nOh. Ah Hah! I got it! I will give him lots of debt! Ha ha ha ha ha ha... (diabolical laugh)");
		HD.print(); 
	}
} 
