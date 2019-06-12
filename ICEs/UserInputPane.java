import javax.swing.JOptionPane;

public class UserInputPane {
    public static void main(String[] args){
        
        /*
        public static int showOptionDialog(Component parentComponent,
     		Object message, String title,
        	int optionType, int messageType,
        	Icon icon,
        	Object[] options,
		Object initialValue)
            		throws HeadlessException 
            	
        public static Object showInputDialog(Component parentComponent,
       		Object message, String title,
     		int messageType,
       		Icon icon,
        	Object[] selectionValues,
        	Object initialSelectionValue)
            		throws HeadlessException
            	
        public static String showInputDialog(Component parentComponent,
        	Object message, String title,
            	int messageType)
            		throws HeadlessException
        
        public static void showMessageDialog(Component parentComponent,
        	Object message,
            	String title,
            	int messageType,
            	Icon icon)
            		throws HeadlessException  	
        
	public static int showConfirmDialog(Component parentComponent,
        	Object message, String title,
        	int optionType, int messageType,
        	Icon icon)
                	throws HeadlessException
        */
        
        String name = JOptionPane.showInputDialog(null, "Enter your name", "Your Name Input", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, name, "Your Name Output", JOptionPane.INFORMATION_MESSAGE);
		
	Object[] options = {"Cancel", "Continue""};
	JOptionPane.showOptionDialog(null, "Click yes to continue", "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
    }
}
