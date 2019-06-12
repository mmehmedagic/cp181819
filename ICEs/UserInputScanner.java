import java.util.Scanner;

public class UserInputScanner {

	// input method that simplifies everything
	public static String input(String data) {
		Scanner kin = new Scanner(System.in);
	
		System.out.print("What is your " + data + "? ");
		String response = kin.nextLine();
		
		return response;
	}
	
	// main method
	public static void main(String[] args) {
		String firstName = input("first name"); // ask for and store first name
		String lastName = input("last name"); // ask for and store last name
		
		System.out.println("\nHello, " + firstName + " " + lastName + ", nice to meet you! I am classified by the name Bobot.\n"); // ai greeting and introduction
		
		String streetAddress = input("street address"); // ask for and store street address
		String city = input("city"); // ask for and store city
		String state = input("state code"); // ask for and store state code
		String zipCode = input("zip code"); // ask for and store zip code
		
		System.out.println("\n" + firstName + " " + lastName + "\n" + streetAddress + "\n" + city + ", " + state + "  " + zipCode); // your postal address
	}
}