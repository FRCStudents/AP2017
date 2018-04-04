import bball.View;
import bball.Navigator;
import java.lang.*;

public class MainApp implements Runnable {
   private static Navigator NC;
   private static View view;
   public void run(){
	while(NC.getCommand() != 0){
                if(NC.getCommand() == 3){
                        view.getGameView();
                        System.out.println("Game View should come up");
                        NC.setCommand(99);
                }

                if(NC.getCommand() == 2){
                        view.getLeagueView();
                        System.out.println("League View should come up");
			NC.setCommand(99);
                }

		if(NC.getCommand() == 1){
			System.out.println("Now this:" + NC.getNextModelName());
			NC.setCommand(99);
		}

                if(NC.getCommand() == 340){
                        System.out.println("Deleting League");
                        NC.setCurrentModelName("LEAGUES");
                        NC.deleteItem();
                        NC.setCommand(99);
                }

                if(NC.getCommand() == 341){
			view.goBackToBookView();
                        NC.setCurrentModelName("BOOKS");
                        NC.setCommand(99);
                }

		if(NC.getCommand() == 344){
			view.getAddLeagueView();
			NC.setCommand(99);
		}

                if(NC.getCommand() == 345){
                        NC.setCurrentModelName("LEAGUES");
			String[] fields = new String[2];
			fields[1] = NC.getField001();
			fields[0] = NC.getCurrentStringChoice();
                        NC.addItem(fields);
                        NC.setCommand(99);
			view.navAddToLeague();
                }

                if(NC.getCommand() == 346){
                        view.getChangeLeagueView();
                        NC.setCommand(99);
                }


                if(NC.getCommand() == 348){
                        NC.setCurrentModelName("LEAGUES");
                        String[] fields = new String[5];

			fields[4] = NC.getOldVal();
			fields[3] = NC.getNewVal();
                        fields[2] = NC.getField001();
                        fields[1] = NC.getCurrentStringChoice();
			fields[0] = NC.getBookName();

                        NC.changeItem(fields);
                        NC.setCommand(99);
			view.navChangeToLeague();
                }

 
		if(NC.getCommand() == 440){
			NC.setCurrentModelName("GAMES");
			NC.deleteItem();
			NC.setCommand(99);
		}
		try {
			Thread.sleep(200);
		} catch (Exception e){
			System.out.println(e);
		}


                if(NC.getCommand() == 441){
                        view.goBackToLeagueView();
                        NC.setCurrentModelName("LEAGUES");
                        NC.setCommand(99);
                }

		//System.out.println(NC.getCommand());
	}
    }
   
   public static void main(String[] argv){
        NC = Navigator.getInstance();
        view = new View(NC);
        System.out.println("In ViewDriver - NC.getCommand: " + NC.getCommand());
        view.getBookView();
	Thread t = new Thread(new MainApp());
	t.start();
   }	
}	
