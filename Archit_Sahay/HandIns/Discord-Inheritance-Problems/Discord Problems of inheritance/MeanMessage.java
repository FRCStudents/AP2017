public class MeanMessage extends Message{

public MeanMessage(){
this.message = "You code bad";
}

protected void actualWords(){
	System.out.println(message);
}

public String toString(){
	return "\"" + message + "\" is the mean message.";
}

}