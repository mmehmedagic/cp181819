import java.util.Scanner;  // import Scanner class in util package from java library to allow user input

// defining a class
public class GradeCalculator {

  private static Scanner kin = new Scanner(System.in);   // creates scanner to be used by entire class
  
  // method that simulates Python user input logic (only for doubles though)
  public static double input(String statement) {
    System.out.print(statement);
    double toReturn = kin.nextDouble();  // ask for and store the input as a double
    return toReturn;  // returns the input to be stored as shown in the main method
  }
  
  // main method that runs program
  public static void main(String[] args) {
    // user enters homework grades to be averaged
    System.out.println("Enter your grades for your:");
    double homework1 = input("1st Homework Assignment: ");
    double homework2 = input("2nd Homework Assignment: ");
    double homework3 = input("3rd Homework Assignment: ");
    double homeworkAvg = (homework1 + homework2 + homework3) / 3;
    
    // user enters quiz grades to be averaged
    double quiz1 = input("1st Quiz: ");
    double quiz2 = input("2nd Quiz: ");
    double quizAvg = (quiz1 + quiz2) / 2;
    
    // user enters final exam grade
    double finalExam = input("Final Exam: ");
    
    // weights the averages and adds them up to get the final grade
    double finalGrade = (0.5 * quizAvg) + (0.3 * finalExam) + (0.2 * homeworkAvg);
     
    // print all details for the user to see
    System.out.println("Your average for homework assignments is: " + homeworkAvg + "%");
    System.out.println("Your average for quizzes is: " + quizAvg + "%");
    System.out.println("Your final exam grade (and average) was: " + finalExam + "%\n");
    System.out.println("Your final weighted grade is: " + finalGrade + "%");
    
  }
}
