public class Driver{
public static void main(String[] argv){

	System.out.println("*************************************************************************************************");
	System.out.println("Running methods: \n\n");
	
MeanMessage a = new MeanMessage();
a.sayThing();
System.out.println(a + "\n");

NiceMessage b = new NiceMessage();
b.sayThing();
System.out.println(b + "\n");

//for testing purposes
AbusiveMessage c = new AbusiveMessage();
c.sayThing();
System.out.println(c);

System.out.println("*****************************************************************************************************");
System.out.println("\n\n\nConservation: ");

//for conversation
Conversation d = new Conversation();
d.showConversation();

}
}
