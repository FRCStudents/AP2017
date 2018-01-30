package skulbrains;

import java.util.*;
import skulbrains.Category;
import skulbrains.Assignment;

public interface IClassBook {
        public void addAssignment(Assignment a);
        public void removeAssignment(int i);
        public void listAssignments(); 
        public void addCategory(Category c);
        public void removeCategory(int i);
        public void listCategories();
	public Category findCategory(int id);
        public void addStudent(User s);
        public void removeStudent(int i);
        public void listStudents();
        public User findStudent(int i);
        public void listStudentScores();
	public void addStudentScore(User student, Score score);
 	public void listScoresForStudent(int s);
	public void removeStudentScore(int student, int score);
	public double getWeightedAverage(int studentID);
}
