public class MessageDriver {
	
	public static void main(String[] args){

		System.out.println("------------------------------------- Messages ---------------------------------------------");
		
		MeanMessage mm = new MeanMessage();
			mm.sayThing();
			System.out.println(mm);

		NiceMessage nm = new NiceMessage();
			nm.sayThing();
			System.out.println(nm);

		AbusiveMessage ab = new AbusiveMessage();
			ab.sayThing();
			System.out.println(ab);

		System.out.println("----------------------------------- Converstaions ------------------------------------------");

		Conversation c = new Conversation();
			c.showConversation();
	}
}