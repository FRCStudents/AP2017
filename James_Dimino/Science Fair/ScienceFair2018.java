import java.util.Scanner;

public class ScienceFair2018 {

	private int q0;
	private int q1;
	private int q2;
	private int q3;
	private int q4;
	private double buildTimeCost;

	public void clearPage() {
		for(int b = 0; b <= 80; b++){
        System.out.print("\n");
       	}
	}

	public void question0(){
		clearPage();
		Scanner scanner00 = new Scanner (System.in);
		System.out.println("What is your budget for building a computer?");
		q0 = scanner00.nextInt();
	}
	//Asks a question
	public void question1() {
		clearPage();
		Scanner scanner01 = new Scanner(System.in);
		System.out.println("What do you plan on using your computer for?");
		System.out.println("1 -> Light User: Browsing\n2 -> Moderate User: Video Streaming/Browsing\n3 -> Heavy User: Gaming/Production");

		q1 = scanner01.nextInt();
	}

	//Asks a question
	public void question2() {
		clearPage();
		Scanner scanner02 = new Scanner(System.in);
		System.out.println("How experienced are you in building computers?");
		System.out.println("1 -> Never built a computer\n2 -> I've helped build a computer before\n3 -> I know everything about building computers");

		q2 = scanner02.nextInt();
	}

	//Asks a question
	//Converts average anual salary to hourly salary
	public void question3() {
		clearPage();
		Scanner scanner03 = new Scanner(System.in);
		System.out.println("What is your average annual salary?");

		q3 = scanner03.nextInt();

		q3 = (q3 / 52) / 40;
		System.out.println(q3);
	}

	//Asks a question
	public void question4() {
		clearPage();
		Scanner scanner04 = new Scanner(System.in);
		System.out.println("How much would you enjoy building a computer?");
		System.out.println("1 -> I'd hate it\n2 -> I wouldn't mind it\n3 -> I'd thoroughly enjoy it");

		q4 = scanner04.nextInt();
	}

	//Where the main calculations take place
	public void theFuckingBrains() {
		calcBTCost();
		//If you said you'd hate building a computer...
		//The program will give you options of prebuilt computers dependent on your price range
		if ((q0 * .186) < buildTimeCost) 
			System.out.println("You should buy a computer!\nHere are some options for your price range:");
			if (q1 == 1) {
				lowPreBComp();
			}
			if (q1 == 2) {
				modPreBComp();
			}
			if (q1 == 3) {
				highPreBComp();
			}
		
		//If your hourly salary is greater than $24...
		//The program will give you options of custom built computers dependent on your price range
		if ((q0 * .186) > buildTimeCost) {
			System.out.println("You should build a computer!\n");
			if (q4 == 2) {
				System.out.println("Building a computer may seem difficult at first, but with a little bit of research, you will be amazed with the results you produce!\n");
				if (q1 == 1) {
					lowCustomComp();
				}
				if (q1 == 2) {
					modCustomComp();
				}
				if (q1 == 3) {
					highCustomComp();
				}
			}
			if (q4 == 3) {
				if (q1 == 1) {
					lowCustomComp();
				}
				if (q1 == 2) {
					modCustomComp();
				}
				if (q1 == 3) {
					highCustomComp();
				}
			}
		}
		//Prints some extra information depending on how experienced you are with building computers
		if (q2 == 1) {
			System.out.println("\nBuilding a computer can seem intimidating at first...");
			System.out.println("Here are some sources to help you build your first computer:");
			System.out.println("\nYouTube Video: https://www.youtube.com/watch?v=IhX0fOUYd8Q");
			System.out.println("Website Text Instructional: https://www.digitaltrends.com/computing/how-to-build-a-computer/6/");
			System.out.println("\nGood Luck!");
		}

		if (q2 == 2) {
			System.out.println("\nMake sure to use the skills you learned last time on your new computer build...");
			System.out.println("Here are some sources to help you build your first computer:");
			System.out.println("\nYouTube Video: https://www.youtube.com/watch?v=IhX0fOUYd8Q");
			System.out.println("Website Text Instructional: https://www.digitaltrends.com/computing/how-to-build-a-computer/6/");
			System.out.println("\nGood Luck!");
		}

		if (q3 == 3) {
			System.out.println("\nTry to improve your computer building speed this time around!");
			System.out.println("\nGood Luck!");
		}
	}

