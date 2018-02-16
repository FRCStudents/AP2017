
public class NiceMessage extends Message {
	public NiceMessage(){
		message = "Gosh, what a gem of a human being you are!";
	}

	public void sayThing(){
		System.out.println("You are so nice. " + message);
	}

	public String toString(){
		return "This is the AC: " + AC;
	}
}
