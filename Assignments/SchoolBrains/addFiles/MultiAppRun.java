package skulbrains;

import skulbrains.MenuMulti;
import skulbrains.DataHold;

public class MultiAppRun {
        DataHold[] dataHold = new DataHold[4];
	String[] teachers = {"Mr Krug", "Mr Barb", "Mr Hardie", "Mr Tonganoxie"};
	public MultiAppRun(){
		for(int i=0; i < 4; i++){
			dataHold[i] = new DataHold(teachers[i]);
		}
		MenuMulti m = new MenuMulti(dataHold);
	}
	
}

