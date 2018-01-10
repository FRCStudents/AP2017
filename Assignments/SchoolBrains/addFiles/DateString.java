package skulbrains;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;   
 
public class DateString {
   Date dsDate;
   String dsString;

   public DateString(String s){
	dsString = s;           
        dsDate = string2Date(s);
   }

   public DateString(Date d){
        dsDate = d;
	dsString = date2String(d);
   }  

   public String getDSString(){
	return dsString;
   }

   public Date getDSDate(){
        return dsDate;
   }
 
   public void addDays(int days){
	Calendar cal = Calendar.getInstance();
	cal.setTime(dsDate);
	cal.add(Calendar.DAY_OF_YEAR, days);
	dsDate = cal.getTime();
	dsString = date2String(dsDate);
   }

   public String date2String(Date d){
      SimpleDateFormat dateFormatter = new SimpleDateFormat("MM-dd-yyyy");
      return dateFormatter.format(d);
   }

   public Date string2Date(String dateString){
	SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
	Date inputDate = null;
	try {
		inputDate = dateFormat.parse(dateString);
	} catch (ParseException e) { 
    		e.printStackTrace();
	}

	return inputDate;
   }

   public String getNiceDSString(){
      SimpleDateFormat dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
      return dateFormatter.format(dsDate);
   }

   public void prtDate(Date dt){
      SimpleDateFormat dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
      System.out.println("Format 3:   " + dateFormatter.format(dt));
   }
}

 
