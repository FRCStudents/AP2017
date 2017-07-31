
public class MultPractice implements StudyPractice {
    int firstInt;
    int secondInt;
    int currentInt;

    public MultPractice(){
      this(7,8);
    }

    public MultPractice(int f, int s){
      firstInt = f;
      secondInt = s;
      currentInt = s;
    }

    public String getProblem(){
      return firstInt + " TIMES " + secondInt;
    }

    public void nextProblem(){
      System.out.println(firstInt + " TIMES " + ++currentInt);
    }

}
