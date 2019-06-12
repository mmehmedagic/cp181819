import java.util.Scanner;  // Imports Scanner class for user input

public class CashRegister {
  	public static void main(String[] args) {
    	Scanner kin = new Scanner(System.in);  // Creates new Scanner object for all user input

    	System.out.println("Welcome to Change Generator");

    	// Ask for and find amount of bill
    	System.out.print("\nPlease Enter the amount of a Bill \nBill: $");
    	double bill = kin.nextDouble();

	    // Ask for and find amount of money paid
    	System.out.print("\nPlease Enter the amount Paid \nPaid: $");
    	double amountPaid = kin.nextDouble();
	
    	// Calculate change
    	double change = amountPaid - bill;
    	System.out.println("\nChange: $" + change);
    	
    	// creates necessary arrays to use loop
    	double moneyTypes[] = {20, 10, 5, 1, .25, .1, .05, .01};
    	int amountOfEach[] = new int[moneyTypes.length];
    	
    	// Loops though from twenties to pennies:
    	for (int i = 0; i < moneyTypes.length; i++) {
    		amountOfEach[i] = (int) (change / moneyTypes[i]);  // Determines amount of each bill or coin needed
    		change = change % moneyTypes[i];  // Finds remaining change after each bill or coin taken out
    		System.out.println("$" + moneyTypes[i] + ": " + amountOfEach[i]);  // Displays all coinage and billage // Roundoff makes it 1 penny off sometimes
    	}
  	}
}