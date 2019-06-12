import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;

public class Shapes extends JComponent {
    public void paintComponent(Graphics g) { // Method that serves as auto-drawer when object added to a frame
        Graphics2D g2 = (Graphics2D) g; // Creates a 2D Graphics object or pen

        Rectangle box = new Rectangle(5, 10, 20, 30); // Creates new Rectangle object at (5, 10) with width 20 and height 30
        g2.draw(box); // Draws said Rectangle in default color of black

        g2.setColor(Color.blue); // Makes the current color of g2 pen blue

        Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 200, 200); // Creates new Ellipse object at (100, 100) with width 200 and height 200
        g2.fill(circle); // Draws and fills said Ellipse with color of blue
    }
}
