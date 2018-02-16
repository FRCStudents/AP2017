public class AbusiveMessage extends MeanMessage{

	public AbusiveMessage(){
		message = "Lets all kick Tunju!";
	}
	
	public void sayThing(){
		System.out.println(message);
	}

	public String toString(){
		return message;
	}
}