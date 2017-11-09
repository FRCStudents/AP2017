class silverMedalDriver{

		public static void main (String[] argv){
			silverMedal e = new silverMedal();   /*this line needs changing with medal color*/
			System.out.println (e);
		
		//displaying facts about the winners
			String Owner = "Joey Rossi";
			String Time = "3:46.24 minutes";
			String gender = "Male";
			String country = "Canada";
			String height = "5 feet 8.5 inches";
			int weight = 145;
			int age = 24;
			int GoldMedals = 6;
			int SilverMedals = 15;
			int BronzeMedals = 13;
		
//printing 5 blank lines
			for(int x=0; x < 4; x++){
				System.out.println();
			}
	//printing out the silver owner information 		
			System.out.println("Here is some information about our winner, " + Owner + "!:");
			System.out.println(Owner + " is a " + age + " year old " + gender + " from " + country);
			System.out.println(Owner + " is " + height + " and weighs " + weight + " pounds");
			System.out.println(); //blank line for seperation
			System.out.println("Career medal totals:");
			System.out.println(GoldMedals + " Total Gold ");
			System.out.println(SilverMedals + " Total Silver");
			System.out.println("Best Silver Time = " + Time);   /*this line needs changing with medal color*/
			System.out.println(BronzeMedals + " Total Bronze");
						
		}
	}