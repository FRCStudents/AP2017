public class Answer {
    public static String getLotzOPrimes(){
        String str = new String();
        int i,c;
        for(i = 2; i<20500; i++){
            for(c = 2 ; c<=i; c++){
                if(i==c){
                    str=str+i;
                }
                else if(i%c==0){
                    break;
                }
            }
        }
        return str;
    }
    public static String answer(int n) {
        String idValues = getLotzOPrimes();
        String newMinionId = idValues.subString(n,(n+5));
        return newMinionId;
    }
    public static void main(String[] args){
        System.out.println(answer(0));
    }
}
