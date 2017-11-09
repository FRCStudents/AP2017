//my driver for SentAna.java
public class SentAnaDriver{

	public static void main(String[] args){
		
		SentAna q = new SentAna();
		
		q.wordCount(q.sentence);
		
		//The rest is printing out the dialouge
		
		System.out.println();
		
		System.out.println("Calculating...");
		
		System.out.println();
		
		System.out.println("Word Count is: " + q.wordCount);
		
		System.out.println();
		
		System.out.println("Average Word Size in the sentence is: " + q.averageWordSize);
		
		System.out.println();
	
		System.out.println("Done. \nThanks for letting me Analyze your sentence.");
		
	}

}