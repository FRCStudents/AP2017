package skulbrains;

public class AppRun7 {
	public static void prtMessage(int c, User7 u7a, User7 u7b){
                if(c < 0){
                        System.out.println("Smaller: ");
                        u7a.showUser();
                }
                if(c > 0){
                        System.out.println("Smaller: ");
                        u7b.showUser();
                }
                if(c == 0){
                        System.out.println("Same: ");
                        u7a.showUser();
                        u7b.showUser();
                }

	}

	public static void main(String [] argv){ 
		User7 u7a = new User7("Bill", "Smith", 3);
		User7 u7b = new User7("Alan", "Darcy", 1);
		User7 u7c = new User7("Charly", "Fontane", 2);
		User7 u7d = new User7("Denielya", "Dancer", 2);
		Comparable comp;

		System.out.println("--------- u7a: ------------");
		u7a.showUser(1); 
		System.out.println("--------- u7b: ------------");
		u7b.showUser(1);
		comp = u7a;
		prtMessage(comp.compareTo(u7b), u7a, u7b);
		comp = u7c;
		prtMessage(comp.compareTo(u7d), u7c, u7d);	
	}
	
}

