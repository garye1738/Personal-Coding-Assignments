/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: October 26, 2018
   PA4, DivideAndMult: Program uses a Scanner class object to prompt the user for an 
   value, then it will divide the value by two if it is odd or multiply it by 3 and 
   add one to it and print back the new value. This process is repeated until the 
   value is 1. 
   Bugs: None
*/

import java.util.*;

public class DivideAndMult
{
  /*Main method: creates and invokes an instance object of the Scanner class (named 
  console). It uses a print statement to prompt the user the enter an initial value. 
  console then assigns the number input by the user to the int variable number (using 
  .nextInt()). int variable number is declared and initialized to 0. 
  
  An if statement has the condition that if number is less than 1, the method will 
  print out "Error" and the program will not do anything else. The if statement is 
  followed by an else statement (so that if the number input by the user is greater 
  than or equal to one) that will print out the initial value in the variable number. 

  In the else statement, a for loop is created; it is initialized to in i = 0, its test 
  condition is that i < 10000 (9999 is the biggest number that can be used), and its 
  incrementation is i++. Inside the loop, the processor method is called with number
  taking the place of its parameter as an actual argument; the result of 
  this method call is assigned back into number. Whenever the loop runs, the counter
  variable is incremented by 1 (to record the number of operations performed). 

  An if statement states that if number is equal to one, then 10000 is assigned to i so
  that the loop will stop. An else statement (if number is greater than 1) then prints out the value of number in 
  that iteration of the loop.

  The loop then ends when i is equal to 10000 and number equals one. A print statement 
  prints out the final value (1), and the number of operations performed (recorded and 
  stored by counter). The else statement ends, and the main method ends as well.
  */
  public static void main(String[] args)
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Please enter initial value: ");
    int number = console.nextInt();
  
    int counter = 0;

    if(number < 1)
    {
      System.out.println("Error");
    }
    else
    {
      System.out.println("Initial value is: " + number);

      for(int i = 0; i < 10000; i++)
      {
        number = processor(number);
        counter++;

        if(number == 1)
        {
          i = 10000;
        }
        else 
        {
          System.out.println("Next value is: " + number); 
        }
      }
      System.out.println("Final value is " + number + ", number of operations performed " + counter);
    }
  }

  /*static int method processor(): has a single int parameter (num) as a formal argument (meant to take variable 
  number in the main method. An if statement says that if num modulus 2 equals 0 (number is even), divide num by 
  2 and assign it back to num. 

  Then, an if-else statement states that if num modulus 2 equals 1 (number is odd), multiply num by 3 first (via 
  parantheses), and add 1 to that product. The resulting sum is assigned back to num.

  num is then returned to the method and it can be used when the method is called in the main method.
  */
  public static int processor(int num)
  {
    if(num%2 == 0)
    {
      num /= 2;
    }

    else if(num%2 == 1)
    {
      num = (num*3) + 1;
    }
    return num;
  }
}
