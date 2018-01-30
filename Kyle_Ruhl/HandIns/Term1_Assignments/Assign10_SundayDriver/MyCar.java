
	public class MyCar{

	private int speed = 20;

//going forwards
    private String[] visual_forward = {

	/*" 	     **",
	" 	    ****",
	"	   ******",*/
	"	  ********", 
        " 	 **********",	
        "	*---***---**",
        "......***()******()**"};

//Going backwards
    private String[] visual_backward = {
       
	/*"    **",
	"     ****",
	"    ******",*/
	"   ********",
        "  **********",	
        " *---***---**", 
        "**()******()*** ......"};

    public String repeatString(String s, int times) {
        String parking = "Entrance to the pit of death---";

        if (times > 0) {
            for(int i = 0; i < times; i++) {
                parking += s;
            }
            return parking;
        } else {
            return "Congratulations";
        }
    }

    public void setSpeed(int new_speed) {
        speed = new_speed;
    }
    public String getForwardVisual(int index) {
        return visual_forward[index];
    }
    public String getBackwardVisual(int index) {
        return visual_backward[index];
    }
}
