import javax.swing.*;
import java.awt.*;

public class GUI{
    public static void main(String[] args){
        JFrame theGUI = new JFrame();
        theGUI.setTitle("GUI");
        theGUI.setSize(200,100);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color purple=new Color(115, 0, 153);
        JPanel panel = new JPanel();
        panel.setBackground(purple);
        Container pane=theGUI.getContentPane();
        pane.add(panel);
        theGUI.setVisible(true);
    }
}
