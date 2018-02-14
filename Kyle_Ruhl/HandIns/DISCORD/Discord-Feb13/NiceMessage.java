public class NiceMessage extends Message{

public NiceMessage(){
this.message = "You are a fantastic communist, comrade.";
}

protected void sayThing(){
System.out.println(message);
}

public String toString(){
	return "\"" + message + "\" is the nice message.";
}

}
