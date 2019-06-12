import java.awt.Rectangle;

public class Rect { // extends Rectangle {
	public static void main(String[] args) {
		Rectangle box = new Rectangle();
		System.out.println(box.getWidth() + " " + box.getX() + " " + box.getY());
		box.setSize(50, 80);
		box.setLocation(10, 20);
		System.out.println(box.getWidth() + " " + box.getX() + " " + box.getY());
	}
}
