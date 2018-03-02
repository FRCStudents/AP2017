public class MeanMessage extends Message {

	public MeanMessage(){
		this.message = "I hate Your Shirt!";
	}

	protected void sayThing(){
		System.out.println(message);
	}

	public String toString(){
		return "MeanMessage: " + message;
	}
}