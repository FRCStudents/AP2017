class bronzeMedalDriver{

		public static void main (String[] argv){
			bronzeMedal e = new bronzeMedal();   /*this line needs changing with medal color*/
			System.out.println (e);
		
		//displaying facts about the winners
			String Owner = "Tina Underwood";
			String Time = "4:00.43 minutes";
			String gender = "Female";
			String country = "The Ukraine";
			String height = "6 feet 1 inches";
			int weight = 136;
			int age = 19;
			int GoldMedals = 2;
			int SilverMedals = 5;
			int BronzeMedals = 10;
		
//printing 5 blank lines
			for(int x=0; x < 4; x++){
				System.out.println();
			}
	//printing out the bronze owner information 		
			System.out.println("Here is some information about our winner, " + Owner + "!:");
			System.out.println(Owner + " is a " + age + " year old " + gender + " from " + country);
			System.out.println(Owner + " is " + height + " and weighs " + weight + " pounds");
			System.out.println(); //blank line for seperation
			System.out.println("Career medal totals:");
			System.out.println(GoldMedals + " Total Gold ");
			System.out.println(SilverMedals + " Total Silver");
			System.out.println(BronzeMedals + " Total Bronze");
			System.out.println("Best Bronze Time = " + Time);   /*this line needs changing with medal color*/
						
		}
	}