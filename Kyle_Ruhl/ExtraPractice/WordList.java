import java.util.ArrayList;

public class WordList{

    public ArrayList<String> myList = new ArrayList<String>();

    int wordCounter = 0;

    public int numWordsOfLength(int len){
        for (int i = 0; i < myList.size(); i++){
            if (myList.get(i).length() == len){
                wordCounter = wordCounter + 1;
            } else {
            }
        }
        System.out.println(wordCounter);
        return wordCounter;    
    }


    public void removeWordsOfLength(int len){
        for (int i = 0; i < myList.size(); i++){
            if (myList.get(i).length() == len){
                myList.remove(i);
                i--;
            } else {
            }
        }
        System.out.println(myList);
    }


//Tests What Happens When You Remove An Index In An Array
    public void testingArrayStuff(){
        System.out.println(myList);

        myList.remove(0);

        System.out.println(myList.get(0));
    }

}
