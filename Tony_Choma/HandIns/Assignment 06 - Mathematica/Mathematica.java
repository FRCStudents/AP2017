public class Mathematica {
//Attributes

        int num01 = 24;
        int num02 = 10;
        int num03;
//Getters and setters

        int getNum01(){
                return num01;
        }
        void setNum01(int newNum01){
                num01 = newNum01;
        }

        int getNum02(){
                return num02;
        }
        void setNum02(int newNum02){
                num02 = newNum02;
        }

        int getNum03(){
                return num03;
        }
        void setNum03(int newNum03){
                num03 = newNum03;
        }
//Arithmetic stuffs
        //Adding
        int add(int a,int b){
                return a + b;
        }
        //Subtracting
        int subtract(int a, int b){
                return a - b;
        }
        //Multiplying
        int multiply(int a, int b){
                return a * b;
        }
        //Dividing
        public double divide(int a, int b){
                return (double)a / b;
        }
        //BOOLEAN THING
        public boolean isDivisibleBy(int p, int q){
                if((p % q) == 0){
                        return true;
                }else{
                        return false;
                }
        }
public static void main(String[] args){
        Mathematica m = new Mathematica();
        System.out.println("Result from the method add() is " + m.add(2,5));
        System.out.println("Result from the method subtract() is " + m.subtract(17,15));
        System.out.println("Result from the method multiply() is " + m.multiply(9,3));
        System.out.println("Result from the method divide() is " + m.divide(20,7));
        System.out.println("Result from the method isDivisibleBy() is " + m.isDivisibleBy(2,3));

}


}
