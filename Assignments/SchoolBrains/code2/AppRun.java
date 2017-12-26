import skulbrains.ClassBook;
import skulbrains.Category;
import skulbrains.Assignment;
import skulbrains.User;
import skulbrains.Score;
import skulbrains.DataBuild;

import skulbrains.DateString;

import java.util.Scanner;

class AppRun {
        String stars = "**********************************************";
        String ioStars = "**                                       **";

        ClassBook cb = new ClassBook();
        Scanner scanner = new Scanner(System.in);
        DataBuild db = new DataBuild();

	int currentStudent = 0;

	public AppRun(){
		buildData();
		runApplication();
	}
	
	public void menu001(){
                System.out.println(stars);
                System.out.println(ioStars);
                System.out.println("** 1) List Students                      **");
                System.out.println("** 2) List Assignments                   **");
                System.out.println("** 3) List Categories                    **");
		System.out.println("** 99) Exit program                      **");
                System.out.println(ioStars);
                System.out.println(stars);
        }

        public void menu002(){
                System.out.println(stars);
                System.out.println(ioStars);
                System.out.println("** 1) Add                                **");
                System.out.println("** 2) Remove                             **");
                System.out.println("** 3) List Assignments                   **");
		System.out.println("** 99) Exit level                        **");
                System.out.println(ioStars);
                System.out.println(stars);
        }

        public void menu003(){
                System.out.println(stars);
                System.out.println(ioStars);
                System.out.println("** 1) Add Assignment Score               **");
                System.out.println("** 2) Remove Score                       **");
                System.out.println("** 3) List Scores                        **");
                System.out.println("** 99) Exit level                        **");
                System.out.println(ioStars);
                System.out.println(stars);
        }


        public int getInput(){
		int responseINT = 0;
                System.out.println("Please enter choice: ");
                Scanner s = new Scanner(System.in);
		while((responseINT < 1 || responseINT > 3) && (responseINT != 99)){
                	String responseIN = s.next();
                	responseINT = Integer.parseInt(responseIN);
               	}
		return responseINT;
                }

	private void runApplication(){
		int r = 0;
		while(r < 9){
			menu001();
			r = getInput();
			doCommand(r);
		}
	}

	private void runStudentApp(){
		int r = 0;
		while(r < 9){
			menu002();
			r = getInput();
			doStudentCommand(r);
		}
	}

        private void runScoresApp(){
                int r = 0;
                while(r < 9){
                        menu003();
                        r = getInput();
                        doScoresCommand(r);
                }
        }


	private void doCommand(int r){
		if(r == 99) return;
		if(r == 1){
			cb.listStudents();
			runStudentApp();
		} else {
		if(r == 2){
			cb.listAssignments();
		} else {
		if(r == 3){
			cb.listCategories();
		}
	     }
	  }
	}

        private void doStudentCommand(int r){
		Scanner scanner = new Scanner(System.in);
		if(r == 99) return;
                if(r == 1){
			User s = new User();
			s.enterNewUser(3);
                        cb.addStudent(s);
                } else {
                if(r == 2){
			System.out.println("Student number to delete: ");
			int id = scanner.nextInt();
                        cb.removeStudent(id);
                } else {
                if(r == 3){
			System.out.println("Student number to list scores: ");
			int id = scanner.nextInt();
			currentStudent = id;
                        cb.listScoresForStudent(id);
			runScoresApp();
                }
             }
          }
        }


        private void doScoresCommand(int r){
		if(r == 99) return;
                Scanner scanner = new Scanner(System.in);
                if(r == 1){
                        Score s = new Score();
                        s.enterScore(3);
                        cb.addStudentScore(cb.findStudent(currentStudent), s);
                } else {
                if(r == 2){
                        System.out.println("Score to delete: ");
                        int id = scanner.nextInt();
                        cb.removeStudentScore(currentStudent, id);
                } else {
                if(r == 3){
                        cb.listScoresForStudent(currentStudent);
                        runScoresApp();
                }
             }
          }
        }

	private void buildData(){
                DataBuild db = new DataBuild();

                for(int i=0; i < db.getNumberOfCategories(); i++){
                        Category c = new Category(db.getCategoryName(i), db.getCategoryPercentages(i));
                        c.setCategoryID(i);
                        cb.addCategory(c);
                }


                DateString ds = new DateString("08-28-2017");

                for(int i=0; i < db.getNumberOfAssignments(); i++){
                        Assignment a = new Assignment(db.getAssignmentName(i), db.getPoints(i));
                        a.setAssignmentID(i);
                        a.setCategoryID(i % 6);
                        a.setAssignmentDate(ds.getDSString());
                        ds.addDays(7);
                        a.setDueDate(ds.getDSString());
                        cb.addAssignment(a);
                }

                for(int i=0; i < db.getNumberOfNames(); i++){
                        User u = new User(db.getFName(i), db.getLName(i), 3);
                        cb.addStudent(u);
                        for(int j=0; j < db.getNumberOfAssignments(); j++){
                                Score score = new Score(cb.findAssignment(j).getPoints() - 2, cb.findAssignment(j).getAssignmentID(), i);
                                cb.addStudentScore(u, score);
                        }
                }

	}

	public void showStuff(){
		System.out.println("------------ Assignments ------------");
		cb.listAssignments();
		System.out.println("-------------- Categories ---------------");
		cb.listCategories();
		System.out.println("------------ Students --------------");
		cb.listStudents();
		System.out.println("--------- Students by scorelist -------------");
		cb.listStudentScores();
	}
}

