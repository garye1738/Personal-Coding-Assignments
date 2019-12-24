/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: October 15, 2018
   PA3, FibonnaciFinder: Program uses a Scanner class object to prompt the user for the nth term of the Fibonacci sequence,
   and it will return everyterm in the sequence up the entered term.
   Bugs: The 48th term and many terms after in the sequence are negative (due to overloading or overflow?).
*/
import java.util.*;

public class FibonnaciFinder
{
  /*Main method: initializes and invokes an instance object of the Scanner class (called console). The method uses a print statement to prompt the user
    for the nth term of the Fibonacci sequence that they want to find up to (every term of the sequence up to the entered position). cosnole then assigns
    the entered number into the int variable nthTerm (using console.nextInt()). A println() statement skips a line. The method then calls on the static String method fibonacci with nthTerm
    taking the place of its one int parameter (its the actual argument). The result of the fibonacci method call is then assigned to the
    String variable nthSequence. Then, the method uses a print statement to print out nthSequence, which is every number of the Fibonacci sequence up to
    and including the nth term entered by the user.
  */
  public static void main(String[] args)
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Please enter the nth term of the Fibonnaci sequence that you want to find: ");
    int nthTerm = console.nextInt();
    System.out.println();
    String nthSequence = fibonacci(nthTerm);
    System.out.println("The sequence is: " + nthSequence);
  }
  /*static String method fibonacci(): has one int parameter (int n) which is the formal argument for the integer that the user entered in the main
    method and which was stored in nthTerm. It is the nth term of the Fibonacci sequence that the program is trying to find up to. The variable
    int a is initialized and declared as 0. Then variable b is initialized and declared as 1. Variable int temp is then initialized but not declared with
    an actual value. String fib is initialized and declared as "". Then int a is concatenated with a space which is concatenated with int b which is concatenated
    with another space; then it is added/concatenated to the end of whatever is currently in the fib variable which is nothing, and the new data of numbers and
    spaces is assigned back into fib.

    A for loop is created and initialized as int i = 0, the test condition is i is less than n - 2, and the incrementation is i++. The test condition is
    n - 2 so that it will be repeated 2 times less than the numerical value of the nth term input by the user in nthTerm. This is because the loop will be
    concatenating and adding more numbers in the sequence to fib, but the initial values of a and b (0 and 1) have already been added to the String outside
    of the loop. It is unecessary to add them again in the loop. (Example: so if the user entered 10 in the main method, the loop would repeat 8 times).
    Inside the loop, whenever it runs, the value of b is being assigned to temp (it is a temporary placeholder for b). Then the value of a and b are added
    together and assigned to b; so the value of b has changed to the value of a + b. Then, the value of temp is assigned to a; so the new value of a was the
    previous value of b. Then, the value of b is concatenated with a space, which is concatenated on to the end of whatever is currently in the value of
    fib (number, space, number, space number, space, etc...), and the new data of number and spaces is assigned back into fib. When the loop ends, fib is returned
    to the method.
  */
  public static String fibonacci(int n)
  {
    int a = 0;
    int b = 1;
    int temp;
    String fib = "";
    fib += a + " " + b + " ";

    for(int i = 0; i < n - 2; i++)
    {
      temp = b;
      b = a + b;
      a = temp;
      fib += b + " ";
    }
    return fib;
  }
}
