public class SentenceAnalysis {
  private String sentence;
  private int numOfWords;
  private double averageWordLength;
  private int totalCharacters;

  public SentenceAnalysis(String var) {
    sentence = var;
  }
  public int getNumberOfWords() {
    String[] words = this.sentence.split(" ");
    this.numOfWords = words.length;
    return words.length;
  }
  public double calcAverageWordLength(){
    String[] words = this.sentence.split(" ");
    int sum = 0;
    for(int i = 0; i < words.length; i ++) {
      int h = words[i].length();
      sum = sum +  h;
    }
    this.totalCharacters = sum;
    double averageLength = (double)sum / words.length;
    this.averageWordLength = averageLength;
    return averageLength;
  }
  public static void main(String[] args){
    SentenceAnalysis s1 = new SentenceAnalysis("This is a test sentence!");
    s1.getNumberOfWords();
    s1.calcAverageWordLength();
    System.out.println("Sentence: " + s1.sentence + " \n NumOfWords:" + s1.numOfWords + "\n totalCharacters:" + s1.totalCharacters + "\n averageWordLength:" + s1.averageWordLength);
  }
}
