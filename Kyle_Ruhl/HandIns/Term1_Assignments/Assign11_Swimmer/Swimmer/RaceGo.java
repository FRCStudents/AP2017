
/*
 * Race Driver
 */

import java.util.*;

class RaceGo {
  public static void main(String[] argv){
    Race r = new Race();
    for(int i = 0; i < r.getSwimmerCount(); i++){
		System.out.print("Enter Name: ");
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
	
	System.out.println("Information about the Winner: " + "Lane 2" + " has won this race. Their time was: 5:30:21. This is their first medal ever.");
  }
 }
