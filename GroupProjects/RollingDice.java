import java.util.Scanner;

public class RollingDice {
	public static void main(String[] args) {
		System.out.println("Rolling two dice\n");
		
		Scanner kin = new Scanner(System.in);
		String answer = "y";
		int rand1, rand2;
		
		while (answer.equals("y")) {
			rand1 = (int) (Math.random() * 6 + 1);
			rand2 = (int) (Math.random() * 6 + 1);
			
			System.out.print("Die 1: " + rand1 + ", ");
			System.out.print("Die 2: " + rand2 + ", ");
			System.out.println("sum of two dice: " + (rand1 + rand2));
			
			System.out.print("Would you like to roll again? (y/n) ");
			answer = kin.next();
		}
		
		System.out.println("\nGoodbye");
	}
}