package skulbrains;

public interface IScore {
        public int getScore();
        public void setScore(int s);
        public void setAssignmentID(int a);
        public int getAssignmentID();
        public int getPercentage(int points);
        public void showScore();
	public Score enterScore(int student);
}
