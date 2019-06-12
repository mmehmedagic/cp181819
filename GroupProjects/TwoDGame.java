import java.util.Scanner;

public class TwoDGame {
  // Static data types outside main to be accessible in all methods
  static int userY, userX; // User or 'x' coordinates
  static int goalY, goalX; // Ending spot or '*' coordinates
  
  public static void main(String[] args) {
    Scanner kin = new Scanner(System.in); // For user input
    String answer = "";
    int moves = 0; // User's move counter
    
    userY = 0; userX = 0; // Set original user coordinates
    goalY = 0; goalX = 0;
    while (goalY == userY && goalX == userX) { // While ending spot coordinates are the user coordinates to avoid victory without moves
      // Set original ending spot coordinates
      goalY = (int) (Math.random() * 4);
      goalX = (int) (Math.random() * 4);
    }
    int eff = (goalY + goalX);
    char[][] board = new char[4][4]; // Set board and its size
  
  // Set all of board to be empty spot represented  by 'O'
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[0].length; col++) {
        board[row][col] = 'O';
      }
    }

    board[userY][userX] = 'x';
    board[goalY][goalX] = '*';
  
  // Welcome text
    System.out.println("Welcome to the Array Game!  Move your sprite \"x\" to the \"*\" to win.");
    System.out.println("\nInitial Board:");
  
    while (userY != goalY || userX != goalX) { // While user is not on ending sport
      moves = moves + 1; // Adds a move to counter as user moves
      
      printBoard(board); // Print current board
    
      // Ask user to enter direction
      System.out.print("\nWhat direction would you like to move (up/down/left/right)? ");
      answer = kin.nextLine();
      
      board[userY][userX] = 'O'; // Before updating user coordinates, leave empty space for what will be left behind
      checkMove(answer); // Interpret user input
      board[userY][userX] = 'x'; // After updating user coordinates, change visible position on screen
    }
  
  // Congratulations text
    System.out.println("\nCongrats, you have won! You completed the game in " + moves + " moves.");

    if (moves == eff){
      System.out.println ("You have completed this level in the most efficient way! The robot overlords are happy with your success.");
      
    } else {
    System.out.println ("You didn't complete this level in the most efficient way. You could've done it in " + eff + " moves.");
    }
  }
 
  // Print board
  public static void printBoard(char[][] board) {
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[0].length; col++) {
        System.out.print(board[row][col] + " ");
      }
      System.out.println();
    }
  }
  
  // Use the answer to user input to interpret move
  public static void checkMove(String answer) {
    if (answer.equals("up")) { // If player wants to move up
        if (userY == 0) { // If player is on top edge
          System.out.println("Invalid Move");
        } else {
          userY = userY - 1;
        }
    } else if (answer.equals("down")) { // If player wants to move down
      if (userY == 3) { // If player is on bottom edge
        System.out.println("Invalid Move");
      } else {
        userY = userY + 1;
      }
    } else if (answer.equals("left")) { // If player wants to move left
      if (userX == 0) { // If player is on left edge
        System.out.println("Invalid Move");
      } else {
        userX = userX - 1;
      }
    } else if (answer.equals("right")) { // If player wants to move right
      if (userX == 3) { // If the player is on right edge
        System.out.println("Invalid Move");
      } else {
        userX = userX + 1;
      }
    } else { // If the player says anything but up/down/left/right
        System.out.println("Invalid Input");
    }
  }
}
