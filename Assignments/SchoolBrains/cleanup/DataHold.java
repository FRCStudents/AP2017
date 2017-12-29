package skulbrains;

import skulbrains.ClassBook;
import skulbrains.Category;
import skulbrains.Assignment;
import skulbrains.User;
import skulbrains.Score;
import skulbrains.DataBuild;

import skulbrains.DateString;

public class DataHold {
        ClassBook cb = new ClassBook();
        DataBuild db = new DataBuild();
	String teacherName = "";

        public DataHold(String teacher){
		teacherName = teacher;
		buildData();
	}

	public DataHold(){
		buildData();
	}

	public String getTeacherName(){
		return teacherName;
	}

	public DataBuild getDataBuild(){
		return db;
	}

	public ClassBook getClassBook(){
		return cb;
	}

	//
	// for test purposes...
	// building with test data
	//	
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

}

