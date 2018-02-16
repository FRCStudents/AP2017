public class MeanMessage extends Message {

	public MeanMessage(){
		message = "Tunji... more like Bunji! xD";
	}

	public void sayThing(){
		System.out.println(message);
	}

	public String toString(){
		return message;
	}
}