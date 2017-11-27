import java.util.*;

public class Race {
    final int SWIMMER_COUNT = 5;
    Swimmer[] swimmers = new Swimmer[SWIMMER_COUNT];
    int[] lanes = new int[SWIMMER_COUNT];
    int remember = -1; 

    public Race(){
      for(int i=0; i < SWIMMER_COUNT; i++){
        swimmers[i] = new Swimmer();
      }
    }

    public int getSwimmerCount(){
      return SWIMMER_COUNT;
    }

    public void acceptSwimmer(int swimmerIdx){
        Scanner s = new Scanner(System.in);
        System.out.println("Insert swimmer name. (There are " + SWIMMER_COUNT + " swimmers)");
        swimmers[swimmerIdx].setName(s.next());
    }

    public void placeSwimmerInLane(int swimmerIdx, int lane){
      Scanner s = new Scanner(System.in);
      int lane2 = lane;
      int varIdx = swimmerIdx; 

      if (swimmerIdx == 0) { 
        remember = lane;
        lane2 = lane;
      }

      
      for (int i = lane2; varIdx != 0; i = lane2) { 
        if (i == remember || lanes[i - 1] != 0) {
          System.out.println("Lane is already full. Please choose another lane. (Others)");
          lane2 = s.nextInt();
        } else {
            lane2 = i;
            varIdx = 0; 
          }
      }

      lanes[lane2 - 1] = swimmerIdx; 


      System.out.println("swimmerIdx: " + swimmerIdx);
      System.out.println("lane: " + lane2);
      for (int i = 0; i < SWIMMER_COUNT; i++) {
        System.out.print("[" + lanes[i] + "]");
      }
      System.out.println("");
      
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