public class AbusiveMessage extends MeanMessage{

	public AbusiveMessage(){
	this.message = "You are the most despicible capitalist I've ever met, you are bansihed to the Gulag";
	}

	protected void sayThing(){
	System.out.println(message);
	}

	public String toString(){
		return "\"" + message + "\" is the abusive message.";
	}

}