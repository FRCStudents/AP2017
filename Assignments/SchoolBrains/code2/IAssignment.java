
package skulbrains;

public interface IAssignment {
	public void setPoints(int s);
	public void setName(String n);
	public int getPoints();
	public void showAssignment();
	public void setAssignmentID(int i);
	public int getAssignmentID(); 
        public void setCategoryID(int id);
        public int getCategoryID();
        public void setAssignmentDate(String dt);
        public String getAssignmentDate();
        public void setDueDate(String dt);
        public String getDueDate();
} 
