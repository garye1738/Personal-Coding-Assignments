/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: October 15, 2018
   PA3, Problem 1: Program uses a Scanner class object to prompt the user for how many times a player was at bat,
   and how many times the player earned a hit. The program then gives the user the player's batting average with 4
   decimal points.
   Bugs: None
*/

import java.util.*;

public class Problem1
{
  /*Main method: initializes and invokes an instance object of the Scanner class (called console). It uses a print statement to prompt
    the user for the amount of times the player was at bat. This is assigned to the int variable atBat using the console object
    (console.nextInt()). The method then prompts the user for how many hits the player made. This value is assigned to the
    int variable hits using the console object. The main method then calls the method getAverage() with atBat and hits being
    the actual arguments (parameters). The result of the method call, the player's batting average, is then assigned to the
    initialized double variable average. A println() statement skips a line. The method then uses a printf() statement to give
    the user the batting average, and uses %.4f in the printf to return the batting average up to 4 decimal
    points (f because it's a real number).
  */
  public static void main(String[] args)
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Please enter how many times the player was at the bat: ");
    int atBat = console.nextInt();
    System.out.println("Please enter how many hits the player earned: ");
    int hits = console.nextInt();
    double average = getAverage(atBat, hits);
    System.out.println();
    System.out.printf("The player's batting average was %.4f", average);
  }

  /*staic double method getAverage(): has two double parameters, timesUp and hitsMade, to be the formal arguments and take the
    actual arguments of atBat and hits respectively. hitsMade is then divided by timeUp, and the quotient is assigned to the
    double variable average. average is then returned to the method.
  */
  public static double getAverage(double timesUp, double hitsMade)
  {
    double average = hitsMade/timesUp;
    return average;
  }
}
