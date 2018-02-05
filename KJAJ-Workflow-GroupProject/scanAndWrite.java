//first part of the workflow project
//Project by Kyle Ruhl, James Dimino, Julie Hu, Archit Sahay
import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
public class scanAndWrite{

	//attributes:
	public String theName = "";
	public int age = 0;
	public String occupation = "";
	public int height = 0; //will be measured in inches only
	public double speed = 0.0;
	public double shoeSize = 0.0;
	public int hatSize = 0;
	
	//this array is used later just to simplify printing processes
	public String[] attributes = {	"Name", "Age", "Occupation", "Height", "Speed", "Shoe Size", "Hat Size" };

	//-------------------------------------------------------------------------
	//The following 7 methods all are scanners for each individual attribute:::::::
	public void scanForName(){
		for (int i = 0; i < 50; i++){ System.out.println(""); }
		System.out.println("Welcome to the Workflow! Please start by following the following prompts to create a person...");
		Scanner ScanNAME = new Scanner(System.in);
		System.out.println("\nPlease Type the NAME of your person:");
		theName = ScanNAME.nextLine();
	}
	
	public void scanForAge(){
		Scanner ScanAGE = new Scanner(System.in);
		System.out.println("\nPlease Type the AGE of your person (Whole Numbers ONLY):");
		age = ScanAGE.nextInt();
	}
	
	public void scanForOccupation(){
		Scanner ScanJOB = new Scanner(System.in);
		System.out.println("\nPlease Type the Occupation of your person:");
		occupation = ScanJOB.nextLine();
	}

	public void scanForHeight(){
		Scanner ScanHeight = new Scanner(System.in);
		System.out.println("\nPlease Type the Height (IN INCHES) of your person (Whole Numbers ONLY):");
		height = ScanHeight.nextInt();
	}
	
	public void scanForSpeed(){
		Scanner ScanSpeed = new Scanner(System.in);
		System.out.println("\nPlease Type the Speed (in MPM) of your person:");
		speed = ScanSpeed.nextDouble();
	}
	
	public void scanForShoeSize(){
		Scanner ScanShoe = new Scanner(System.in);
		System.out.println("\nPlease Type the Shoe Size of your person: \nNote: For half shoe sizes, use the decimal .5:" );
		shoeSize = ScanShoe.nextDouble();
	}
	
	public void scanForHatSize(){
		Scanner ScanHat = new Scanner(System.in);
		System.out.println("\nPlease Type the numerical Hat Size of your person:");
		hatSize = ScanHat.nextInt();
	}
	
	//------------------------------------------------------------------
	
	public void displayAttributes(){
		//this function clears the screen and then displays all the attributes that the user inputed
		for (int y = 0; y < 50; y++){
			System.out.println();
		}
		
		System.out.println("Here are the characteristics of your person:");
		System.out.println("Name: " + theName);
		System.out.println("Age: " + age);
		System.out.println("Occupation: " + occupation);
		System.out.println("Height: " + height + " Inches");
		System.out.println("Speed: " + speed + " MPH");
		System.out.println("Shoe Size: " + shoeSize);
		System.out.println("Hat Size: " + hatSize);
	}
	
	public void askCorrections(){
		//this function asks user if all their inputed responses are to thier liking
		
		Scanner ScanC = new Scanner(System.in);
		System.out.println("\n\nAre These Characteristics all Correct? \nFor 'yes', press ENTER. For 'no', type 'NO'");
		String answer = ScanC.nextLine();
		
		if (answer.equals("NO")){
			int[] counter = {1,2,3,4,5,6,7};
			Scanner ScanA = new Scanner(System.in);
			System.out.println("Which Characteristic do you wish to change?");
			for (int i = 0; i < counter.length; i++){
				System.out.println("For " + attributes[i]+", type " + counter[i]);
			}
			int numba = ScanA.nextInt();
				/*
				* These will use your answer as to what attribute you want to change 
				* and use recursion to change the answer. 
				*/
			
				if (numba <= 1){
					scanForName();
				}
				if (numba == 2){
					scanForAge();
				}
				if (numba == 3){
					scanForOccupation();
				}
				if (numba == 4){
					scanForHeight();
				}
				if (numba == 5){
					scanForSpeed();
				}
				if (numba == 6){
					scanForShoeSize();
				}
				if (numba >= 7){
					scanForHatSize();
				}
			
			//if they corrected something, the double checking process will happen again using recursion
			displayAttributes();
			askCorrections();	
		}	
	}
	
	public void writeTextFile(){
        try{
            // Create new file
            //CHANGE THE STRING BELOW FOR YOUR EDIFICATION
            String path = "/Users/imac/Downloads/AP2017/KJAJ-Workflow-GroupProject/Responses/";
			String kjaj = ".KJAJ";
			String txt = ".txt/";
            File file = new File(path + theName + kjaj + txt);

            // If file doesn't exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            // Write in file
			bw.write("\n--------------\n");
			bw.write("Name: " + theName);
			bw.write("\nAge: " + age);
			bw.write("\nOccupation: " + occupation);
			bw.write("\nHeight: " + height + " inches ");
			bw.write("\nSpeed: " + speed + " mph ");
			bw.write("\nShoe Size: " + shoeSize);
			bw.write("\nHat Size: " + hatSize);
			bw.write("\n--------------\n");

            // Close connection
            bw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    	System.out.println("\n\n\nDone! File is Written!");   
			}//ends write file
}
		