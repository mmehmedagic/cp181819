/*
 * The following program will draw a "GO CUBS" where the "O" in "GO" is the Cubs logo.
 * 
 * This file merely contains the logic behind the drawing and should not be run.
 * 
 * All three files (this, DrawingFrame.java, and Philosopher-Regular.ttf) need
 * to be accessed from the the same package for the program to run properly.
 * 
 * Mirza Mehmedagic
 * Java 8 Update 191
 * 26/1/2019
 */

import java.awt.*; // main import uses: Color, Font, Graphics, Graphics2D, GraphicsEnvironment, Polygon
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.io.File;
import java.io.IOException;
import javax.swing.JComponent;
import javax.swing.UIManager;

public class DrawingPicture extends JComponent {
	// Makes typing easier for me and code nicer-looking for everyone else
	private static double width = DrawingFrame.width;
	private static double height = DrawingFrame.height;
	
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
		
        // drawGrid(g2); // Draws grid for precision in drawing when I tested it
    	
    	// Draws the C part of the G as a pie
    	g2.setColor(Color.BLUE);
		Arc2D arc = new Arc2D.Double(width / 8, height / 8, 3 * width / 8, 3 * height / 4, 45, 270, Arc2D.PIE);  // 100, 50, 300, 300
		g2.fill(arc);
		
		// Makes the pie a C
		g2.setColor(UIManager.getColor("Panel.background")); // Set to background color of frame
		Ellipse2D circle = new Ellipse2D.Double(width / 8 + width / 32, height / 8 + height / 16, 5 * width / 16, 5 * height / 8); // 125, 75, 250, 250
		g2.fill(circle);
    	
    	// Draws the G's proruption or panhandle that differienates it from a C
    	g2.setColor(Color.BLUE);
    	Polygon poly = new Polygon();
    	poly.addPoint((int) (5 * width / 16), (int) (height / 2)); // 250, 200
    	poly.addPoint((int) (71 * width / 160), (int) (height / 2)); // 355, 200
    	poly.addPoint((int) (71 * width / 160), (int) (61 * height / 80)); // 355, 305
    	poly.addPoint((int) (13 * width / 32), (int) (61 * height / 80)); // 325, 305
    	poly.addPoint((int) (13 * width / 32), (int) (23 * height / 40)); // 325, 230
    	poly.addPoint((int) (5 * width / 16), (int) (23 * height / 40)); // 250, 230
    	g2.fill(poly);
    	
    	// Draws the exterior blue circle
    	g2.setColor(Color.BLUE);
    	circle.setFrame(width / 2, height / 8, 3 * width / 8, 3 * height / 4); // 400, 50, 300, 300
    	g2.fill(circle);
    	
    	// Draws the interior white circle
    	g2.setColor(Color.WHITE);
    	circle.setFrame(width / 2 + width / 32, height / 8 + height / 16, 5 * width / 16, 5 * height / 8); // 425, 75, 250, 250
		g2.fill(circle);
		
		// Draws the C as a pie
    	g2.setColor(Color.RED);
		arc.setArc(width / 2 + width / 16, height / 4, width / 4, height / 2, 45, 270, Arc2D.PIE); // 450, 100, 200, 200
		g2.fill(arc);
		
		// Makes the pie a C
		g2.setColor(Color.WHITE);
		circle.setFrame(width / 2 + 3 * width / 32,  height / 4 + height / 16, width / 8 + width / 16, height / 4 + height / 8); // 475, 125, 150, 150
		g2.fill(circle);
		
		try { // Get a new font from a local .ttf font file
     		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
     		ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Philosopher-Regular.ttf"))); // This is the closest font I could find to the actual logo font
		} catch (IOException | FontFormatException e) { // Catch exception if font file is not present or is corrupted
     		e.printStackTrace();
			System.exit(-1);
		}
		
		// Write UBS in the new font with red color
		g2.setColor(Color.RED);
		g2.setFont(new Font("Philosopher-Regular", Font.PLAIN, (int) (3 * width / 32))); // 75
		g2.drawString("UBS", (int) (5 * width / 8), (int) (9 * height / 16)); // 500, 225
    }
    
    public void drawGrid(Graphics g2) {
        g2.setColor(new Color(211, 211, 211));
        
        // Draw vertical lines
        for(int x = 0; x < width; x += 50){
            g2.drawLine(x, 0, x, (int) height);
            g2.drawString("" + x, x, 10);
        }
        
        // Draw horizontal lines
        for(int y = 50; y < height; y += 50){
            g2.drawLine(0, y, (int) width, y);
            g2.drawString("" + y, 0, y);
        }
    }
}
