public class AbusiveMessage extends Message {
	
	public void showMSG() {
		msg = "You really suck!";
	}

	public String toString() {
		return "Oh you want a message... " + msg;
	}
}