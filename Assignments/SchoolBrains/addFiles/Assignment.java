
package skulbrains;

public class Assignment implements IAssignment {

	private String name;
	private int points;
	private boolean use;
	private int categoryID;
	private String assignmentDate;
	private String dueDate;
	private int assignmentID;

	public Assignment(){
		use = true;
		points = 10;
		name = "Assignment";
		categoryID = 1;
		assignmentDate = "Dec 21, 2017";
		dueDate = "Jan 1, 2018";
	}

	public Assignment(String n, int s){
		this();
		name = n;
		points = s;
	}

	public void setAssignmentDate(String dt){
		assignmentDate = dt;
	}

	public String getAssignmentDate(){
		return assignmentDate;
	}

        public void setDueDate(String dt){
                dueDate = dt;
        }

        public String getDueDate(){
                return dueDate;
        }

	public void setCategoryID(int id){
		categoryID = id;
	}

	public int getCategoryID(){
		return categoryID;
	}

	public void setPoints(int s){
		points = s;
	}

	public void setName(String n){
		name = n;
	}

	public int getPoints(){
		return points; 
	}

	public void setAssignmentID(int id){
		assignmentID = id;
	}

	public int getAssignmentID(){
		return assignmentID;
	}

	public void showAssignment(){
		System.out.println("Assignment(" + name + ") ID: " + assignmentID + " Assigned: " + assignmentDate + " Due: " + dueDate + " in category (" + getCategoryID() + ") worth " + points + " points"); 
		//System.out.println("******************************** ");
		//System.out.println("Assignment: " + assignmentID + "          ");
		//System.out.println(name);
		//System.out.println(points + " points date: " + assignmentDate);
		//System.out.println("Due: " + dueDate);
		//System.out.println("Category: [" + getCategoryID() + "]");
		//System.out.println("*********************************");
	}
} 
