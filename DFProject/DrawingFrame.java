/*
 * The following program will draw a "GO CUBS" where the "O" in "GO" is the Cubs logo.
 * 
 * The program is run from this file.
 * 
 * All three files (this, DrawingPicture.java, and Philosopher-Regular.ttf) need
 * to be accessed from the the same package for the program to run properly.
 * 
 * Mirza Mehmedagic
 * Java 8 Update 191
 * 26/1/2019
 */

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Scanner;
import javax.swing.JFrame;

public class DrawingFrame {	
	private static Scanner kin = new Scanner(System.in);
	
	public static double getUserWidth() {
		System.out.println("Your screen width is: " + Toolkit.getDefaultToolkit().getScreenSize().getWidth()); // Shows user their computer's screen's width
    	System.out.print("What would you like the window's frame to be? ");
    	double width = kin.nextDouble();
    	return width;
	}
	
	public static double width = getUserWidth();
	public static double height = (double) width / 2; 
	
    public static void main(String[] args) {
    	// Creates the frame and set its dimensions and close option
        JFrame frame = new JFrame("Go, Cubs, Go!");
        frame.setSize((int) width, (int) height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Creates and adds the drawing to the frame
        DrawingPicture picture = new DrawingPicture();
        frame.add(picture);
        
        // Makes the frame visible to the user on the screen
        frame.setVisible(true);
    }
}
