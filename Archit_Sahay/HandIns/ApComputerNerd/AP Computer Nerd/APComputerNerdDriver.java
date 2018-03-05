import java.util.*;
public class APComputerNerdDriver{
		private static APComputerNerd[] arrayNerds = new APComputerNerd[7];
		private static String[] classmates = { "Prison Mike", "Michael Scarn", "Mykonos","Santa Bond","Michael Klump", "Willy Wonka", "Orville Tootenbacher"};
		private static String[] COPY = { "Prison Mike", "Michael Scarn", "Mykonos","Santa Bond","Michael Klump", "Willy Wonka", "Orville Tootenbacher" };
							
		private static void setArraySortType(boolean flagger){
			for(int i=0; i < arrayNerds.length; i++){
				if (flagger){ arrayNerds[i].setSortTypeName(); } 
					else { arrayNerds[i].setSortTypeIntelligence(); }
			}
		}	
	
		public static void sortArray(){
			APComputerNerd filler;
			for(int x = 0; x < arrayNerds.length; x++)
				for(int y = 0; y < arrayNerds.length; y++){
					if(arrayNerds[x].compareTo(arrayNerds[y]) < 0){
						filler = arrayNerds[x];
						arrayNerds[x] = arrayNerds[y];
						arrayNerds[y] = filler;
						}
				}
		}
		
		//new method sorts the names in aplhabetical order
		public static void Alphabitize(){
			Arrays.sort(COPY);
		}
	
		public static void fillArray(){
			int x; //intelegence level
			int y; //speed
			int z; //laptop performance

			for (int i = 0; i < arrayNerds.length; i++){
				x = ((int) Math.floor(Math.random() * 10) + 1); //number between 1-10
				y = ((int) Math.floor(Math.random() *  5) + 1); //number between 1-5
				z = ((int) Math.floor(Math.random() * 20) + 1); //number between 1-20

				arrayNerds[i] = new APComputerNerd(classmates[i], x, y, z);
			}
		}
		

		public static void showArray(){
			//use this method to display FULL array
			for (int i = 0; i < arrayNerds.length; i++){ arrayNerds[i].displayNerd(); }
		}
		
		public static void showArray2(){
			//use this method to display ONLY NAME AND INTELEGENCE LEVEL
			for (int i = 0; i < arrayNerds.length; i++){ arrayNerds[i].displayNerd2(); }
		}
		
		//-----the following method fixes the bug of not alphabatizing the names-------------
		//also created a copy array so it does not mess up other arrays. 
		
		public static void showAlphabArray(){
			for (int r = 0; r < COPY.length; r++){ 	System.out.println("[Name: " + COPY[r] + "]"); }
		}
		//---------end---------------------------------------------------------

		public static void main(String[] args){ 
			APComputerNerd k = new APComputerNerd();
			System.out.println("\n\n-----------------------------------------------------");
			k.displayKevin();
			System.out.println("-----------------------------------------------------");
			
			fillArray();
			
			System.out.println("\n\nMichael Scott's alter-egos ");
			showArray();
			System.out.println("-----------------------------------------------------");
			
			System.out.println("\n\nSorted Alphabetically by Name");
			setArraySortType(true);
			Alphabitize(); //changed, now successfully alphabatizes
			showAlphabArray(); //changed, only prints out the names now in order
			System.out.println("-----------------------------------------------------");
	        
			setArraySortType(false);
	        sortArray();
			System.out.println("\n\nSorted Least to Greatest on Intelegence Level ");
	        showArray2(); //now only shows name and intellegence level after sort to keep cleaner
			System.out.println("-----------------------------------------------------");

		}	
	}
	