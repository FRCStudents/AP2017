public class AbusiveMessage extends MeanMessage {

	public AbusiveMessage(){
		this.message = "You are the worst!";
	}

	protected void sayThing(){
		System.out.println(message);
	}

	public String toString(){
		return "AbusiveMessage: " + message;
	}
}