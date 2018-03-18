// Main Application... 


// model classes
import bball.Navigator;

// view classes
import books.*;
import bball.View;

class MainApp {

 	public static void main(String[] argv){
		Navigator NC = Navigator.getInstance();
		View view = new View(NC);
	}
}	
