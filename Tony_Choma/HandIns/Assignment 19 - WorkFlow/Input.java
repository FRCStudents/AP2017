import java.util.*;

public class Input{
//Attributes
      private String name;
      private int age;
      private int speed;
      private int height;
      private int shoeSize;
      private int hatSize;
//Scanner
      Scanner input = new Scanner(System.in);
//Contructor
      public Input(String n, int a, int s, int h, int sS, int hS){
            setName(n);
            setAge(a);
            setSpeed(s);
            setHeight(h);
            setShoeSize(sS);
            setHatSize(hS);
      }

//Printer boi
      public void printer(String print){
            System.out.println(print);
      }
//Getters and Setters
      public String getName(){
            printer("WAht is ur naem?>");
            name = input.nextLine();
            return name;
      }
      public void setName(String n){
            name = n;
      }

      public int getAge(){
            printer("What is your age?");
            age = input.nextInt();
            return age;
      }
      public void setAge(int a){
            age = a;
      }

      public int getSpeed(){
            printer("What is your speed?");
            speed = input.nextInt();
            return speed;
      }
      public void setSpeed(int s){
            speed = s;
      }

      public int getHeight(){
            printer("what is your height?");
            height = input.nextInt();
            return height;
      }
      public void setHeight(int h){
            height = h;
      }

      public int getShoeSize(){
            printer("wHAt is your shoe size?");
            shoeSize = input.nextInt();
            return shoeSize;
      }
      public void setShoeSize(int sS){
            shoeSize = sS;
      }

      public int getHatSize(){
            printer("WAht is your hat SIze");
            hatSize = input.nextInt();
            return hatSize;
      }
      public void setHatSize(int hS){
            hatSize = hS;
      }
}
