import java.util.Scanner;

public class APComputerNerd{
        int intelligence; //1-10
        int speed;//1-10
        int laptopPerformance;//Based off PassMark CPU Benchmarks
        String firstName;

        public APComputerNerd(){
             this(9,6,10, "FROG");
       }

        public APComputerNerd(int i,int s, int p, String fN){
             i.setIntelligence();
             s.setSpeed();
             p.setLaptopPerformance();
             fN.setFirstName();
       }

//getters and setters for intel
        public int getIntelligence(){
                return intelligence;
        }
        public void setIntelligence(int i){
             if(i > 9 || i < 10){
                   System.out.println("Intelligence " + i + " within the range of 9-10");
                   return;
             }
             if(i < 9 || i > 10){
                   System.out.println("Intelligence " + i + " is not within range of 9-10");
                   return;
             }
             intelligence = i;
        }
//getters and setters for speed
        public int getSpeed(){
                return speed;
        }
        public void setSpeed(int s){
             if(s > 5 || s < 9999){
                   System.out.println("Speed " + s + " is within range of 5-9999");
                   return;
             }
             if(s < 5 || s > 9999){
                   System.out.println("Speed " + s + " is not within range of 5- 9999");
                   return;
             }
                speed = s;
        }
//getters and setters for laptopPerf
        public int getLaptopPerformance(){
                return laptopPerformance;
        }
        public void setLaptopPerformance(int newLaptopPerformance){
                laptopPerformance = newLaptopPerformance;
        }
//getters and setters for firstName
        public String getFirstName(){
                return firstName;
        }
        public void setFirstName(String fN){
                firstName = fN;
        }
}
