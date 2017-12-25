package skulbrains;

public interface IScoreList{
	public void setStudent(User u);
	public User getStudent();
	public void addScore(Score s);
	public boolean isStudentScores(User u);
	public Score findScore(int assignmentID);
	public void listScores();
}

