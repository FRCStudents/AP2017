package bball;
import bball4view.BookView;
import bball4view.LeagueView;
import bball4view.GameView;

import bball.Navigator;
import java.util.concurrent.TimeUnit;

public class View {
	private Navigator NC;
	private BookView bView;
	private LeagueView lView;
	private GameView gView;

	public View(){
		this(Navigator.getInstance());
	}

	public View(Navigator NC){
		this.NC = NC;
		//getBookView();
	}

	public void getBookView(){
		bView = new BookView(NC, NC.getBookList().getStringList());
		bView.setVisible(true);
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch(Exception e){
			System.out.println("Insomiac");
		}
	}

	public void getLeagueView(){
		NC = Navigator.getInstance();
		NC.createLeagueList();
		NC.getLeagueList().displayList();
		lView = new LeagueView(NC, NC.getLeagueList().getStringList());
		lView.setVisible(true);
		bView.setVisible(false);
                try {
                        TimeUnit.SECONDS.sleep(1);
                } catch(Exception e){
                        System.out.println("Insomiac");
                }
	}

        public void getGameView(){
                NC = Navigator.getInstance();
                NC.createGameList();
                NC.getGameList().displayList();
                gView = new GameView(NC, NC.getGameList().getStringList());
		gView.setVisible(true);
                lView.setVisible(false);
                bView.setVisible(false);
                try {
                        TimeUnit.SECONDS.sleep(1);
                } catch(Exception e){
                        System.out.println("Insomiac");
                }

        }


}
