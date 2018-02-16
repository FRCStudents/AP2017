public class NiceMessage extends Message {
	
	public void showMSG() {
		msg = "You don't suck!";
	}

	public String toString() {
		return "Oh you want a message... " + msg;
	}
}