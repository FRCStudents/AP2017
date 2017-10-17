import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
class Game extends JPanel {
    int x = 0;
    int y = 0;
    private void moveBall() {
        x = x + 1;
        y = y + 1;
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, 300, 300);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Why it no work");
        Game game = new Game();
        frame.add(game);
        frame.setSize(3000, 4000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            game.moveBall();
            game.repaint();
            Thread.sleep(10);
        }
    }
}
