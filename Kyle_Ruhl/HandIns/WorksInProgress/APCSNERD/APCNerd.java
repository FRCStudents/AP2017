import java.util.Arrays;
public class APCNerd implements Comparable{

	int intelegence;
	int speed;
	int laptopPerformance;
	String firstName;
	
	//getters and setters: **********************************************
	//intelegence:
	public int getIntelegence(){
		return intelegence;
	}
	
	public void setIntelegence(int intele){
		this.intele = intelegence;
	}
	
	//speed:
	public int getSpeed(){
		return speed;
	}
	
	public void setSpeed(int Speed){
		this.Speed = speed;
	}
	
	//Laptop performance;
	public int getLaptopPerformance(){
		return laptopPerformance;
	}
	
	public void setLaptopPerformance(int performance){
		this.performance = laptopPerformance;
	}	
	
	//first name:
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String name){
		this.name = firstName;
	}
	//*************************************************************
	//Methods (2 sorts, 1 comapre to)

	public void sortIntelegence(){
		int[] intelegente = {Allison.intelegence, Aretha.intelegence, Vickter.intelegence, Mike.intelegence, Francis.intelegence};
		Arrays.sort(intelegente);
		System.out.println("Modified Intelegence Array: %s", Arrays.toString(intelegente));
	}
	
	public void sortFirstName(){
		String[] names = {Allison.firstName, Aretha.firstName, Vickter.firstName, Mike.firstName, Francis.firstName};
		Arrays.sort(names);
		System.out.println("Modified Names Array: \n%s\n\n", Arrays.toString(names));
	}
	
	public int[] compareTo(object a, object b){
		APCNerd A = (APCNerd)a;
		APCNerd B = (APCNerd)b;
		
	}
}