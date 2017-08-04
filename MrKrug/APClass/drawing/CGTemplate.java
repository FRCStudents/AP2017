
import java.awt.*;       // Using AWT's Graphics and Color
import java.awt.event.*; // Using AWT event classes and listener interfaces
import javax.swing.*;    // Using Swing's components and containers
 
public class CGTemplate extends JFrame {
   public static final int CANVAS_WIDTH  = 840;
   public static final int CANVAS_HEIGHT = 480;
 
   private DrawCanvas canvas;
 
   public CGTemplate() {
      canvas = new DrawCanvas();    
      canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
 
      Container cp = getContentPane();
      cp.add(canvas);
 
      setDefaultCloseOperation(EXIT_ON_CLOSE);   
      pack();       
      setTitle("......"); 
      setVisible(true);  
   }
 
   private class DrawCanvas extends JPanel {
      @Override
      public void paintComponent(Graphics g) {
         super.paintComponent(g); 
         setBackground(Color.BLACK); 
 
         g.setColor(Color.YELLOW); 
         g.drawLine(30,40,30,200);
	 g.drawLine(30,200,400,200);
	 g.drawLine(400,200,400,40);
	 g.drawLine(400,40,30,40);

	 g.setColor(Color.RED);
	 g.drawRect(200, 100, 500, 350);

	 g.setColor(Color.BLUE);
         g.drawOval(70, 230, 80, 150);
	 int x, y;
	 x = 72; y = 233;
	 int h, w;
	 w = 77; h = 147;
	 boolean isBlue = false;
	 while(w > 0){
		if(isBlue) g.setColor(Color.RED);
		else 	     g.setColor(Color.BLUE);
		isBlue = !isBlue;
	        g.drawOval(x, y, w, h);
		x+=2;
		y+=3;
		w -= 3;
		h -= 3;
		}

	 g.setColor(Color.RED);

         //g.drawRect(200, 210, 20, 30);
         //g.setColor(Color.RED);  
         //g.fillOval(300, 310, 30, 50);
         g.fillRect(205, 105, 490, 340);

	 int i = 0;
	 int x1 = 210; int y1 = 110; int x2 = 480; int y2 = 330;         
	 while (y2 > 0){
		if(i % 2 == 0) g.setColor(Color.YELLOW);
		else 	       g.setColor(Color.RED);
		g.fillRect(x1, y1, x2, y2);
		x1 += 2;
		x2 -= 4;	
		y1 += 2;
		y2 -= 4;
		i++;
		}
	 g.setColor(Color.RED);
	 g.fillRect(x1, y1, x2, 2);
	 g.setColor(Color.BLACK);
	 g.drawLine(215, 115, 550, 450);
	 g.drawLine(216, 114, 551, 449);
	 g.drawLine(217, 113, 552, 448);
	 g.drawLine(218, 112, 553, 447);
	 g.drawLine(219, 111, 554, 446);
	 g.drawLine(220, 110, 555, 445);
	 g.drawLine(222, 108, 557, 443);
	 g.drawLine(224, 106, 559, 441);
	 g.drawLine(226, 104, 561, 439);
	 //System.out.println("x1: " + x1 + "x2: " + x2 + "y1: " + y1 + "y2: " + y2);
         g.setColor(Color.WHITE);
         g.setFont(new Font("Monospaced", Font.PLAIN, 12));
         g.drawString("Testing custom drawing ...", 10, 20);
	 g.setFont(new Font("Comic", Font.BOLD, 18));
	 g.drawString("Check this out...", 40, 80);
      }
   }

 
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new CGTemplate(); // Let the constructor do the job
         }
      });
   }
}
