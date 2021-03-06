package APCompNerd;

public class APCompNerdGo {
	private static APCompNerd[] acnArray = new APCompNerd[10];
	private static String[] fnameArray = { "Alan", "Bill", "Cody", "Danny", "Egbert", 
						"Fred", "Gus", "Howard", "Irwin", "Jacob"};

	// randomize the order of the nodes
	public static void randomizeArray(){
		APCompNerd acn;
		int p = 0;
		for (int i = 0; i < 10; i++){
			p = (int) Math.floor(Math.random() * 10);		 
			acn = acnArray[i];
			acnArray[i] = acnArray[p];
			acnArray[p] = acn;
		}
	}
		
	private static void setArraySortType(boolean sortType){
			if(sortType){
				acnArray[0].setSortTypeName();
			} else {
				acnArray[0].setSortTypeIntelligence();
			}
	}	
	
	// sort the array forwards
	public static void sortArray(){
		APCompNerd acn;
		for(int i = 0; i < acnArray.length; i++)
			for(int j = 0; j < acnArray.length; j++){
				if(acnArray[i].compareTo(acnArray[j]) < 0){
					acn = acnArray[i];
					acnArray[i] = acnArray[j];
					acnArray[j] = acn;
					}
				}
	}

	// sort the array backwards 
        public static void sortArrayBack(){
                APCompNerd acn;
                for(int i = 0; i < acnArray.length; i++)
                        for(int j = 0; j < acnArray.length; j++)
                                if(acnArray[i].compareTo(acnArray[j]) > 0){
                                        acn = acnArray[i];
                                        acnArray[i] = acnArray[j];
                                        acnArray[j] = acn;
                                }
        }


	
	public static void buildArray(){
		int Ai;
		int As;
		int Ap;

		for (int i = 0; i < 10; i++){
	                Ai = (int) Math.floor(Math.random() * 2) + 9;
       	         	As = (int) Math.floor(Math.random() * 14) + 4;
                	Ap = (int) Math.floor(Math.random() * 10);

			acnArray[i] = new APCompNerd(fnameArray[i], Ai, As, Ap);
		}
	}
 

	public static void showArray(){
		System.out.println(" *** -------------------------------------- *** ");
		System.out.println(" ***         APComp Nerd Array              *** ");
		for(int i = 0; i < 10; i++){
			acnArray[i].showAPCompNerd();
		}
		System.out.println(" ***                                        *** ");
		System.out.println(" *** -------------------------------------- *** ");	
	}

	public static void main(String [] argv){ 
		buildArray();
		randomizeArray();
		System.out.println(" ******* Randomized ************************* ");
		showArray();
		System.out.println(" ***     Sorted a-z on first name        **** ");
		setArraySortType(true);
		sortArray();
		showArray();
		System.out.println(" ***     Sorted z-a on first name        **** ");
		sortArrayBack();
		showArray();
		System.out.println(" ********************************************* ");
                buildArray();
                randomizeArray();
                System.out.println(" ******* Randomized ************************* ");
		showArray();
		setArraySortType(false);
                sortArray();
		System.out.println(" *** Sorted low to high on intelligence  **** ");
                showArray();
                sortArrayBack();
		System.out.println(" *** Sorted high to low on intelligence  **** ");
                showArray();
	}	
}

