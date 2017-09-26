import javax.swing.*;  //Access JFrame
import java.awt.*; //Access Font and Container

public class JFrame{
  public static void main(String[] args) {
    JFrame theGUI = new JFrame();
    theGUI.setTitle("GUI");
    theGUI.setSize(200,100);
    theGUI.setLocationRelativeTo(null);
    theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    theGUI.setVisible(true);
    //theGUI.setDefaultLookAndFeelDecorated(true);

  }   
}