class DiscordEightA {

	static int num;
	
	public DiscordEightA() {
		num = 17;
	}

	public DiscordEightA(int n) {
		num = n;
	}

	public String toString() {
		return String.valueOf(num);
	}

	public static void main(String[] argv) {

		DiscordEightA a = new DiscordEightA(5);

		System.out.println(a);

	}
}

class DiscordEightB {

	static int discordNumber;

	public DiscordEightB() {
		discordNumber = 17;
	}

	public String toString() {
		return String.valueOf(discordNumber);
	}

	public static void main(String[] argv) {

		DiscordEightB b = new DiscordEightB();

		System.out.println(b);


	}
}