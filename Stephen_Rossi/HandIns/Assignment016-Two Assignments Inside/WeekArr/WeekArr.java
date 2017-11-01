import java.util.*;

public class WeekArr {
  private final String[] days = {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday"};

  public void throughWeek(){
    for(int i = 0; i < days.length; i++){
      System.out.println(days[i]);
    }
  }
  public void weekThrough(){
    for(int i = days.length - 1; i >= 0; i--){
      System.out.println(days[i]);
    }
  }
}
