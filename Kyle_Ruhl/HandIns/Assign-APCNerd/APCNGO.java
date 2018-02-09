import java.util.*;
public class APCNGO{
		private static APCN[] arrayOfNERDZ = new APCN[16];
		private static String[] classmates = { "Archit", "Kyle", "James", "Julie", "Tom", "Connor", "Joey",
							"Sudish", "Nicole", "Tony", "Tunji", "Gareth", "Steven", "Krug", "Alex", "Will" };
		private static String[] COPY = { "Archit", "Kyle", "James", "Julie", "Tom", "Connor", "Joey",
							"Sudish", "Nicole", "Tony", "Tunji", "Gareth", "Steven", "Krug", "Alex", "Will" };
							
		private static void setArraySortType(boolean flagger){
			for(int i=0; i < arrayOfNERDZ.length; i++){
				if (flagger){ arrayOfNERDZ[i].setSortTypeName(); } 
					else { arrayOfNERDZ[i].setSortTypeIntelligence(); }
			}
		}	
	
		public static void sortArray(){
			APCN yada;
			for(int x = 0; x < arrayOfNERDZ.length; x++)
				for(int y = 0; y < arrayOfNERDZ.length; y++){
					if(arrayOfNERDZ[x].compareTo(arrayOfNERDZ[y]) < 0){
						yada = arrayOfNERDZ[x];
						arrayOfNERDZ[x] = arrayOfNERDZ[y];
						arrayOfNERDZ[y] = yada;
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

			for (int i = 0; i < arrayOfNERDZ.length; i++){
				x = ((int) Math.floor(Math.random() * 10) + 1); //number between 1-10
				y = ((int) Math.floor(Math.random() *  5) + 1); //number between 1-5
				z = ((int) Math.floor(Math.random() * 20) + 1); //number between 1-20

				arrayOfNERDZ[i] = new APCN(classmates[i], x, y, z);
			}
		}
		

		public static void showArray(){
			//use this method to display FULL array
			for (int i = 0; i < arrayOfNERDZ.length; i++){ arrayOfNERDZ[i].displayNerd(); }
		}
		
		public static void showArray2(){
			//use this method to display ONLY NAME AND INTELEGENCE LEVEL
			for (int i = 0; i < arrayOfNERDZ.length; i++){ arrayOfNERDZ[i].displayNerd2(); }
		}
		
		//-----the following method fixes the bug of not alphabatizing the names-------------
		//also created a copy array so it does not mess up other arrays. 
		
		public static void showAlphabArray(){
			for (int r = 0; r < COPY.length; r++){ 	System.out.println("[Name: " + COPY[r] + "]"); }
		}
		//---------end---------------------------------------------------------

		public static void main(String[] args){ 
			APCN k = new APCN();
			System.out.println("\n\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			k.displayKevin();
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			
			fillArray();
			
			System.out.println("\n\n++++++++++ Original Array Of AP Computer Nerds ++++++++++++");
			showArray();
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			
			System.out.println("\n\n++++++++++++ Sorted Alphabetically by Name ++++++++++++");
			setArraySortType(true);
			Alphabitize(); //changed, now successfully alphabatizes
			showAlphabArray(); //changed, only prints out the names now in order
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	        
			setArraySortType(false);
	        sortArray();
			System.out.println("\n\n++++++++ Sorted Least to Greatest on Intelegence Level ++++++++");
	        showArray2(); //now only shows name and intellegence level after sort to keep cleaner
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		}	
	}
	