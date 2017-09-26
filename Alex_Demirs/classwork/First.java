import javax.swing.*;  //Access JFrame
import java.awt.*; //Access Font and Container

public class FirstGUI {
  public static void main(String[] args) {
    JFrame theGUI = new JFrame();
    theGUI.setTitle("First JFrame GUI");
    theGUI.setSize(200,100);
    theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //theGUI.setExtendedState(JFrame.MAXIMIZED_BOTH); // Makes window fullscfreen
    //theGUI.setUndecorated(true); //Covers taskbar and removes top bar from window
    theGUI.setVisible(true);
  }
}