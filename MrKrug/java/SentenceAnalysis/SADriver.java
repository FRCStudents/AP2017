/*
 * SADriver
 */

class SADriver {
    public static void main (String argv[]){
      SA sa = new SA();
      sa.promptForSentence();
      sa.scanSentence();
      sa.printSentence();
      sa.printEachWord();
    }
}
