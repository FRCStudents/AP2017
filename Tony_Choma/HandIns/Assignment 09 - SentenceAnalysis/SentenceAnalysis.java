import java.util.Scanner;

class SentenceAnalysis{
// Sentence object
        private String x;

// User inputs a sentence
        public String userInput(){
                Scanner userInput = new Scanner(System.in);

                System.out.println("Enter your sentence and the program will determine how many words are in it: ");
                x = userInput.nextLine();
                return x;
        }

// Calulates the number of words in a user inputted sentence.

        public int calcWords(){
                int words = 0;
                for (int i = 0; i < x.length(); i++){
                        if ((x.charAt(i) == ' ') || (x.charAt(i) == '.')){
                                words++;
                        }
                }
                return words + 1;
        }

        public static void main(String[] args){
                SentenceAnalysis a = new SentenceAnalysis();
                a.userInput();
                System.out.println(a.x);
                System.out.println("Your sentence has " + a.calcWords() + " words.");
        }
}
