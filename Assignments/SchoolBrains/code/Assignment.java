
package skulbrains;

public class Assignment {
	private String name;
	private int score;
	private boolean use;
	private int categoryID;
	private String assignmentDate;
	private String dueDate;
	private int AssignmentID;

	public Assignment(){
		score = 10;
		use = true;
		name = "Assignment";
		categoryID = 1;
		assignmentDate = "Dec 21, 2017";
		dueDate = "Jan 1, 2018";
	}

	public Assignment(String n, int s){
		this();
		name = n;
		score = s;
	}

	public void setScore(int s){
		score = s;
	}

	public void setName(String n){
		name = n;
	}

	public int getScore(){
		return score;
	}

	public void showAssignment(){
		System.out.println("******************************** ");
		System.out.println("Assignment:                      ");
		System.out.println(name);
		System.out.println(score + " points date: " + assignmentDate);
		System.out.println("Due: " + dueDate);
		System.out.println("*********************************");
	}
} 
