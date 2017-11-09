import java.util.Scanner;
class triangle{

public void isItATriangle(){
  /*
  *This is scanning to get the three sides, stored as side 1, side 2, and side 3.
  *****************************************************************
  */
  Scanner firstSide = new Scanner(System.in);
  System.out.println("Please put in your first side length: ");
  int side1 = firstSide.nextInt();

  Scanner secondSide = new Scanner(System.in);
  System.out.println("Please put in your second side length: ");
  int side2 = secondSide.nextInt();

  Scanner thirdSide = new Scanner(System.in);
  System.out.println("Please put in your third side length: ");
  int side3 = thirdSide.nextInt();

  System.out.println("\nNow calculating to see if you have a Triangle...");
  System.out.println("Your first side value: " + side1 + "\nYour second side value: " + side2 + "\nYour third side value: " + side3 + "\n");

  //*****************************************************************
  /*
  *This is seeing is the sides are going to be enough for a Triangle
  *using Triangle Inequality Theorem
  */
    if(side1 + side2 > side3){
      if(side1 + side3 > side2){
        if(side2 + side3 > side1){
          System.out.println("Yes! This is a Triangle!");
        }else{
          System.out.println("No, Not a Triangle");
        }
      }else{
        System.out.println("No, Not a Triangle");
      }
    }else{
      System.out.println("No, Not a Triangle.");
      return;
    }
  }
}
