/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: October 1, 2018
   PA2, Averager: Program uses a Scanner class object to prompt the user for three integers, which it will find the
   average of and return to the user as a double.
   Bugs: None. Don't know if I should use print format (printf) to cut off extra decimal places after average
   is found.
*/
import java.util.*;

public class Problem3
{
  /*Main method: initializes and invokes a Scanner class object (console). Then, the method prompts the user
  with a print statement to input the first integer of three integers to find the average of. The Scanner
  object (console) then stores the user input in the int variable first when the user types it. The method prints another statement asking the user
  for the second integer, which console then stores in the int variable second when the user types it. The method prints out
  another statement asking the user to input the third integer, which console stores in the int variable third when the user
  types it.

  The main method then uses a method call for the method getAverage(), and uses the mentioned int variables (first, second, and
  third) to take the place of the three double parameters for the method (one, two and three). The parameters are doubles so that
  when the average is being calculated, it will have the fractional part of the decimal in it. The result of getAverage is then
  stored in the double variable average. Then, the main method prints out a statement with the values entered by the user,
  and finally the average of those values.
  */
  public static void main(String[] args)
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Hello. I will find the average of three integers of your choice. Please type the first integer: ");
    int first = console.nextInt();
    System.out.println("Please type the second integer: ");
    int second = console.nextInt();
    System.out.println("Great. Type the third and final integer: ");
    int third = console.nextInt();

    double average = getAverage(first, second, third);
    System.out.println("The average of your integer values of " + first + ", " + second + ", and " + third + " is " + average);
  }

  /*static double method getAverage(): has three double paramters (one, two, three) which are the first, second, and third
    integer value that the user entered to find the average of. The paramters are doubles so that when the actual arguments are
    used in the method call, they will be doubles and the result from arithmetic operations will have the fractional decimal for
    accuracy. The variables one, two, and three are added together and assigned to the double variable average while it is declared.
    Then, average is divided by 3 and the quotient, the average of the three numbers, is assigned back into average.
    Then, average is returned to the method getAverage() and used in the main method when it uses a method call.
  */
  public static double getAverage(double one, double two, double three)
  {
    double average = one + two + three;
    average = average/3;
    return average;
  }
}
