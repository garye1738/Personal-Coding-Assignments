/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: October 1, 2018
   PA2, DistanceConvert: Program uses the Scanner class to prompt the user for a distance in miles, which it then converts to
   kilometers and returned as kilometers with the fractional part to two decimal points (hundreths place).
   Bugs: None.
*/
import java.util.*;

public class Problem2
{
  /*Main method declares and invokes a Scanner object (console) to take input from the standard interface. Uses a
    println statement to prompt the user to enter a length in miles as a decimal. The length input is then assigned/stored to
    double variable miles by console (Scanner object).

    The method getKM() is called with the variable miles taking
    the place of its parameter. The result of this method call (see below) is stored into the double variable kiloMeters.
    the method uses a printf (print format) statement to display the number of miles the user input for conversion.
    Then in the same printf() statement, %.2f (printf precision) is called to display the variable kiloMeters precisely up to two points
    after the decimal. Then another println statement is used to print out "kilometers."
  */
  public static void main(String[] args)
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Please enter a length in miles as a decimal: ");
    double miles = console.nextDouble();

    double kiloMeters = getKM(miles);
    System.out.printf(miles + " miles is %.2f ", kiloMeters);
    System.out.println("kilometers.");
  }

  /*static double method getKM(): has one double parameter (length), which is going to be the miles the
    user input when prompted. The double variable kilometers is declared and initialized as 1.60934.
    kilometers is multiplied by length (which would be miles), and the product is stored back into kilometers.
    kilometers is then returned and used when the method is called in the main method.
  */
  public static double getKM(double length)
  {
    double kilometers = 1.60934;
    kilometers = kilometers * length;
    return kilometers;
  }
}
