import java.io.*;
import java.util.Scanner;

public class Entry {
	
	private String name;
	private String occupation;
	private int speed;
	private int age;
	private int height;

	//Should make double for sizes?
	private int shoeSize;
	private int hatSize;

		public Entry() {
			name = " ";
			age = 0;
			occupation = " ";
			speed = 0;
			height = 0;
			shoeSize = 0;
			hatSize = 0;

		}

		public void table() throws IOException {
			createSpace();

			Scanner scanner9 = new Scanner(System.in);
			System.out.println("**************************");
			System.out.println("What Would You Like To Do?\n1 -> Create New Person\n2 -> View Last Person\n3 -> Exit Program");
			System.out.println("**************************");
			int response = scanner9.nextInt();

			if (response == 1) {
				enterInfo();
			}

			if (response == 2) {
				viewLastPerson();
			}

			if (response == 3) {
				return;
			}
		}

		public void enterInfo() throws IOException {
			createSpace();
			Scanner scanner01 = new Scanner(System.in);
			System.out.println("Enter Name");
			name = scanner01.nextLine();

			createSpace();
			Scanner scanner02 = new Scanner(System.in);
			System.out.println("Enter Age");
			age = scanner02.nextInt();

			createSpace();
			Scanner scanner03 = new Scanner(System.in);
			System.out.println("Enter Occupation");
			occupation = scanner03.nextLine();

			createSpace();
			Scanner scanner04 = new Scanner(System.in);
			System.out.println("Enter Speed");
			speed = scanner04.nextInt();

			createSpace();
			Scanner scanner05 = new Scanner(System.in);
			System.out.println("Enter Height");
			height = scanner05.nextInt();

			createSpace();
			Scanner scanner06 = new Scanner(System.in);
			System.out.println("Enter Shoe Size");
			shoeSize = scanner06.nextInt();

			createSpace();
			Scanner scanner07 = new Scanner(System.in);
			System.out.println("Enter Hat Size");
			hatSize = scanner07.nextInt();

			storePerson();

			createSpace();
			table();
		}

		public void viewLastPerson() {
			System.out.println("Name: " + name);
			System.out.println("Age: " + age);
			System.out.println("Occupation: " + occupation);
			System.out.println("Speed: " + speed);
			System.out.println("Height: " + height);
			System.out.println("Shoe Size: " + shoeSize);
			System.out.println("Hat Size:" + hatSize);
		}

		public void storePerson() throws IOException {
			FileOutputStream out = null;
			String str = name + "~" + age + "~" + occupation + "~" + speed + "~" + height + "~" + shoeSize + "~" + hatSize;      
			try {
				out = new FileOutputStream("/InfoStorage/" + name + ".txt");
				for(int i=0; i < str.length(); i++){
					out.write(str.charAt(i));
				}
			} finally {
				if(out != null){
					out.close();
				}
			} 
		}

		public void createSpace() {
			for(int b = 0; b <= 80; b++){
            System.out.print("\n");
        	}
		}
}
