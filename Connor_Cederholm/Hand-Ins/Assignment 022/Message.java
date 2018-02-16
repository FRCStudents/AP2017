public class Message{
	protected String message;

	protected void showMessage(){
		System.out.println(message);
	}

	protected String getMessage(){
		return message;
	}

	protected void putInBox(){
		System.out.print("************* \n**" + message +"** \n****************");
	}
}