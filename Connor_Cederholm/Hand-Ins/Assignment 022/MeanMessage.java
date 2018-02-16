public class MeanMessage extends Message{
	public String message = "Hey NOT bud";

	public void showMessage(){
		System.out.println(message);
	}

	public String toString(){
		return "MeanMessage" + message;
	}
}