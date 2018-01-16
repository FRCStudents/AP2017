//package APCN;
import java.util.*;
public class APCNerd implements Comparable{

	public int[] intelegence = new int [5];
	public int[] speed = new int [5];
	public double[] laptopPerformance = new double [5];
	public String[] firstName = new String [5];
	public String[] firstNameZ = new String [5];
	public int[] intelegenceZ = new int [5];
	public boolean isSmarter;
	public boolean isFaster;
	public boolean hasBetterLaptop;
	
	public void getNames(){
		for (int x = 0; x < firstName.length; x++){
			Scanner names = new Scanner(System.in);
			System.out.println("Please Input a name for the number " + x + " student:");
			String a = names.nextLine();
			firstName[x] = a;
		}
	}
	
	public void fillIntelegenceArray(){
		System.out.println("\n\nIntelegence Level input MUST BE between 1 and 10. Whole numbers only.");
		for (int x =0; x < firstName.length; x++){
			Scanner intelege = new Scanner(System.in);
			System.out.println("Please Input the Intelegence Level for "+ firstName[x]+":");
			//if ((intelege.nextInt() >= 1) && (intelege.nextInt() <= 10)){
				intelegence[x] = intelege.nextInt();
				/*}else{
					System.out.println("Not an acceptable intelegence level");
				}*/
		}
	}
	
	public void fillSpeedArray(){
		System.out.println("\n\nSpeed Input MUST BE Whole numbers only.");
		for (int x =0; x < firstName.length; x++){
			Scanner mph = new Scanner(System.in);
			System.out.println("Please Input the Speed for "+ firstName[x]+":");
				speed[x] = mph.nextInt();	
		}
	}
	
	public void fillLaptopPerformArray(){
		System.out.println("\n\nLaptop Performance Input CAN BE Decimals.");
		for (int x =0; x < firstName.length; x++){
			Scanner lpa = new Scanner(System.in);
			System.out.println("Please Input the Laptop Performance for "+ firstName[x]+":");
				laptopPerformance[x] = lpa.nextDouble();	
		}
	}
	
	public void displaythearray(){
		for (int p = 0; p < 50; p++){
			System.out.println();
		}
		for (int i = 0; i < firstName.length; i++){
			System.out.println("{Name: " + firstName[i] + "  Intelegence Level: " + intelegence[i] + "  Speed: " + speed[i] + "  Laptop Performance: " + laptopPerformance[i] +"}");
			}
		}
		
		public void makeCopies(){
			//this makes copies for later use in the compare to where the array values arent sorted
			for (int t = 0; t < intelegence.length; t++){
				intelegenceZ[t] = intelegence[t];
			}
			
			for (int m = 0; m < firstName.length; m ++){
				firstNameZ[m] = firstName[m];
			}
		}
		
		
		public void SortNamesAlphabetically(){
			//oldFirstName = firstName;
			int j;
			boolean flag = true;
			String temp;
			
			while(flag){
				flag = false;
				for (j = 0; j < firstName.length - 1; j++){
					if (firstName[j].compareToIgnoreCase(firstName[j+1])>0){
						temp = firstName[j];
						firstName[j] = firstName[j+1];
						firstName[j+1] = temp;
						flag = true;
					}
				}
			}
		}
		
		public void displaySortedFirstNames(){
			System.out.println("\nFirst Names, sorted Aplabeticaly:");
			for (int g = 0; g < firstName.length; g++){
				System.out.print("[" + firstName[g] + "] ");
			}
			System.out.println();
		}
		
		public void sortIntelegence(){
			int[] oldIntelegence = intelegence; 
			Arrays.sort(intelegence);
		}
		
		public void displaySortedIntelegence(){
			System.out.println("\nIntelegence, sorted numerically ascending:");
			for (int g = 0; g < intelegence.length; g++){
				System.out.print("[" + intelegence[g] + "] ");
			}
			System.out.println();
		}
		
		//@Override
		public void compareTo(){
			Scanner question1 = new Scanner(System.in);
			System.out.println("\n\n\nWhich is the first object you want to compare?");
			for (int y = 0; y < firstNameZ.length; y++){
				System.out.println("For " + firstNameZ[y] + ", type '" + y + "'");
			}
			int choice1 = question1.nextInt();
			
			Scanner question2 = new Scanner(System.in);
			System.out.println("Which is the second object you want to compare?");
			for (int d = 0; d < firstNameZ.length; d++){
				System.out.println("For " + firstNameZ[d] + " type '" + d + "'");
			}
			int choice2 = question2.nextInt();
			
			System.out.println("Object 'A' Atributes: {" + firstNameZ[choice1] + ", Intelegence: " + intelegenceZ[choice1] + ", Laptop Performance: " + laptopPerformance[choice1] + ", Speed: " + speed[choice1]);
			System.out.println("Object 'B' Atributes: {" + firstNameZ[choice2] + ", Intelegence: " + intelegenceZ[choice2] + ", Laptop Performance: " + laptopPerformance[choice2] + ", Speed: " + speed[choice2]);
			
			if (intelegenceZ[choice1] > intelegenceZ[choice2]){
				boolean isSmarter = true;
					}
			if (intelegenceZ[choice1] < intelegenceZ[choice2]){
						boolean isSmarter = false;
							}
			
			if (speed[choice1] > speed[choice2]){
				boolean isFaster = true;
					}
			if (speed[choice1] < speed[choice2]){
				boolean isFaster = false;
							}
							
			if (laptopPerformance[choice1] > laptopPerformance[choice2]){
				boolean hasBetterLaptop = true;
					}
			if (laptopPerformance[choice1] < laptopPerformance[choice2]){
				boolean hasBetterLaptop = false;
							}		
					
			System.out.println("\n\nComparison between " + firstNameZ[choice1] + " & " + firstNameZ[choice2]);
			if (isSmarter == false){
				System.out.println(firstNameZ[choice2] + " is smarter");
					}
			if (isSmarter == true){
				System.out.println(firstNameZ[choice1] + " is smarter");
					}
		
			if (hasBetterLaptop == false){
				System.out.println(firstNameZ[choice2] + " has superior laptop");
					}
			if (hasBetterLaptop == true){
				System.out.println(firstNameZ[choice1] + " has superior laptop");
							}
							
			if (isFaster == false){
				System.out.println(firstNameZ[choice2] + " is faster");
					}
			if (isFaster == true){
				System.out.println(firstNameZ[choice1] + " is faster");
							}
		}
	
}//end