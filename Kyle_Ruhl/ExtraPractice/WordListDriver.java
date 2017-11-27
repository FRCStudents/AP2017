public class WordListDriver{
    public static void main(String[] argv){

    WordList w = new WordList();
    
    w.myList.add("cat");
    w.myList.add("mouse");
    w.myList.add("frog");
    w.myList.add("dog");
    w.myList.add("dog");

    w.numWordsOfLength(3);

    w.removeWordsOfLength(3);

    //w.testingArrayStuff();

    }
}
