class Mathematica{
    private int num01;
    private int num02;
    private int num03;

    public void setNum01(int newNum01){
        num01 = newNum01;
    }
    public int getNum01(){
        return num01;
    }
    public void setNum02(int newNum02){
        num02 = newNum02;
    }
    public int getNum02(){
        return num02;
    }
    public void setNum03(int newNum03){
        num03 = newNum03;
    }
    public int getNum03(){
        return num03;
    }

    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
    public int multiply(int a, int b){
        return a * b;
    }

    public double divide(int a, int b){
        return (double)a / b;
    }

    public boolean isDivisibleBy(int a, int b){
        if (a % b == 0) {
            return true;
        } else {
            return false;
        }
    }
}
