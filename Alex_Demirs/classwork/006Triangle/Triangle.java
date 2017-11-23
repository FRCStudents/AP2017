import java.util.Scanner;
public class Triangle{

public void isItATriangle(){
 
  Scanner firstSide = new Scanner(System.in);
  System.out.println("Side 1 length");
  int side1 = firstSide.nextInt();

  Scanner secondSide = new Scanner(System.in);
  System.out.println("Side 2 length");
  int side2 = secondSide.nextInt();

  Scanner thirdSide = new Scanner(System.in);
  System.out.println("Side 3 length");
  int side3 = thirdSide.nextInt();


    if(side1 + side2 > side3){
      if(side1 + side3 > side2){
        if(side2 + side3 > side1){
          System.out.println("Yes");

          if ((side1 == side2) && (side2 == side3) && (side3 == side1)){
            System.out.println("Tis' Equalateral");
          }

          if (((side1 == side2) && (side2 != side3)) || ((side2 == side3) && (side3 != side1)) || ((side3 == side1) && (side3 != side2))){
            System.out.println("Tis' Isosoleces!");
          }

          System.out.println("");
    }

    }
}
}
}
