import javax.swing.JFrame;

// Driver class
public class FrameDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame Demo");  // Creates a new JFrame object (a window) and sets the title of said window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Allows the window to be closed when wanted by the user
        frame.setSize(400, 400); // Defines the dimensions (width, height) of the window
    	
   		Shapes r = new Shapes(); // Creates a new Shapes object
    	frame.add(r); // Adds that object to the frame
        
        frame.setVisible(true); // Makes the window visible on the screen
    }
}
