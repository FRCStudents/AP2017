class Car {
    private int speed = 0;
    private String[] visual_forward = {
        "  ______", 
        " /|_||_\\'.__", 
        "(   _    _ _\\ ", 
        "='-(_)--(_)-'"};
    private String[] visual_backward = {
        "     ______", 
        " __.'/_||_|\\ ", 
        "/_ _    _   )", 
        "'-(_)--(_)-'="};

    public String repeatString(String s, int times) {
        String placeholder = "";

        if (times > 0) {
            for(int i = 0; i < times; i++) {
                placeholder += s;
            }
            return placeholder;
        } else {
            return "";
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
/* car models
  ______
 /|_||_\'.__
(   _    _ _\
='-(_)--(_)-'

     ______  
 __.'/_||_|\ 
/_ _    _   )
'-(_)--(_)-'=

*/
