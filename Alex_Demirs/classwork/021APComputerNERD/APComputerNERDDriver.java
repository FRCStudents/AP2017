import java.util.*;
public class APComputerNERDDriver{
		private static APComputerNERDDriver[] arrayOfNERDZ = new APComputerNERDDriver[16];
		private static String[] classmates = { "Marx", "Putin", "Lenin", "Stalin", "Malenkov", "Khrushchev", "Brezhnev",
							"Andropov", "Chernenko", "Gorbachev", "Yanayev", "Kamenev", "Zinoviev", "Beria", "Alex", "Molotov" };
							
		private static void setArraySortType(boolean thing){
			for(int i=0; i < arrayOfNERDZ.length; i++){
				if (thing){ arrayOfNERDZ[i].setSortTypeName(); } 
					else { arrayOfNERDZ[i].setSortTypeIntelligence(); }
			}
		}	
	
		public static void sortArray(){
			APComputerNERDDriver yada;
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
			for(int i = 0; i < arrayOfNERDZ.length; i++){ arrayOfNERDZ[i].displayNerd(); }
		}

		public static void main(String[] args){ 
			APCN k = new APCN();
			k.displayKevin();
			
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
			System.out.println("\n\n++++++++ Sorted Least to Greatest on Intelegence Level ++++++++");
	        showArray();
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		}	
	}
	