public class Sunday{
	
public String forward_car = "\n ----------\\ \n {| [ ]  [0] | \n --(O)--(O)--";
public String backward_car = "\n //---------- \n | [0] [ ] |} \n --(O)--(O)--";
private int speed = 3;
private String forwards;
private String backwards;

public String getForwards () {
				return forwards;
		}
public	void setForwards(String newForwards) {
			forwards = newForwards;
		}

public String getBackwards () {
				return backwards;
		}
public	void setBackwards(String newBackwards) {
			backwards = newBackwards;
		}

public int getSpeed () {
				return speed;
		}
public	void setSpeed(int newSpeed) {
			speed = newSpeed;
		}

public static void print80ForwardLines(){
	for (int v = 0; v < 80; v++){
		System.outprintln(forward_car);
	}
}

public static void print80BackwardLines(){
	for (int c = 0; c < 80; c++){
		System.outprintln(backward_car);
	}
}

public String replaceString(String s, int times) {
        String placeholder = "";

        if (times > 0) {
            for(int i = 0; i < times; i++) {
                placeholder += s;
            }
            return placeholder;
        } else {
            return "error";
        }
    }



public static void wait(){
		try{
			Thread.sleep(length);
		}
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}


}