import java.util.*;

class View {
	String name = "";
	boolean isEnd = false;

	public View(){
		name = "Efraim Krug";
	}

	public View(String name){
		this.name = name;
	}

	public void startView(){
		System.out.println("**********************************************");
		System.out.println("** 1) Show People                           **");
		System.out.println("*******************                         **");
		System.out.println("** 2) Add Person                            **");
                System.out.println("*******************                         **");
                System.out.println("** e) End Program                           **");
                System.out.println("**********************************************");
	}

	public void endView(){
		System.out.println("**********************************************");
		System.out.println("**           Thanks so much!                **");
		System.out.println("**********************************************");
	}

	public String getName(){
                Scanner s = new Scanner(System.in);
                System.out.print(" > Name: > ");
                String in = s.next();
		return in;
	}
	
	public void showList(PersonList pList){
		for(int i=0; i < pList.getLength(); i++){
			System.out.println(pList.getPersonName(i));
		}
	}

	public void showOne(Person person){
		System.out.println(person.getName());
	}

	public int getInput(){
		Scanner s = new Scanner(System.in);
		System.out.print(" >Choose > ");
		String in = s.next();
		if (in.indexOf("1") >= 0){
			return 1;
		}
		if (in.indexOf("2") >= 0){
			return 2;
		}

		isEnd = true;
		return 99;
	}

	public boolean isEnd(){
		return isEnd;
	}
}
