// Group 2: Evan, Horeb, Mirza, Sharon

import java.util.Scanner;

public class TaxComputer {
  public static void main(String[] args) {
    Scanner kin = new Scanner(System.in);
    
    System.out.println("Calculating Income Tax");
    System.out.println();
    
    System.out.print("Total income for the year: $");
    int income = kin.nextInt(); // Ask for an income amount
    
    System.out.println();
    System.out.print("Tax to be paid: $");

    // Template for taxataion on income:
    // (income - [mininum for current bracket]) * [tax for bracket] + [taxation for brackets lower than current]

    if (income <= 9525 && income >= 0) { // Range for first bracket
		System.out.println(income * 0.1); // Standard 10% of income is taxed
	}
	else if (income <= 38700  && income > 9525) { // Range for second bracket
		System.out.println((income - 9525) * 0.12 + 952.5); // Template used for second bracket
	}
	else if (income <= 82500 && income > 38700) { // Range for third bracket
		System.out.println((income - 38700) * 0.22 + 4453.5); // Template used for third bracket
	}
	else if (income <= 157500 && income > 82500) { // Range for fourth bracket
		System.out.println((income - 82500) * 0.24 + 14089.5); // Template used for fourth bracket
	}
	else if (income <= 200000 && income > 157500) { // Range for fifth bracket
		System.out.println((income - 157500) * 0.32 + 32089.5); // Template used for fifth bracket
    }
    else if(income <= 500000 && income > 200000) { // Range for sixth bracket
		System.out.println((income - 200000) * 0.35 + 45689.5); // Template used for sixth bracket
	}
	else if (income > 500000) { // Range for seventh bracket
		System.out.println((income - 500000) * 0.37 + 150689.5);// Template used for seventh bracket
	}
    else { // Negative numbers
      System.out.println("Invalid income; Warning: You are now entering debt.");
    }
  }
}