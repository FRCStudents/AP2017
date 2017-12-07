import java.util.*;
public class Triangle{

public double s;
public double parea;


public void printTriangle(){
          System.out.println(" /\\");
          System.out.println("/  \\");        
          System.out.println("----");
}

public void isItATriangle(){
 
  Scanner firstSide = new Scanner(System.in);
  System.out.println("Side 1 length");
  double side1 = firstSide.nextInt();

  Scanner secondSide = new Scanner(System.in);
  System.out.println("Side 2 length");
  double side2 = secondSide.nextInt();

  Scanner thirdSide = new Scanner(System.in);
  System.out.println("Side 3 length");
  double side3 = thirdSide.nextInt();

    if(side1 + side2 > side3){
      if(side1 + side3 > side2){
        if(side2 + side3 > side1){
          System.out.println("Yes");

          if ((side1 == side2) && (side2 == side3) && (side3 == side1)){
            System.out.println("Tis' Equalateral");
          }

          else if (((side1 == side2) && (side2 != side3)) || ((side2 == side3) && (side3 != side1)) || ((side3 == side1) && (side3 != side2))){
            System.out.println("Tis' Isosoleces!");
          }

          else if ((side1 != side2) && (side1 != side3) && (side2 != side3)){
            System.out.println("Tis' Scaleane");
          }
        }
      }
    }

    s = ((side1 + side2 + side3) / 2);
    parea = (s * (s - side1) * (s - side2) * (s - side3));

    System.out.println("The area is " + (Math.sqrt(parea)));
  }
}
