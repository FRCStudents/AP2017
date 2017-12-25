import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
  
public class CalendarTest {
   public static void main(String[] args) {
      Calendar cal = Calendar.getInstance();   // GregorianCalendar
      System.out.println("Calendar's toString() is : " + cal + "\n");
      System.out.println("Time zone is: " + cal.getTimeZone() + "\n");
  
      // An Easier way to print the timestamp by getting a Date instance
      Date date = cal.getTime();
      System.out.println("Current date and time in Date's toString() is : " + date + "\n");
  
      // Print Calendar's field
      System.out.println("Year  : " + cal.get(Calendar.YEAR));
      System.out.println("Month : " + cal.get(Calendar.MONTH));
      System.out.println("Day of Month : " + cal.get(Calendar.DAY_OF_MONTH));
      System.out.println("Day of Week  : " + cal.get(Calendar.DAY_OF_WEEK));
      System.out.println("Day of Year  : " + cal.get(Calendar.DAY_OF_YEAR));
      System.out.println("Week of Year : " + cal.get(Calendar.WEEK_OF_YEAR));
      System.out.println("Week of Month : " + cal.get(Calendar.WEEK_OF_MONTH));
      System.out.println("Day of the Week in Month : " + cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
      System.out.println("Hour  : " + cal.get(Calendar.HOUR));
      System.out.println("AM PM : " + cal.get(Calendar.AM_PM));
      System.out.println("Hour of the Day : " + cal.get(Calendar.HOUR_OF_DAY));
      System.out.println("Minute : " + cal.get(Calendar.MINUTE));
      System.out.println("Second : " + cal.get(Calendar.SECOND));
      System.out.println();
  
      // Manipulating Dates
      Calendar calTemp;
      calTemp = (Calendar) cal.clone();
      calTemp.add(Calendar.DAY_OF_YEAR, -365);
      System.out.println("365 days ago, it was: " + calTemp.getTime());

      calTemp = (Calendar) cal.clone();
      calTemp.add(Calendar.HOUR_OF_DAY, 11);
      System.out.println("After 11 hours, it will be: " + calTemp.getTime());

      // Roll
      calTemp = (Calendar) cal.clone();
      calTemp.roll(Calendar.HOUR_OF_DAY, 11);
      System.out.println("Roll 11 hours, it will be: " + calTemp.getTime());
      System.out.println();
   }
}

 
