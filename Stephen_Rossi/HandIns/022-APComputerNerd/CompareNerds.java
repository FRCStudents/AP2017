import java.util.*;

class CompareNerds{
	private static APComputerNerd[] nerds;

	public static void startCompare(){
		Scanner sc = new Scanner(System.in);
		System.out.print("How many Nerds would you like to create? \n         >>> ");
		int n = sc.nextInt();
		nerds = new APComputerNerd[n];
			for(int i = 0; i < n; i++){
				System.out.print("What is Nerd "+ (i + 1) +"'s name? \n         >>> ");
				String name = sc.next();
				System.out.print("How old is "+name+"? \n         >>> ");
				int age = sc.nextInt();
				System.out.print("What is "+name+"'s intelligence level? \n         >>> ");
				int intelligence = sc.nextInt();
				System.out.print("What is "+name+"'s computer speed? \n         >>> ");
				int compSpeed = sc.nextInt();
				createNerd(age, name, compSpeed, intelligence, i);
			}
		comparisonMethodMenu();
	}

	public static void createNerd(int age, String name, int compSpeed, int intelligence, int current){
		APComputerNerd nerd = new APComputerNerd(age, name, compSpeed, intelligence);
		int x = nerds.length;
		nerds[current] = nerd;
	}

	public static void comparisonMethodMenu(){
		Scanner sc = new Scanner(System.in);
		System.out.println("+========================+");
		System.out.println("+= Method of Comparison =+");
		System.out.println("+= ~~~~~~~~~~~~~~~~~~~~ =+");
		System.out.println("+=      1. Name         =+");
		System.out.println("+=       2. Age         =+");
		System.out.println("+=    3. Intelligence   =+"); 
		System.out.println("+=     4. Comp Speed    =+"); 
		System.out.println("+=                      =+");
		System.out.print("+========================+ \n                >>> ");
		int choice = sc.nextInt();
		parseMenu(choice); 
	}  

	public static void parseMenu(int choice){
		if(choice == 1){
			compareTheNerdsName();
		} else if (choice == 2) {
			compareTheNerdsAge();
		} else if (choice == 3) {
			compareTheNerdsIntelligence();
		} else if (choice == 4) {
			compareTheNerdsCompSpeed();
		} else {
			System.out.println("Error! Option not valid, please try again");
			comparisonMethodMenu();
		}
	}

	public static void compareTheNerdsAge() {
		for(int i = 0; i < nerds.length - 1; i++){
			if((nerds[i].getAge() <= nerds[i+1].getAge())){
				APComputerNerd placeholder = nerds[i];
				nerds[i] = nerds[i+1];
				nerds[i+1] = placeholder;
			}
		}
		boolean complete = true;
		for(int i = 0; i < nerds.length - 1; i++){
			boolean x = nerds[i].getAge() > nerds[i+1].getAge();
			complete = complete && x;
		}
		if(complete == true){
			printNerds();
		} else {
			compareTheNerdsAge();
		}
	}	

	public static void compareTheNerdsIntelligence() {
		for(int i = 0; i < nerds.length - 1; i++){
			if((nerds[i].getIntelligence() <= nerds[(i+1)].getIntelligence())){
				APComputerNerd placeholder = nerds[i];
				nerds[i] = nerds[i+1];
				nerds[i+1] = placeholder;
			}
		}
		boolean complete = true;
		for(int i = 0; i < nerds.length - 1; i++){
			boolean x = nerds[i].getIntelligence() > nerds[i+1].getIntelligence();
			complete = complete && x;
		}
		if(complete == true){
			printNerds();
		} else {
			compareTheNerdsIntelligence();
		}
	} 

	public static void compareTheNerdsCompSpeed() {
		for(int i = 0; i < nerds.length; i++){
			if((nerds[i].getComputerSpeed() <=  nerds[i+1].getComputerSpeed())){
				APComputerNerd placeholder = nerds[i];
				nerds[i] = nerds[i+1];
				nerds[i+1] = placeholder;
			}
		}
		boolean complete = true;
		for(int i = 0; i < nerds.length - 1; i++){
			boolean x = nerds[i].getComputerSpeed() > nerds[i+1].getComputerSpeed();
			complete = complete && x;
		}
		if(complete == true){
			printNerds();
		} else {
			compareTheNerdsCompSpeed();
		}
	} 

	public static void compareTheNerdsName() {
		System.out.println("xd");
	} 
	public static void printNerds(){
		for(int i = 0; i < nerds.length; i++){
			System.out.println(nerds[i]);
		}
		goAgain();
	}
	public static void goAgain(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Would you like to go again? (y/n) \n       >>>");
		String choice = sc.next();
		char x = choice.charAt(0);
		if(x == 'y'){
			comparisonMethodMenu();
		} else if (x == 'n') {
			System.exit(0);
		} else {
			System.out.println("error!");
			goAgain();
		}
	}

	public static void main(String[] argv){
		startCompare();
	}
}