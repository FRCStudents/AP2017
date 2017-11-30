import java.util.*;

public class StringAnalyzer{
        String x = "This is a sample to be used in a sentence";

        public int analyzer(){
                int words = 0;
                for (int i = 0; i < x.length(); i++){
                        if ((x.charAt(i) == ' ') || (x.charAt(i) == '.')){
                                words++;
                        }
                }
                return words + 1;
        }

        public void reversePrint(){
                String reverse = new StringBuffer(x).reverse().toString();
                System.out.println(reverse);
        }

        public static void main(String[] args){
                StringAnalyzer s = new StringAnalyzer();
                s.reversePrint();
                System.out.println(s.analyzer());
        }
}
