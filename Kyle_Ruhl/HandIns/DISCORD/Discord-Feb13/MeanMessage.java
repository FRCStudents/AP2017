public class MeanMessage extends Message{

public MeanMessage(){
this.message = "You do not look good today, what are you, a capitalist!";
}

protected void sayThing(){
	System.out.println(message);
}

public String toString(){
	return "\"" + message + "\" is the mean message.";
}

}
