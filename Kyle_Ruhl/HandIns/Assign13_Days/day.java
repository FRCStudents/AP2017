public class day{

public String[] days = {

"Monday",
"Tuesday",
"Wednesday",
"Thursday",
"Friday",
"Saturday",
"Sunday"
	};

public void ForwardsDays(){
  for (int i=0; i<days.length; i++) {
    System.out.println( days[i] );
  }
}

public void ReverseDays(){
  for (int j=days.length -1; j>=0; j--) {
    System.out.println( days[j] );
 		 }
  }

}