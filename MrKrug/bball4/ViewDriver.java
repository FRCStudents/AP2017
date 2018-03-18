import bball.View;
import bball.Navigator;

public class ViewDriver {
   private static Navigator NC;

   public static void main(String[] argv){
	NC = Navigator.getInstance();
	
	View v = new View(NC);
	System.out.println("In ViewDriver - NC.getCommand: " + NC.getCommand());
	v.getBookView();
	while(NC.getCommand() != 0){
                if(NC.getCommand() == 2){
                        v.getLeagueView();
                        System.out.println("League View should come up");
			NC.setCommand(3);
                }

		if(NC.getCommand() == 1){
			System.out.println("Now this:" + NC.getNextModelName());
			NC.setCommand(2);
		}
	}
    }
}	
