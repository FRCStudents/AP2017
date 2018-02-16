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
//Contructors
      public Input(String n, int a, int s, int h, int sS, int hS){
            setName(n);
            setAge(a);
            setSpeed(s);
            setHeight(h);
            setShoeSize(sS);
            setHatSize(hS);
      }

      public Input(){
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
            printer("what is your height in inches?");
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

      public static void main(String[] args){
            Input i = new Input();
            //Input("Shjt", 95, 2121, 122, 65, 12);
            i.getName();
            i.getAge();
            i.getSpeed();
            i.getHeight();
            i.getShoeSize();
            i.getHatSize();
            System.out.println("Hello " + i.name + ", you are " + i.age +
                              ", you have a speed of " + i.speed +
                              ", height of " + i.height +
                              " inches, shoe size of " + i.shoeSize +
                              " and a hat size of " + i.hatSize +".");
      }
}
