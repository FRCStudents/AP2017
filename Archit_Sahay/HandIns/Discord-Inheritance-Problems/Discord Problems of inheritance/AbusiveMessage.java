public class AbusiveMessage extends MeanMessage{

	public AbusiveMessage(){
	this.message = "You can't code at all";
	}

	protected void actualWords(){
	System.out.println(message);
	}

	public String toString(){
		return "\"" + message + "\" is an abusive message.";
	}

}