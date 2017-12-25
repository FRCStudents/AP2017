import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;   
 
public class dt {
   
   public static Date addDays(Date dt, int days){
	Calendar cal = Calendar.getInstance();
	cal.setTime(dt);
	cal.add(Calendar.DAY_OF_YEAR, days);
	return cal.getTime();
   }

   public static Date string2Date(String dateString){
	SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
	Date inputDate = null;
	try {
		inputDate = dateFormat.parse(dateString);
	} catch (ParseException e) { 
    		e.printStackTrace();
	}

	return inputDate;
   }

   public static void prtDate(Date dt){
      SimpleDateFormat dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
      System.out.println("Format 3:   " + dateFormatter.format(dt));
   }

   public static void main(String[] args) {
      String dtString = "08-28-1960";
      Date dt = string2Date(dtString);
      Date newDate = addDays(dt, 4);
      prtDate(dt);
      prtDate(newDate); 
   }
}

 
