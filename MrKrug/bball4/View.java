package bball;
import bball4view.BookView;
import bball4view.LeagueView;

import bball.Navigator;

public class View {
	private Navigator NC;
	private BookView bView;
	private LeagueView lView;

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
	}

	public void getLeagueView(){
		NC = Navigator.getInstance();
		NC.createLeagueList();
		NC.getLeagueList().displayList();
		lView = new LeagueView(NC, NC.getLeagueList().getStringList());
		lView.setVisible(true);
		bView.setVisible(false);
	}
}
