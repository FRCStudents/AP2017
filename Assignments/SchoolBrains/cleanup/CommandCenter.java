package skulbrains;

import skulbrains.ClassBook;
import skulbrains.Category;
import skulbrains.Assignment;
import skulbrains.User;
import skulbrains.Score;
import skulbrains.DataHold;

import skulbrains.DateString;

import java.util.Scanner;

public class CommandCenter implements ICommandCenter {
        ClassBook cb;
        Scanner scanner = new Scanner(System.in);
        DataBuild db;

	int currentStudent = 0;

	public CommandCenter(DataHold dh){
		cb = dh.getClassBook();
		db = dh.getDataBuild();
	}

	public CommandCenter(){
		DataHold dh = new DataHold();
		cb = dh.getClassBook();
		db = dh.getDataBuild();
	}
	

	public boolean doCommand(int r){
		if(r == 99) return false;
		if(r == 1){
			cb.listStudents();
			return true;
		} else {
		if(r == 2){
			cb.listAssignments();
		} else {
		if(r == 3){
			cb.listCategories();
		}
	     }
	  }
	return false;
	}

        public boolean doStudentCommand(int r){
		Scanner scanner = new Scanner(System.in);
		if(r == 99) return false;
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
			return true;
                }
             }
          }
	return false;
        }


        public boolean doScoresCommand(int r){
		if(r == 99) return false;
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
                        return true;
                }
             }
          }
	return false;
        }

}

