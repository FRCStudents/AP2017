import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyWage {

    private Scanner reader = new Scanner(System.in);

    // put all the prompts in one place - for convenience
    private static void prompt(int i, String txt1){
      switch(i){
        case 1: System.out.print("How many hours did you work on " + txt1 +", excluding overtime? ");
                break;
        case 2: System.out.print("How many hours of overtime did you work on " + txt1 + "? ");
                break;
        case 3: System.out.print("How much do you make per hour: ");
                break;
        case 4: System.out.println("Your weekly earnings were: $" + txt1);
                break;
        case 11: System.out.println("The question is, if you make that kind of hourly wage, should you stop working long enough to pick up a $100 bill lying on the floor?!");
                break;
        default: System.out.println();
          }
    }

    // convert int to name of the day
    private String day2String(int day){
      switch(day){
        case 1: return "Monday";
        case 2: return "Tuesday";
        case 3: return "Wednesday";
        case 4: return "Thursday";
        case 5: return "Friday";
        case 6: return "Saturday";
        case 7: return "Sunday";
      }
      return "";
    }

    private int getRegHours(int day) {
        prompt(1, day2String(day));
        return reader.nextInt();
    }

    private int getOverTimeHours(int day) {
        prompt(2, day2String(day));
        return reader.nextInt();
    }

    private double calcWages(int hours, double amt, boolean overtime){
        if(overtime){
          return hours * amt * 1.5;
        }
        return hours * amt;
    }

    // get hours for the whole week (day by day)
    private double getWholeWeek(double amt){
        double totalPay = 0;
        int hoursHold, ovHoursHold = 0;
        //int ovHoursHold = 0;
        for(int i=1; i<8; i++){
            hoursHold = getRegHours(i);
            ovHoursHold = 0;
            if(hoursHold >= 8){
              ovHoursHold = getOverTimeHours(i);
            }
            totalPay += calcWages(hoursHold, amt, false) + calcWages(ovHoursHold, amt, true);
          }
        return totalPay;
    }

    public static void main(String[] args) {
        WeeklyWage pay = new WeeklyWage();
        prompt(3, "");
        double hourlyWage = pay.reader.nextDouble();
        if(hourlyWage > 70200){
          prompt(11, "");
          return;
        }
        prompt(5, "");
        double db = pay.getWholeWeek(hourlyWage);
        prompt(4, Double.toString(db));
    }
}