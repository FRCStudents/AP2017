import java.util.*;
public class APCompNerdGO{
		private static APCompNerd[] arrayOfNERDZ = new APCompNerd[16];
		private static String[] classmates = { "Archit", "Kyle", "James", "Julie", "Tom", "Connor", "Joey",
							"Sudish", "Nicole", "Tony", "Tunji", "Gareth", "Steven", "Krug", "Alex", "Will" };
							
		private static void setArraySortType(boolean flagger){
			for(int i=0; i < arrayOfNERDZ.length; i++){
				if (flagger){ arrayOfNERDZ[i].setSortTypeName(); } 
					else { arrayOfNERDZ[i].setSortTypeIntelligence(); }
			}
		}	
	
		public static void sortArray(){
			APCompNerd yada;
			for(int x = 0; x < arrayOfNERDZ.length; x++)
				for(int y = 0; y < arrayOfNERDZ.length; y++){
					if(arrayOfNERDZ[x].compareTo(arrayOfNERDZ[y]) < 0){
						yada = arrayOfNERDZ[x];
						arrayOfNERDZ[x] = arrayOfNERDZ[y];
						arrayOfNERDZ[y] = yada;
						}
				}
		}
	
		public static void fillArray(){
			int x; //inteligence level
			int y; //speed
			int z; //laptop performance

			for (int i = 0; i < arrayOfNERDZ.length; i++){
				x = ((int) Math.floor(Math.random() * 10) + 1); //number between 1-10
				y = ((int) Math.floor(Math.random() *  5) + 1); //number between 1-5
				z = ((int) Math.floor(Math.random() * 20) + 1); //number between 1-20

				arrayOfNERDZ[i] = new APCompNerd(classmates[i], x, y, z);
			}
		}
 
		public static void showArray(){
			for(int i = 0; i < arrayOfNERDZ.length; i++){ arrayOfNERDZ[i].displayNerd(); }
		}

		public static void main(String[] args){ 
			APCompNerd k = new APCompNerd();
			k.displayJoe();
			
			fillArray();
			
			System.out.println("\n\n++++++++ Original Array Of AP Computer Nerds ++++++++");
			showArray();
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
			
			System.out.println("\n\n++++++++ Sorted Alphabetically by Name ++++++++");
			setArraySortType(true);
			sortArray();
			showArray();
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
	        
			setArraySortType(false);
	        sortArray();
			System.out.println("\n\n++++++++ Sorted Least to Greatest on Inteligence Level ++++++++");
	        showArray();
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		}	
	}
	