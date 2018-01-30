package skulbrains;

public class AppRun8 {
	private static User8[] UserArray = new User8[10];
	private static String[] fnameArray = { "Alan", "Bill", "Cody", "Danny", "Egbert", 
						"Fred", "Gus", "Howard", "Irwin", "Jacob"};

	private static String[] lnameArray = { "Turner", "Smith", "Ricks", "Queener", "Picket",
						"Othello", "Noodle", "Masterson", "Levin", "Kagan" };

	public static void randomizeArray(){
		User8 u8;
		int p = 0;
		for (int i = 0; i < 10; i++){
			p = (int) Math.floor(Math.random() * 10);		 
			u8 = UserArray[i];
			UserArray[i] = UserArray[p];
			UserArray[p] = u8;
		}
	}
			

	public static void sortArray(){
		User8 u8;
		for(int i = 0; i < UserArray.length; i++)
			for(int j = 0; j < UserArray.length; j++)
				if(UserArray[i].compareTo(UserArray[j]) < 0){
					u8 = UserArray[i];
					UserArray[i] = UserArray[j];
					UserArray[j] = u8;
				}
	}
 
        public static void sortArrayB(){
                User8 u8;
                for(int i = 0; i < UserArray.length; i++)
                        for(int j = 0; j < UserArray.length; j++)
                                if(UserArray[i].compareTo(UserArray[j]) > 0){
                                        u8 = UserArray[i];
                                        UserArray[i] = UserArray[j];
                                        UserArray[j] = u8;
                                }
        }


	
	public static void buildArray(boolean sortType){
		int uType = 1;
		for (int i = 0; i < 10; i++){
			UserArray[i] = new User8(fnameArray[i], lnameArray[i], uType);
			UserArray[i].setSortType(sortType);
			uType++;
			if(uType > 3) uType = 1;
		}
	}
 
	public static void prtMessage(int c, User8 u8a, User8 u8b){
                if(c < 0){
                        System.out.println("Smaller: ");
                        u8a.showUser();
                }
                if(c > 0){
                        System.out.println("Smaller: ");
                        u8b.showUser();
                }
                if(c == 0){
                        System.out.println("Same: ");
                        u8a.showUser();
                        u8b.showUser();
                }

	}

	public static void showArray(){
		System.out.println(" *** -------------------------------------- *** ");
		System.out.println(" ***            User Array                  *** ");
		for(int i = 0; i < 10; i++){
			UserArray[i].showUser(i);
		}
		System.out.println(" ***                                        *** ");
		System.out.println(" *** -------------------------------------- *** ");	
	}

	public static void main(String [] argv){ 
		buildArray(true);
		randomizeArray();
		System.out.println(" ******* Randomized ************************* ");
		showArray();
		System.out.println(" *** Sorted low to high on first name    **** ");
		sortArray();
		showArray();
		System.out.println(" *** Sorted high to low on first name    **** ");
		sortArrayB();
		showArray();
		System.out.println(" ********************************************* ");
                buildArray(false);
                randomizeArray();
                System.out.println(" ******* Randomized ************************* ");
		showArray();
                sortArray();
		System.out.println(" *** Sorted low to high on last name     **** ");
                showArray();
                sortArrayB();
		System.out.println(" *** Sorted high to low on last name     **** ");
                showArray();
	}	
}

