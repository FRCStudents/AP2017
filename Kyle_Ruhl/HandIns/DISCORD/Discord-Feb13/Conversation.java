public class Conversation{

	Message[] arr = new Message[5];
	
	public Conversation(){
		this.arr[0] = new AbusiveMessage();
		this.arr[1] = new NiceMessage();
		this.arr[2] = new MeanMessage();
		this.arr[3] = new NiceMessage();
		this.arr[4] = new AbusiveMessage();
	}
	
	public void showConversation(){
		for (int y = 0; y < arr.length; y++){
			arr[y].putInBox();
		}
	}

}