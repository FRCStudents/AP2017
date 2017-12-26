package skulbrains;

import java.util.*;

public class ScoreList implements IScoreList{
	User student;
	int studentID;
	ArrayList<Score> scoreList;

	public ScoreList(){
		student = new User();
		scoreList = new ArrayList<Score>();
		studentID = 0;
	}

	public ScoreList(User u){
		setStudent(u);
		scoreList = new ArrayList<Score>();
	}

	public ScoreList(User u, int studentID){
		setStudent(u);
		this.studentID = studentID;
		scoreList = new ArrayList<Score>();
	}

	public void setStudent(User u){
		student = new User(u);
	}

	public User getStudent(){
		return student;
	}

	public void addScore(Score s){
		scoreList.add(s);
	}

	public void removeScore(int assignmentID){
	int pos = -1;
		for(int i=0; i < scoreList.size(); i++){
			if(scoreList.get(i).getAssignmentID() == assignmentID){
				pos = i;
				break;
			}
		}
	scoreList.remove(pos);
 	}

	public boolean isStudentScores(User u){
		if(student.getFirstName().equals(u.getFirstName()) &&
			student.getLastName().equals(u.getLastName())){
				return true;
		}
	return false;
	}

	public Score findScore(int assignmentID){
		for(int i=0; i < scoreList.size(); i++){
			if(scoreList.get(i).getAssignmentID() == assignmentID){
				return scoreList.get(i);
			}
		}
	return null;
	}

	public void listScores(){
		//student.showUser(studentID);
		for(int i=0; i < scoreList.size(); i++){
			scoreList.get(i).showScore();
		}
	}
}

