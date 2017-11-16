
class WLDriver {
	public static void main(String [] argv){
		WordList wl = new WordList();
                System.out.println("8 Count: " + wl.numWordsOfLength(8));
                System.out.println("5 Count: " + wl.numWordsOfLength(5));
		System.out.println("3 Count: " + wl.numWordsOfLength(3));
		System.out.println("4 Count: " + wl.numWordsOfLength(4));
		System.out.println("19 Count: " + wl.numWordsOfLength(19));
		wl.display();
		wl.removeWordsOfLength(3);
		wl.display();
		}
	}
