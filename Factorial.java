/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: October 15, 2018
   PA3, Factorial: Program uses a Scanner class object to prompt the user for three integers, and returns the factorial of
   each integer.
   Bugs: Factorial 13 isn't correct, and any number input that is 13 or higher will not be correct because of overload. int is too
   small to hold so large a number
*/

import java.util.*;

public class Problem3
{
  /*Main method: initalizes and invokes an instance object of the Scanner class (called console). The method uses a print statement
    to prompt the user for a number. console then assigns the entered number to the int variable num1 (using console.nextInt()).
    A print statement is used two more times to prompt the user for two more integers, which console uses (with console.nextInt())
    to store into int variables num2 (for the second entered integer) and num3 (for the the third enetered integer). A println() statement skips a line.

    The method factorial is then called upon with num1 being the actual argument for its parameter. The result of this method call with num1
    is then assigned to the int variable fact1. factorial is called two more times: once with num2 being its parameter and the result of the
    method call being assigned to int variable fact2, and once with num3 being its parameter and the result of the call being assigned
    to int variable fact3.

    Then, the method uses a print statement that prints out the first number entered (num1) and its factorial from the factorial method (fact1). It uses a
    second print statement to print out the second number entered (num2) and its factorial from the factorial method (fact2). Finally, it uses another print statement
    to print out the third number entered (num2) and its factorial from the factorial method (fact3).
  */
  public static void main(String[] args)
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int num1 = console.nextInt();
    System.out.println("Enter the second number: ");
    int num2 = console.nextInt();
    System.out.println("Enter the third number: ");
    int num3 = console.nextInt();
    System.out.println();

    int fact1 = factorial(num1);
    int fact2 = factorial(num2);
    int fact3 = factorial(num3);

    System.out.println(num1 + "! = " + fact1);
    System.out.println(num2 + "! = " + fact2);
    System.out.println(num3 + "! = " + fact3);
  }

  /*static int method factorial(): has one int parameter (int num) representing one of the numbers input by the user (in num1, num2,
    and num3). int  fact is declared and initialized as 1. A for loop is created, and it is initilaized as int i = num, is test condition
    is that i is greater than or equal to 1, and its decrementation is i--. It will be repeated by the numerical value of num, which is passed as a parameter from
    one of the num variables (num1, num2, num3) in the main method. It will stop repeating when i is equal to 1. Everytime the loop runs, fact is mutliplied by
    the value of i, and then product is assigned back to fact. This simulates a factorial. (Example: if num were 3 (i=3), then after the first run of the loop
    fact would be 3, after the second run(i=2) it would be 6, and after the third run (i=1) it would be 6 and the loop would stop. In other words, fact will
    multiply itself descendingly by every value between the integer entered by the user and 1). When the loop has stopped, fact is returned to the method.
  */
  public static int factorial(int num)
  {
    int fact = 1;
    for(int i = num; i >= 1; i--)
    {
      fact *= i;
    }
    return fact;
  }
}
