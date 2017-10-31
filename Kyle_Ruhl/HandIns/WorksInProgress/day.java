class day{

String[] days = {

"Monday",
"Tuesday",
"Wednesday",
"Thursday",
"Friday",
"Saturday",
"Sunday",
	};

public void forAll(String[] days) {
  for (int i=0; i<days.length; i++) {
    System.out.println( days[i] );
  }
}

public void forAllReverse(String[] days) {
  for (int j=6; j>days.length; j--) {
    System.out.println( days[j] );
 		 }
  }
}
