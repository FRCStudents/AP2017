package bball;
/***************************************************
 * Basketball book keeping system...
 * Objects:
 *		League (Has list of Seasons, Has list of Teams)
 **************************************************/

import java.io.*;
import java.util.Date;
import java.util.Scanner;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class League extends SubModel {
	private ArrayList<Game> gameList = new ArrayList<Game>();
	public League(){
			super();
	}

	public League(String nm){
			super(nm);
	}

	public League(int id, String nm){
			super(id, nm);
	}

	public League(League l){
			super((SubModel)l);
	}
}
