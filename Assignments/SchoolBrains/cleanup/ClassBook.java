package skulbrains;

import java.util.*;
import skulbrains.Category;
import skulbrains.Assignment;
import skulbrains.Score;
import skulbrains.ScoreList;

public class ClassBook implements IClassBook {
	private ArrayList<Category> categories;
	private ArrayList<Assignment> assignments;
	private UserList studentList;
	private ArrayList<ScoreList> studentScoreLists;

	public ClassBook(){
		categories = new ArrayList<Category>();
		assignments = new ArrayList<Assignment>();
		studentScoreLists = new ArrayList<ScoreList>();
		studentList = new UserList();
	}

	public double getWeightedAverage(int studentID){
		double[] tallyList = new double[categories.size()];
		double[] pointsList = new double[categories.size()];

		ScoreList sl = studentScoreLists.get(studentID);
		double total = 0;
		double totalTally = 0;
		int count = 0;
		Category catgry;
		double points;
		Score score;

		for(int i=0; i < assignments.size(); i++){
			catgry = findCategory(assignments.get(i).getCategoryID());
			points = (double)assignments.get(i).getPoints();
			score = sl.findScore(assignments.get(i).getAssignmentID());
			if(score == null) continue;
			tallyList[catgry.getCategoryID()]+= score.getScore();
			pointsList[catgry.getCategoryID()] += points;
		}

		for(int i=0; i < categories.size(); i++){
			if(tallyList[i] == 0 && pointsList[i] == 0){
				totalTally += 0;
			} else {
				totalTally = tallyList[i]/pointsList[i];
				totalTally *= categories.get(i).getWeight();
			}
			total += totalTally;
		}
	return total;
	}


	public void addStudent(User s){
		studentList.addUser(s);
		ScoreList scoreList = new ScoreList(s);
		studentScoreLists.add(scoreList);
	}

	public void listStudentScores(){
		for(int i=0; i < studentScoreLists.size(); i++){
			studentScoreLists.get(i).getStudent().showUser(i);
			studentScoreLists.get(i).listScores();
		}
	}

	public void listScoresForStudent(int s){
		studentScoreLists.get(s).listScores();
		System.out.println("Average: " + getWeightedAverage(s));
	}

	public void addStudentScore(User student, Score score){
		for(int i=0; i < studentScoreLists.size(); i++){
			if(studentScoreLists.get(i).isStudentScores(student)){
				studentScoreLists.get(i).addScore(score);
			}
		}
	}

	public void removeStudentScore(int student, int score){
		studentScoreLists.get(student).removeScore(score);
	}

	public void removeStudent(int i){
		studentList.deleteUser(i);
		studentScoreLists.remove(i);
	}

	public void listStudents(){
		studentList.listUsers();
	}

	public User findStudent(int i){
		return studentList.getUser(i);
	}

	public void addAssignment(Assignment a){
		assignments.add(a);
	}

	public void removeAssignment(int i){
		assignments.remove(i);
	}

	public void listAssignments(){
		for(int i=0; i < assignments.size(); i++){
			assignments.get(i).showAssignment();
		}
	}

	public Assignment findAssignment(int id){
		for(int i=0; i < assignments.size(); i++){
			if(assignments.get(i).getAssignmentID() == id){
				return assignments.get(i);
			}
		}
	return null;
	}

	public void addCategory(Category c){
		categories.add(c);
	}

	public void removeCategory(int i){
		categories.remove(i);
	}

	public void listCategories(){
		for(int i=0; i < categories.size(); i++){
			categories.get(i).showCategory();
		}
	}

        public Category findCategory(int id){
                for(int i=0; i < categories.size(); i++){
                        if(categories.get(i).getCategoryID() == id){
                                return categories.get(i);
                        }
                }
        return null;
        }

}	
