class goldMedalDriver{

		public static void main (String[] argv){
			goldMedal e = new goldMedal();
			System.out.println (e);
		
		//displaying facts about the winners
			String Owner = "Micheal Phelps";
			String Time = "3:31.34 minutes";
			String gender = "Male";
			String country = "The USA";
			String height = "6feet 3.5inches";
			int weight = 196;
			int age = 32;
			int GoldMedals = 18;
			int SilverMedals = 2;
			int BronzeMedals = 2;
		
//printing 7 blank lines
			for(int x=0; x < 4; x++){
				System.out.println();
			}
	//printing out the gold owner information 		
			System.out.println("Here is some information about our winner, " + Owner + "!:");
			System.out.println(Owner + " is a " + age + " year old " + gender + " from " + country);
			System.out.println(Owner + " is " + height + " and weighs " + weight + " pounds");
			System.out.println(); //blank line for seperation
			System.out.println("Career medal totals:");
			System.out.println(GoldMedals + " Total Gold ");
			System.out.println("Best Gold Time = " + Time);
			System.out.println(SilverMedals + " Total Silver");
			System.out.println(BronzeMedals + " Total Bronze");
			
			
		}
	}