public class Driver{
public static void main(String[] argv){

	
MeanMessage a = new MeanMessage();
a.actualWords();
System.out.println(a + "\n");

NiceMessage b = new NiceMessage();
b.actualWords();
System.out.println(b + "\n");

//for testing purposes
AbusiveMessage c = new AbusiveMessage();
c.actualWords();
System.out.println(c);


System.out.println("\n\n\nConservation: ");

//for conversation
Conversation d = new Conversation();
d.showConversation();

}
}