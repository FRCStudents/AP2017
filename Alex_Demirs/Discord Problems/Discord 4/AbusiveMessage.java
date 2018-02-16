public class AbusiveMessage extends MeanMessage{
	String message = "I hate you";


public void sayThing(){
	System.out.print(message);
}

public String toString(){
	return message;
}

}