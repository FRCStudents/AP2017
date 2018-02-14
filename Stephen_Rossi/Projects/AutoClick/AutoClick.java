import java.awt.AWTException; 
import java.awt.Robot; 
import java.awt.event.MouseEvent;

public class AutoClick{

	public static void MainFunctin(){
		while(true){
			leftClick();
			delay(.005);
		}
	}

	protected static void delay(double seconds){
		createMacro();
		macro.delay((int)(seconds * 1000.0));
	}

	protected static void leftClick(){
		createMacro();
		macro.mousePress(MouseEvent.BUTTON1_MASK);
		macro.mouseRelease(MouseEvent.BUTTON1_MASK);
	}

	private static Robot macro = null;

	private static void createMacro(){
		try{
			macro = new Robot();
		} catch (AWTException e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args){
		MainFunctin();
	}
}