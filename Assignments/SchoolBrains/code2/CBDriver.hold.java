import skulbrains.ClassBook;
import skulbrains.Category;
import skulbrains.Assignment;
import skulbrains.User;
import skulbrains.Score;

import skulbrains.DateString;

import java.util.Scanner;

class CBDriver {
	public static void main(String[] argv){
		ClassBook cb = new ClassBook();
		Scanner scanner = new Scanner(System.in);

		String[] fname = {"Billy", "Willy", "Chilly", "Sally", "Nilly", "Bob",
				"Happy", "Kappy", "Nappy", "Fappy", "Slappy", "Joe",
				"Biffy", "Whiffy", "Jiffy", "Blimpy", "Skimpy", "Moe",
				"Gus"};    

                String[] lname = {"Bixy", "Wixy", "Chixy", "Saxy", "Nixy", "Bof",
                                "Hawwy", "Kawwy", "Nawy", "Fawy", "Slawy", "Jok",
                                "Bippy", "Whippy", "Jippy", "Blippy", "Skippy", "Mok",
                                "Gust"};    

 
		for(int i=0; i < 4; i++){
			Category c = new Category("CatName" + i, 10 * (i+1));
			c.setCategoryID(i);
			cb.addCategory(c);
		}


		DateString ds = new DateString("08-28-2017");

		for(int i=0; i < 10; i++){
			Assignment a = new Assignment("AssignName" + i, i * 10);
			a.setAssignmentID(i);
			a.setCategoryID(i % 4);
			a.setAssignmentDate(ds.getDSString());
			ds.addDays(7);
			a.setDueDate(ds.getDSString());
			cb.addAssignment(a);
		}

		for(int i=0; i < 19; i++){
			User u = new User(fname[i], lname[i], 3);
			cb.addStudent(u);
			for(int j=0; j < 10; j++){
				Score score = new Score(cb.findAssignment(j).getPoints() - 2, cb.findAssignment(j).getAssignmentID(), i);
				cb.addStudentScore(u, score);
			}				  		
		}

		System.out.println("------------ Assignments ------------");
		cb.listAssignments();
		System.out.println("-------------- Categories ---------------");
		cb.listCategories();
		System.out.println("------------ Students --------------");
		cb.listStudents();
		System.out.println("--------- Students by scorelist -------------");
		cb.listStudentScores();

		System.out.println("Pick an Assignment: ");
		int assignNumber = scanner.nextInt();
		cb.findAssignment(assignNumber).showAssignment();	
		System.out.println("****************************");
		System.out.println("Pick another assignment: ");
		assignNumber = scanner.nextInt();
		Assignment a = cb.findAssignment(assignNumber);                   
		a.showAssignment();
		cb.findCategory(a.getCategoryID()).showCategory();
	}
}

