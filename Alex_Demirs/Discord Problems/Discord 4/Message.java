public abstract class Message{

String message;

public abstract void sayThing();
public String getMessage(){
	return message;
}

public void putInBox(){
	System.out.println("\n*********************");
	System.out.println("* " + message + " *");
	System.out.println("********************\n");
}


}