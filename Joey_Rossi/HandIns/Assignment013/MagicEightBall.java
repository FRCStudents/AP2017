import java.util.Random;

class MagicEightBall{
	
	public static void main (String [] args)
	{
		Random r = new Random();

		int choice = 1 + r.nextInt(11);
		String response = "";
		String question = "";

		if ( choice == 1 )
			response = "Concentrate and Ask Again";
			question = "No!";
		if ( choice == 2 )
			response = "Don't Count on It";
			question = "No!";
		if ( choice == 3 )
			response = "It Is Certain";
			question = "Yes!";
		if ( choice == 4 )
			response = "Most Likely";
			question = "Yes!";
		if ( choice == 5 )
			response = "My Reply is No";
			question = "No!";
		if ( choice == 6 )
			response = "My Sources Say No";
			question = "No!";
		if ( choice == 7 )
			response = "No";
			question = "No!";
		if ( choice == 8 )
			response = "Outlook good";
			question = "Yes!";
		if ( choice == 9 )
			response = "Yes, Definitely";
			question = "Yes!";
		if ( choice == 10 )
			response = "You May Rely on It";
			question = "Yes!";
		if ( choice == 11)
			response = "8-BALL ERROR";
			question = "Thank you, good bye!";

		System.out.println( "Magic 8-Ball Says: " + response);
	

	}

}