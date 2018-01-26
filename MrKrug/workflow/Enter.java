import java.util.*;
import java.io.*;

class Enter {
	int choice = 0;
	String name;
	int age;
	int height;
	int shoeSize;

	public Enter(){
		setChoice(1);
	}

	public Enter(int choice){
		setChoice(choice);
	}

	public int getChoice(){
		return choice;
	}

	public void setChoice(int choice){
		if(choice > 2) return;
		this.choice = choice;
	}

	public void getInput(){
		Scanner s = new Scanner(System.in);

		System.out.println("Name: ");
		this.name = s.nextLine();

		System.out.println("Age: ");
		this.age = s.nextInt();

		System.out.println("Height (in inches): ");
		this.height = s.nextInt();

		System.out.println("Shoe Size: ");
		this.shoeSize = s.nextInt();
	}

	public void processInput(int in){
		if(in == 1){
			getInput();
		}
	}	

	public void runMenu(){
		System.out.println("****************************");
		System.out.println("** 1) Enter Person        **");
		System.out.println("**                        **");
		System.out.println("** 2) End                 **");
		System.out.println("****************************");
		System.out.println("Enter >> ");
	}

	public int inputChoice(){
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}

	public void printLast(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Height: " + height);
		System.out.println("Shoe Size: " + shoeSize);
	}

	public void saveFile()  throws IOException {
		FileOutputStream out = null;
		String str = name + "~" + age + "~" + height + "~" + shoeSize;      
		try {
			out = new FileOutputStream("./data/" + name + ".emkproject");
			for(int i=0; i < str.length(); i++){
				out.write(str.charAt(i));
			}
		} finally {
			if(out != null){
				out.close();
			}
		}
	}
}
