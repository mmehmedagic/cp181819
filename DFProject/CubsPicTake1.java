/*
 * Write a description of class here.
 *
 * Mirza Mehmedagic
 * Java 8 Update 191
 * 17/1/2019
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.io.File;
import java.io.IOException;

public class DrawingPicture extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
		
		// comment this out once you have finished
        drawGrid(g2);
		
    	g2.setColor(Color.BLUE);
    	Ellipse2D circle = new Ellipse2D.Double(450, 50, 300, 300);
    	g2.fill(circle);
    	
    	g2.setColor(Color.WHITE);
    	circle.setFrame(475, 75, 250, 250);
		g2.fill(circle);
		
    	g2.setColor(Color.RED);
		Arc2D arc = new Arc2D.Double(500, 100, 200, 200, 45, 270, Arc2D.PIE);
		g2.fill(arc);
		
		g2.setColor(Color.WHITE);
		circle.setFrame(525, 125, 150, 150);
		g2.fill(circle);
		
		try {
     		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
     		ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Philosopher-Regular.ttf")));
		} catch (IOException | FontFormatException e) {
     		e.printStackTrace();
			System.exit(-1);
		}
		
		g2.setColor(Color.RED);
		g2.setFont(new Font("Philosopher-Regular", Font.PLAIN, 75));
		g2.drawString("UBS", 550, 225);
    }
    
    public void drawGrid(Graphics g2) {
        g2.setColor(new Color(211, 211, 211));
        
        // Draw vertical lines
        for(int x = 0; x < DrawingFrame.WIDTH; x += 50){
            g2.drawLine(x, 0, x, DrawingFrame.HEIGHT);
            g2.drawString("" + x, x, 10);
        }
        
        // Draw horizontal lines
        for(int y = 50; y < DrawingFrame.HEIGHT; y += 50){
            g2.drawLine(0, y, DrawingFrame.WIDTH, y);
            g2.drawString("" + y, 0, y);
        }
    }
}
