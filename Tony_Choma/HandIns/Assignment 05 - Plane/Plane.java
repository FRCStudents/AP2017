import java.util.Arrays;

public class Plane{
        int wingspan = 25;
        int[] anArray = {
                1,2,3,4,5,6,7,8,9,10
        };
        int weight = 5000;
        String Brand = "Boeing";

//Get Wingspan
        int getWingSpan(){
                return wingspan;
        }
//Set Wingspan
        void setWingSpan(int newWingSpan){
                wingspan = newWingSpan;
        }
//Get Weight
        int getWeight(){
                return weight;
        }
//Set Weight
        void setWeight(int newWeight){
                weight = newWeight;
        }

        public static void main(String[] args){
                Plane p = new Plane();
                System.out.println(Arrays.toString(p.anArray));
        }
}
