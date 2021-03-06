package skulbrains;
import java.util.Scanner;

public class Score implements IScore {
	int score = 0;
	int assignmentID = 0;
	int studentID = 0;

	public Score(){
		score = 10;
		assignmentID = 0;
		studentID = 0;
	}

	public Score(int s, int a, int stud){
		score = s;
		assignmentID = a;
		studentID = stud;
	}

	public int getScore(){
		return score;
	}

	public void setScore(int s){
		score = s;
	}

	public void setAssignmentID(int a){
		assignmentID = a;
	}

	public int getAssignmentID(){
		return assignmentID;
	}

	public int getPercentage(int points){
		return (score/points) * 100;
	}

	public Score enterScore(int student){
		studentID = student;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter assignment ID: ");
		assignmentID = scanner.nextInt();
		System.out.println("Enter the score: ");
		score = scanner.nextInt();
		return this;
	}	

	public void showScore(){
		System.out.println("Assignment: [" + assignmentID + "]: " + score);
	}
}
