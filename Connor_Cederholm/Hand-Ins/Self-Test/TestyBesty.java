class TestyBesty{
	  int getDay(int m){
        return daysOfMonth[m - 1];
      }
      void setFebruary(){
        daysOfMonth[1] = 29;
      }
       boolean checkDay(int m, int d){
        if((d >= 1)) && (d <= daysOfMonth[m - 1])){
            return true;

        } else {
            return false;
        }
    }
      void printMonths(String[] monthNames){
        for(int i = 0; i < 12; i++){
            System.out.println(daysOfMonth[i] + ":" + monthNames[i]);
        }
}