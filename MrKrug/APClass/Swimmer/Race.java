/*
 * Race
 */
import java.util.*;

public class Race {
    final int SWIMMER_COUNT = 5;
    Swimmer[] swimmers = new Swimmer[SWIMMER_COUNT];
    int[] lanes = new int[SWIMMER_COUNT];

    public Race(){
      for(int i=0; i < SWIMMER_COUNT; i++){
        swimmers[i] = new Swimmer();
      }
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

    public void displaySwimmersInLanes(){
      for(int i=0; i < SWIMMER_COUNT; i++){
        System.out.println("Lane " + (i + 1) + ": " + swimmers[lanes[i]]);
      }
    }
}
