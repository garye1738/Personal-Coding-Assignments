/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: October 26, 2018
   PA4, QuadrantFinder: Program uses a Scanner class object to prompt the user for two 
   double values on a grid. It will return to the user the quandrant the value pair 
   is located in, the line it lies on, or if it lies at the origin.
   Bugs: None
*/

import java.util.*;

public class QuadrantFinder
{
  /*Main method: creates an invokes and instance object of the Scanner class (named
  console). It prints a statement that asks the user to enter a decimal for the x 
  variable. console then assigns the input from the user to double variable x using 
  console.nextDouble(). It prints another statement asking the user to enter a decimal 
  value for the y variable. console then assigns the input from the user to double 
  variable y using console.nextDouble().

  A method call is used for the method quandrant which uses x and y as actual arguments
  in its parameters. The result of this is assigned to the String object quad.

  Finally, a print statement prints out qud, whch is the location of the ordered (x, y) 
  pair on a graph.
  */
  public static void main(String[] args)
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Please enter a decimal value for your x variable: ");
    double x = console.nextDouble();
    System.out.println("Plese enter a decimal value for your y variable: ");
    double y = console.nextDouble();
    System.out.println();

    String quad = quadrant(x, y);

    System.out.println(quad);
  }

  /*static String method quadrant(): has two double parameters (double x and double y) 
  to be used as formal arguments for x and y respecitvely in the main method. It initializes and declares String place as "(" + x + ", " + y + ") ".

  An if statement has the condition that if x is greater than 0.0 and y is greater than 
  0.0, then concatenate "is in quadrant 1" to what is in place.

  An else-if staement has the condition that if x is less than 0.0 and y is greater than 
  0.0, then concatenate "is in qaudrant 2" to what is in place.

  An else-if statement has the condition that if x is less than 0.0 and y is less than 
  0.0, then concatenate "is in quadrant 3" to what is in place. 

  An else-if statement has the condition that if x is greater than 0.0 and y is less 
  than 0.0, then concatenate "is in quadrant 4" to what is in place. 

  An else-if statement has the condition that if x is equal to 0.0 and y is equal to 0.0,
  then concatenate "is at the origin" to what is in place. 

  An else-if statement has the condition that if x is equal to 0.0, then concatenate "is
  on the y axis" to what is in place. 

  A final else-if statement has the condition that if y is equal to 0.0, then concatenate "is on the x axis" to what is in place.

  place is then returned to the method. 
  */
  public static String quadrant(double x, double y) 
  {
    String place = "(" + x + ", " + y + ") ";

    if(x > 0.0 && y > 0.0)
    {
      place += "is in quadrant 1";
    }

    else if(x < 0.0 && y > 0.0)
    {
      place += "is in quadrant 2";
    }

    else if(x < 0.0 && y < 0.0)
    {
      place += "is in quadrant 3";
    }

    else if(x > 0.0 && y < 0.0)
    {
      place += "is in quadrant 4";
    }

    else if(x == 0.0 && y == 0.0)
    {
      place += "is at the origin";
    }

    else if(x == 0.0)
    {
      place += "is on the y axis";
    }

    else if(y == 0.0)
    {
      place += "is on the x axis";
    }
    return place;
  }
}
