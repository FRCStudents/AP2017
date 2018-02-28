public class NiceMessage extends Message{

	public NiceMessage(){
		this.message = "Code you can";
	}

	protected void actualWords(){
		System.out.println(message);
	}

	public String toString(){
		return "\"" + message + "\" is the nice message.";
	}

}