	public void lowPreBComp() {
		System.out.println("\nYour Optimal Computer: ");
		System.out.println("Option 1:\nLenovo - 310S-08IAP Desktop - Intel Pentium - 4GB Memory - 500GB Hard Drive - Silver\n Price: $299.99 (Best Buy)");

		System.out.println("\n\n");

		System.out.println("Option 2:\nDell - Inspiron Desktop - Intel Core i3 - 8GB Memory - 1TB Hard Drive - Black\n Price: $379.99 (Best Buy)");

		System.out.println("\n\n");

		System.out.println("Option 3:\nHP - Desktop - Intel Core i3 - 4GB Memory - 500GB Hard Drive - Black\n Price: $443.99 (Best Buy)");
	}

	//Prints custom computer in low budget category
	public void lowCustomComp() {
		System.out.println("Your Optimal Computer: ");
		//This is a pre-built computer on Amazon. The savings below are based off of finding proprietary parts off of other sites.
		System.out.println("Case :: Dell Optiplex 755 Small");
		System.out.println("Processor :: Intel Core 2 Dual Core Processor");
		System.out.println("Processor Cooling :: Dell RR527 Optiplex Cooling");
		System.out.println("Memory :: Dell A6993648 Memory Card");
		System.out.println("Motherboard :: Dell PU052 Optiplex Motherboard");
		System.out.println("Power Supply ::350 Watt - Standard");
		System.out.println("Primary Hard Drive :: Dell UU520 Hard Drive");
		System.out.println("Optical Drive :: Dell Proprietary DVD Drive");
		System.out.println("Network Card ::Onboard LAN Network (Gb or 10/100)");
		System.out.println("Software :: None");
		System.out.println("This computer would cost $271.99 pre-built");
		System.out.println("\nTotal Price (Microcenter):: $203.33 (Savings: $68.66; 24% of total cost)");
		System.out.println("Total Price (Newegg):: $261.48 (Savings: $10.51; 4% of total cost)");
		System.out.println("Total Price (Amazon):: $179.86 (Savings: $92; 34% of total cost)");
		//The Line below assumes that it will take you 1.5hrs to build a computer
		System.out.println("*According to your annual salary, it will cost you $" + buildTimeCost + " for the time it takes you to build the computer");
	}

	public void modPreBComp() {
		System.out.println("\nYour Optimal Computer: ");
		System.out.println("Option 1:\nDell - OptiPlex Desktop - Intel Core i3 - 4GB Memory - 500GB Hard Drive - Black\n Price: $469.99 (Best Buy)");

		System.out.println("\n\n");

		System.out.println("Option 2:\nHP - Desktop - Intel Core i5 - 4GB Memory - 500GB Hard Drive - Black\n Price: $569.52 (Best Buy)");

		System.out.println("\n\n");

		System.out.println("Option 3:\nDell - OptiPlex Desktop - Intel Core i5 - 8GB Memory - 1TB Hard Drive - Black\n Price: $682.99 (Best Buy)");
	}

	//Prints custom computer in moderate budget category
	public void modCustomComp() {
		System.out.println("Your Optimal Computer");
		//This is a pre-built computer on Best Buy. The savings below are based off of finding proprietary parts off of other sites.
		System.out.println("Case :: Black/Silver Mid Tower"); 
		System.out.println("Processor :: 6th Gen Intel Core i5-6400K"); 
		System.out.println("Memory :: 8gb DDR4 SDRAM 2133 mhz"); 
		System.out.println("Video Card :: NVIDIA GeForce GT 730"); 
		System.out.println("Motherboard :: (None Listed) (Substitute found)"); 
		System.out.println("Power Supply :: 300w Power Supply"); 
		System.out.println("Primary Hard Drive :: Western Digital 1TB 7200rpm"); 
		System.out.println("Optical Drive :: DVD/CD Optical Drive"); 
		System.out.println("Software :: Windows 10 Home");
		System.out.println("This computer would cost $649.99 pre-built");
		System.out.println("\nTotal Price (Microcenter):: $574.92 (Savings: $75.07; 12% of total cost");
		System.out.println("Total Price (Newegg):: $600.94 (Savings: $49.05; 7% of total cost");
		System.out.println("Total Price (Amazon):: $563.19 (Savings: $86.80; 13% of total cost");
		//The Line below assumes that it will take you 1.5hrs to build a computer
		System.out.println("*According to your annual salary, it will cost you $" + buildTimeCost + " for the time it takes you to build the computer");
	}

