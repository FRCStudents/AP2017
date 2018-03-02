public class NiceMessage extends Message{
	public String message = "Hey Bud";

	public void showMessage(){
		System.out.println(message);
	}

	public String toString(){
		return "NiceMessage" + message;
	}
}