import bball.Navigator;

public class NaviDriver {
   private static Navigator NC;

   public static void main(String[] argv){
	NC = Navigator.getInstance();
	NC.setCurrentStringChoice("ALEAGUE-1");
	NC.createGameList();
	String[] sArr = NC.getStringArray();
	for(int i=0; i<sArr.length; i++){
		System.out.println(sArr[i]);
	}	
    }
}	
