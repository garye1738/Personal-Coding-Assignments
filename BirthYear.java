/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: September 21, 2018
   PA1, BirthYear: Program's purpose is to take a year parameter and print
   each digit of the year on a seperate line, with the thousands place number
   (1 in 1998) being on the first line and the ones place number(8 in 1998) being
   on the last line.
   Bugs: Program only works with 4 digit years. Also, don't know how to put this
   into a static int method, so I used static void.
*/

public class BirthYear
{
  
  //Main method runs the program and uses layer() method call with the year 1999
  public static void main(String[] args) {
    layer(1999);
  }

  //layer() method: static void method that takes a 4 digit year parameter, and
  //uses modulus operator (remainder operator) to store last digit of the year
  //in an int variable (digit4). Then it divides the year by 10 and stores the
  //quotient back in the year variable. Process is repeated with the next three
  //digits in the year variable, and the last digits are all stored in different digit
  //variables (digit3, digit 2, digit 1). Then, digits are all printed on seperate lines.
  public static void layer(int year)
  {
    int digit1 = 0;
    int digit2 = 0;
    int digit3 = 0;
    int digit4 = 0;

    digit4 = year%10;
    year /= 10;
    digit3 = year%10;
    year /= 10;
    digit2 = year%10;
    year /= 10;
    digit1 = year%10;

    System.out.println(digit1);
    System.out.println(digit2);
    System.out.println(digit3);
    System.out.println(digit4);
  }
}