	public void highPreBComp() {
		System.out.println("\nYour Optimal Computer: ");
		System.out.println("Option 1:\nCyberPowerPC - Gamer Xtreme Desktop - Intel Core i5-7400 - 8GB Memory - NVIDIA GeForce GTX 1050 Ti - 1TB Hard Drive - Black/Gray\n Price: $829.99 (Best Buy)");

		System.out.println("\n\n");

		System.out.println("Option 2:\nCyberPowerPC - Gamer Xtreme Desktop - Intel Core i7 - 16GB Memory - AMD Radeon RX 580 - Black/Red\n Price: $1,119.99 (Best Buy)");

		System.out.println("\n\n");

		System.out.println("Option 3:\nCyberPowerPC - Gamer Xtreme Desktop - Intel Core i7-8700 - 16GB Memory - NVIDIA GeForce GTX 1070 Ti - 2TB Hard Drive - Black\n Price: $1,479.99 (Best Buy)");
	}

	//Prints custom computer in high budget category
	public void highCustomComp() {
		System.out.println("Your Optimal Computer: ");
		//This is a pre-built computer on IBuyPower. The savings below are based off of finding proprietary parts off of other sites.
		System.out.println("Case :: Chimera 5 - Flame Edition");
		System.out.println("Processor :: Intel® Core™ i5-6600K Processor (4x 3.50GHz/6MB L3 Cache) - Intel® Core™ i5-6600K");
		System.out.println("Processor Cooling :: Asetek 510LC Liquid CPU Cooling System [SOCKET-1150/1151");
		System.out.println("Memory :: 8 GB [4 GB x2] DDR4-2400 Memory Module - Corsair or Major Brand");
		System.out.println("Video Card :: NVIDIA GeForce GTX 1080 - 8GB (GDDR5X) (VR-Ready)");
		System.out.println("Motherboard :: MSI Z170A PC Mate");
		System.out.println("Power Supply :: 350 Watt - Standard");
		System.out.println("Primary Hard Drive :: 1 TB Hard Drive -- 32MB Cache, 7200RPM, 6.0Gb/s - includes [FREE] 240GB ADATA SP550 SSD");
		System.out.println("Optical Drive :: 24X Super Multi Internal DVD Rewriter Optical Drive"); 
		System.out.println("Network Card :: Onboard LAN Network (Gb or 10/100)");
		System.out.println("Software :: Windows 10");
		System.out.println("This computer would cost $1599 pre-built");
		System.out.println("\nTotal Price (Microcenter):: $1,044.02 (Savings: $554.98; 35% of total cost");
		System.out.println("Total Price (Newegg):: $1,329.99 (Savings: $269.01; 17% of total cost");
		System.out.println("Total Price (Amazon):: $1,385.32 (Savings: $213.68; 33% of total cost");
		//The Line below assumes that it will take you 1.5hrs to build a computer
		System.out.println("*According to your annual salary, it will cost you $" + buildTimeCost + " for the time it takes you to build the computer");
	}

	//Calculates how much does it cost to build a computer
	//Based on average salary
	public void calcBTCost() {
		int time = 12;
		if (q2 == 1) time = time + 60;
		if (q2 == 2) time = time + 30;
		if (q4 == 1) time = time + 300;
		if (q4 == 2) time = time - 30;

		buildTimeCost = time * (q3/60);
	}

}