/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: October 15, 2018
   PA3, Exponent: Program uses a Scanner class object to prompt the user for an exponent to be applied to two (2 to the power of
   whatever is entered), and return 2 to the power of the exponent, in addition to two to the power of every integer before the
   entered integer, starting at 0. In other words, if 3 is entered by the user, the program will return 2 to the power of 0,
   2 to the power of 1, 2 to the power of 2, and finally 2 to the power of 3.
   Bugs: None
*/

import java.util.*;

public class Problem2
{
  /*Main method: initializes and invokes an instance object of the Scanner class (called console). Uses a print statement to prompt the user
    for an expnent to be applied to 2. The user's input is then assigned to the int variable exponent by console (using console.nextInt()).
    A println() statement skips a line. int variable product, which will represent the result of an exponent being assigned to 2, is initialzied
    and declared as 0.

    A for loop is created, with initialization being int j = 0, the test condition being j is less than or equal to the entered exponent,
    and incremeation being j++. This for loop will last from 0, to the exponent entered by the user (so 2^0 to 2^exponent). It will print out
    2 to the power of every number between 0 and the exponent, including both 0 and the exponent. Inside the loop, the method static int method
    multiplier is called upon with j as its parameter (actual argument), and the result is assigned to product. Then a print statement prints
    out the result of 2 to the power of j (which is product), for every integer between 0 and the entered exponent by the user, inclusive.
  */
  public static void main(String[] args)
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Please enter an exponent that you want to be applied to 2\n(so 2 to the power of your exponent): ");
    int exponent = console.nextInt();
    System.out.println();

    int product = 0;

    for(int j = 0; j <= exponent; j++)
    {
      product = multiplier(j);
      System.out.println("The result of 2 to the power of " + j + " is " + product);
    }
  }

  /*static int method multiplier(): has one int parameter (int exp), which represents an exponent between 0 and an exponent entered by the user
    in the main method (see int exponent above). int pro is initialized and declared as 1. A for loop is created, with initialization being
    int i = 1, the test condition being that i is less than or equal to exp, and the incrementation is i++. The loop wil repeat until i is equal to exp.
    Inside the loop, whenever it is run/cycled, the pro variable is multiplied by 2 and the product is stored back into pro, acting like an exponential
    equation. When the loop is completed, pro is returned to the method.
  */
  public static int multiplier(int exp)
  {
    int pro = 1;

    for(int i = 1; i <= exp; i++)
    {
      pro *= 2;
    }
    return pro;
  }
}
