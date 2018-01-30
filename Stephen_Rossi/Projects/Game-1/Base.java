import javax.swing.*;
import java.awt.*;

public class Base {
  private static int height = 1080;
  private static int width = 1920;
  private static int objHeight = 200;
  private static int objWidth = 200;
  private int currentDirection = 0;
  /* Direction | value
    -----------+-------
       Right   |   0
       Down    |   1
       Left    |   2
       Up      |   3
  */
  public static void main(String[] args) {
      JFrame frame = new JFrame("Game-1");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(width, height);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);

  }
}
