class Fibonacci{
    public static void main(String[] args){
        int firstNum = 1;
        int secondNum = 0;
        int placeholder;
        System.out.println(0);
        System.out.println(1);
        for(int i = 0; i < 99; i++){
            placeholder = firstNum + secondNum;
            System.out.println(placeholder);
            secondNum = firstNum;
            firstNum = placeholder;
		}
    }
}
