public abstract class Message{

protected String message;

protected abstract void sayThing();

public String getMessage(){
	return message;
}

public void putInBox(){
	//^^^the for loops make the star boxing individualized per string
	
	int messageLength = message.length();
	//System.out.println(messageLength + "HERE");
	
	System.out.println();
	for (int i = 0; i < messageLength + 1; i++){
		System.out.print("*");
	}
	System.out.print("*");
	
	System.out.print("\n*" + message + "*");
	System.out.print("\n*");
	for (int i = 0; i < messageLength + 1; i++){
		System.out.print("*");
	}
	System.out.println();	
}

}
