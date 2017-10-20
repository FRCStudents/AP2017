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

        public int calcWordLength(){
                int wordLength = 0;
                for (int i = 0; i < x.length(); i++){
                         if ((x.charAt(i) != ' ') || (x.charAt(i) != '.')){
                                wordLength++;
                         }
                }
                return wordLength;
        }

        public double calculateAverageWordLength(){
                return ((double)calcWordLength()/calcWords());
        }
        public static void main(String[] args){
                SentenceAnalysis a = new SentenceAnalysis();
                a.userInput();
                System.out.println(a.x);
                System.out.println("Your sentence has " + a.calcWords() + " words.");
                System.out.println("The amount of letters in your sentence is " + a.calcWordLength());
                System.out.println("The average length of each word is " + a.calculateAverageWordLength());
        }
}
