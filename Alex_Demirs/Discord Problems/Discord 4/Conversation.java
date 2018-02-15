public class Conversation{

String a;
public Message m[] = new Message[5];

public Conversation(){
	m[0] = new AbusiveMessage();
	m[1] = new MeanMessage();
	m[2] = new NiceMessage();
	m[3] = new AbusiveMessage();
	m[4] = new AbusiveMessage();

}

public void showConversation(){
	int x;
	for(x=0;x<5;x++){
		 a = m[x].toString();

		System.out.println("\n*********************");
		System.out.println("* " + a + " *");
		System.out.println("********************\n");
	}
}


}