package skulbrains;

import skulbrains.Menu;
import skulbrains.DataHold;

public class AppRun {
        DataHold dataHold = new DataHold();

	public AppRun(){
		dataHold = new DataHold();
		Menu m = new Menu(dataHold);
	}
	
}

