import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;

public class MMouse extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.black);
		
		Ellipse2D.Double face = new Ellipse2D.Double(MMFrame.width / 2 - MMFrame.width / 4, MMFrame.height / 2 - MMFrame.width / 4, MMFrame.width / 2, MMFrame.width / 2);
		g2.fill(face);
				
		Ellipse2D.Double ear = new Ellipse2D.Double(MMFrame.width / 4 - MMFrame.width / 8, MMFrame.height / 4 - MMFrame.width / 8, MMFrame.width / 4, MMFrame.width / 4);
		g2.fill(ear);
				
		ear.setFrame(MMFrame.width * 2 / 4 + MMFrame.width / 8, MMFrame.height / 4 - MMFrame.width / 8, MMFrame.width / 4, MMFrame.width / 4);
		g2.fill(ear);
	}
}