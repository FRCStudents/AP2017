
/*
 * Race Driver
 */

import java.util.*;

class RaceGo {
  public static void main(String[] argv){
    Race r = new Race();
    //r.displayLanes();
    for(int i = 0; i < r.getSwimmerCount(); i++){
      System.out.print("Please enter name: ");
      r.acceptSwimmer(i);
    }

    Scanner s = new Scanner(System.in);

    for(int i = 0; i < r.getSwimmerCount(); i++){
      System.out.println(r.getSwimmer(i).getName() + " in lane: ");
      int lane = s.nextInt();
      r.placeSwimmerInLane(i, lane);
    }


    System.out.println("Displaying swimmers: ");
    r.displaySwimmers();
    System.out.println("Displaying swimmers in lanes: ");
    r.displaySwimmersInLanes();
    //r.displayLanes();
  }
}
