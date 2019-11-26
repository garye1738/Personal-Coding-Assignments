/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: October 15, 2018
   PA3, GridMaker: Program uses a Scanner class object to prompt the user for a number of rows and a number of columns. Then it will print out
   in the rows and columns (the number of each was decided by the user) numbers starting from 1 and ending at the product of rows times columns
   (so if 4 and 6 are entered, the last number in the last column would be 24, which is made from 4*6).
   Bugs: None
*/

import java.util.*;

public class Problem5
{
  /*Main method: initialzies and invokes an instance object of the Scanner class (called console). The method uses a print statement
    to prompt the user for the number of rows they want the program to use. The integer they enter is then assigned to the int variable rows
    (with console.nextInt()). The method then uses another print statement to prompt the user for the number of columns they want the program to use.
    This next integer that they enter is assigned to the int variable columns (with consol.nextInt()). A println() statement skips a line. The main method
    then uses a method call for the void method numberMaker() and uses rows and columns as the actual arguments for its two int parameters.
  */
  public static void main(String[] args)
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Please enter the number of rows that you want: ");
    int rows = console.nextInt();
    System.out.println("Please enter the number of columns that you want: ");
    int columns = console.nextInt();
    System.out.println();
    numberMaker(rows, columns);
  }

  /*static void method numberMaker(): has two int variables as parameters (int r and int c) which are formal arguments for the variables rows and columns
    respectively in the main method. The String variable sequence is initialized and declared as "". Then a for loop is created, initialized as int i = 1,
    i is less than or equal to r (number of rows), and the incrementation is i++). This loop represents the number of rows in the intended block to be printed,
    and each run of this outer loop will be equivalent to one printed horizontal row. It will be repeated until i equals the number of rows that the user entered in the
    main method, which is passed into this void method method through the int r parameter. The int variable number is initialized and declared as i. This value will change
    to i whenever the outer loop (with i) repeats  again.

    A second loop is created, initialized as int j = 1, j is less than or equal to c (number of columns), and the
    incrementation is j++). This loop represents the number of columns in the intended block to be printed, and each run of this inner loop will be quivalent to one
    printed number in a row, also the addition of another column to the block. It will be repeated until j equals the number of columns that the user entered in the
    main method, which is passed into this void method through the int c parameter. Inside this loop, a printf() statement is used to print out the variable number,
    and make it left aligned (with -) and be 5 characters wide (with 5). The d in "%-5d" (print format) is sed as number is an integer. Then, number is then incremented
    by the value of r (number of rows) so that the next value printed will be one more than the final (bottommost value) in the previous column. (Sorry, I don't know
    how to explain this part very well). It will make the next value printed be the previous value plus the value of row. This works as the values in the block increase
    down a column, and continue to increase in the next column (with the beginning of the next column being 1 more than the last value in the previous column, and "row"
    value more the value adjacent to it in the previous column).Once this loop stops, a println statement is used to allow printf to be used on the next line.
    The first for loop then repeats (number is set to the new, incremenetd value of i), and the whole process above continues until i is equal to r and the method ends.
  */
  public static void numberMaker(int r, int c)
  {
    String sequence = "";

    for(int i = 1; i <= r; i++)
    {
      int number = i;
      for(int j = 1; j <= c; j++)
      {
        System.out.printf("%-5d", number);
        number += r;
      }
      System.out.println();
    }
  }
}
