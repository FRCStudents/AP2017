import java.util.*;

class WordList {
	private ArrayList<String> myList = new ArrayList<String>();

	public WordList(){
	String[] wl = 	{	"This",
				"That",
				"Other",
				"Cat",
				"Dog",
				"Elephant",
				"Tiger",
				"Bear"
			};

	for(int i=0; i<8; i++){
		System.out.println("OUT: " + i);
		myList.add(wl[i]);
		}
	}

	public int numWordsOfLength(int len){
		int count = 0;
		for(int i=0; i < myList.size(); i++){
			if(myList.get(i).length() == len){
				count++;
			}
		}
	return count;
	}

	public void removeWordsOfLength(int len){
		for(int i=myList.size() - 1; i >= 0; i--){
			if(myList.get(i).length() == len){
				myList.remove(i);
			}
		}
	}

	public void display(){
		for(int i=0; i < myList.size(); i++){
			System.out.println(myList.get(i));
			}
	}

}
