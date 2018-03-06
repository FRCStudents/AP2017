public class Conversation {

	Message[] array = new Message[5];

	public Conversation(){
		array[0] = new MeanMessage();
		array[1] = new NiceMessage();
		array[2] = new AbusiveMessage();
		array[3] = new MeanMessage();
		array[4] = new NiceMessage();
	}

	public void showConversation(){
		for(int p = 0; p < array.length; p++){
			array[p].putInBox();
		}
	}
}