public class DiscordEightA {

	static int num;
	
	public DiscordEightA() {
		num = 17;
	}

	public DiscordEightA(int n) {
		num = n;
	}

	public String toString() {
		return "" + num;
	}
}

public class DiscordEightB {

	static int discordNumber;

	public DiscordEightB() {
		discordNumber = 17;
	}

	public String toString() {
		return "" + discordNumber;
	}
}

public class DiscordEightDriver {

	public static void main(String[] argv) {

	DiscordEightA a = new DiscordEightA(5);

	DiscordEightB b = new DiscordEightB();


	}
}