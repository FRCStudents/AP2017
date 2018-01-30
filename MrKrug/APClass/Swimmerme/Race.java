/*
 * Race
 */
import java.util.*;
import java.util.Scanner;

public class Race {
	int SWIMMER_COUNT;
    Swimmer[] swimmers = new Swimmer[SWIMMER_COUNT];
    int[] lanes = new int[SWIMMER_COUNT];

    public Race(){
      for(int i=0; i < SWIMMER_COUNT; i++){
        swimmers[i] = new Swimmer();
      }
    }

    public int getSwimmerCount(){
	return SWIMMER_COUNT;
	}
	public void setSwimmerCount(int swum){
		SWIMMER_COUNT = swum;
	}

    public void acceptSwimmer(int swimmerIdx){
        Scanner s = new Scanner(System.in);
        swimmers[swimmerIdx].setName(s.next());
    }

    public void placeSwimmerInLane(int swimmerIdx, int lane){
      lanes[lane-1] = swimmerIdx;
    }

    public Swimmer getSwimmer(int i){
        return swimmers[i];
    }

    public void displaySwimmers(){
      for(int i=0; i < SWIMMER_COUNT; i++){
        System.out.println(swimmers[i]);
      }

    }
    public void dropinSwimmerCount(){
    	 Scanner t = new Scanner (System.in);
    System.out.print("How many swimmers?");
    int SWIMMER_COUNT = t.nextInt();
    }

    public void displaySwimmersInLanes(){
      for(int i=0; i < SWIMMER_COUNT; i++){
        System.out.println("Lane " + (i + 1) + ": " + swimmers[lanes[i]]);
      }
    }
}
