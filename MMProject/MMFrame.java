import javax.swing.JFrame;

public class MMFrame {
	// Used to adjust sizes of face and ears in MMouse class for different frame sizes
	public static int width = 800;
	public static int height = 800;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Mickey Mouse");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		
		MMouse mouse = new MMouse();
		frame.add(mouse);
		
		frame.setVisible(true);
	}
}
