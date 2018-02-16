public class Conversation {

	private Message[] convo = new Message[5];

	public Conversation() {
		convo[0] = new MeanMessage();
		convo[1] = new AbusiveMessage();
		convo[2] = new NiceMessage();
		convo[3] = new NiceMessage();
		convo[4] = new MeanMessage();
	}

	public void showConversation() {
		for (int i = 0; i < convo.length; i++) {
			convo[i].putInBox();
		}
	}
}