package APCompNerd;
import java.util.Scanner;

public class APCompNerd implements IAPCompNerd, Comparable {
	static String firstName;
	static int intelligence;
	static int speed;
	static int lapTopPerformance;

	// sortType = true ? sort by name
	// sortType = false ? sort by intelligence
	private boolean sortType;

	public APCompNerd(){
		this("RoboMan", 9, 4, 0);
	}

	public APCompNerd(String n, int i, int s, int p){
		firstName = n;
		setIntelligence(i);
		setSpeed(s);
		setLapTopPerformance(p);
		sortType = true;
	}

	public APCompNerd(APCompNerd acn){
		setFirstName(acn.getFirstName());
		setIntelligence(acn.getIntelligence());
		setSpeed(acn.getSpeed());
		setLapTopPerformance(acn.getLapTopPerformance());
	}

	public void setFirstName(String n){
		firstName = n;
	}

	public void setSortTypeName(){
		sortType = true;
	}

	public void setSortTypeIntelligence(){
		sortType = false;
	}

	public String getFirstName(){
		return firstName;
	}

	public int getIntelligence(){
		return intelligence;
	}

	public int getSpeed(){
		return speed;
	}

	public int getLapTopPerformance(){
		return lapTopPerformance;
	}

	public void setSpeed(int s){
		if(s < 4 || s > 18){
			System.out.println("Speed " + s + " is out of 4 - 18 range");
			return;
		}
		speed = s;
	}

	public void setIntelligence(int i){
                if(i < 9 || i > 10){
                        System.out.println("Intelligence " + i + " is out of 9 - 10 range");
                        return;
                }
		intelligence = i;
	}

	public void setLapTopPerformance(int p){
                if(p < 0 || p > 10){
                        System.out.println("Lap Top Performance " + p + " is out of 0 - 10 range");
                        return;
                }
		lapTopPerformance = p;
	}

	// compares alphabetic on first name
	// 	or numeric on intelligence - depending on sortType (false)
	public int compareTo(Object p){
		APCompNerd acn = (APCompNerd)p;

		String t1 = this.getFirstName();
		String p1 = acn.getFirstName();
		int i1 = this.getIntelligence();
		int i2 = acn.getIntelligence();

		if(i1 == i2 && !sortType){
			return 0;
		}

		if(t1.equals(p1) && sortType){
			return 0;
		}

		if(sortType){
			return compareStrings(t1, p1);
		}
		return compareInts(i1, i2);
	}

	// Note: this comparison returns 0 if 2 strings are
	//	 different lengths, but match for the length
	// 	 of the shorter string
	//
	private int compareStrings(String t1, String p1){
                for(int i=0; (i < t1.length() && i < p1.length()); i++){
                        if(t1.charAt(i) > p1.charAt(i)){
                                return 1;
                        }
                        if(t1.charAt(i) < p1.charAt(i)){
                                return -1;
                        }
                }
                return 0;
	}

	private int compareInts(int i1, int i2){
		if(i1 > i2) return 1;
		if(i1 < i2) return -1;
		return 0;
	}

	public void showAPCompNerd(){
		System.out.println("Name: \t" + getFirstName() + "\t" + getIntelligence() + "\t" + getSpeed() + "\t" + getLapTopPerformance());
	}
}
