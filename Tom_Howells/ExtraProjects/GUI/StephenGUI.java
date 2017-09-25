import javax.swing.*;  //Access JFrame
import java.awt.*; //Access Font and Container

public class StephenGUI {
  public static void main(String[] args) {
    JFrame theGUI = new JFrame();
    theGUI.setTitle("First JFrame GUI");
    theGUI.setSize(200,100);
    theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    theGUI.setVisible(true);
  }
}
