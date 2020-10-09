import java.utl.Scanner;
/**
 * Asks for Fibonacci number and tells you its value
 * @author Liana Bazzarella 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user what Fibonacci they want to find
    System.out.println("What Fibonacci number would you like to find");
    // create a variable for user input 
    int fibNumber = input.nextInt();

    // create constant for array spots
    final int LAST_NUMB = fibNumber;
    
    // create an array
    int[] sequence = new int[LAST_NUMB];

    // put values into the array using a loop
    for(int i = 0; i < LAST_NUMB; i++){
      sequence[i]= input.nextInt();
    }


    
  }
}
