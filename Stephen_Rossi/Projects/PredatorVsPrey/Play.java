import javax.swing.*;
import java.awt.*;

public class Play{
  public static void main(String[] argv){
    JFrame frame  = new JFrame("Swing");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new GridLayout());
    Container contentPane = frame.getContentPane();

    frame.drawRect(5, 5, 105, 105);


    frame.pack();
    //frame.setBounds(40, 40, 1920, 1080);
    frame.setVisible(true);
  }
}
