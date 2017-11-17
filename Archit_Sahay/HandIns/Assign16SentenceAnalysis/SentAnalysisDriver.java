import java.util.*;
public class SentAnalysisDriver{

    public static void main(String[] args){

    int determineRepeat = 0;

        SentAnalysis z = new SentAnalysis();

    while(determineRepeat == 0){
        z.wordCount(z.sentence);

        //The rest is printing out the dialouge

        System.out.println();


        System.out.println();

        System.out.println("Word Count is: " + z.wordCount);

        System.out.println();

        System.out.println("Average Word Size in the sentence is: " + z.averageWordSize);

        System.out.println();

        Scanner scanner001 = new Scanner(System.in);
        System.out.println("Press 0 -> Repeat Program\nPress 1 -> End Program");
        int determine = scanner001.nextInt();

        if (determine == 0){
            System.out.println("Then go through the process again...");
            determineRepeat++;
        } else {
            System.out.println("Ending Program...");
            determineRepeat++;
        }
    }
        System.out.println("Done. \nThanks for letting me Analyze your sentence.");

    }
}    