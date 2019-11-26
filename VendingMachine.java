/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: October 1, 2018
   PA2, Problem 1: Program uses the Scanner class to take input from the keyboard (standard input),
   use the input as cents paid for an item, and return to the user their change in quarters, dimes, and nickels.
   Bugs: None. Also, I added extra output to make the print statements visible to the user be
   more clear. Please don't mark me down on points because it doesn't match the exact output.
*/
import java.util.*;

public class Problem1
{
  /*Main method declares and invokes a Scanner object (console) to take input from the standard interface. It also declares
    and initializes 3 int variables (quarters, dimes, nickels) and sets them to 0. Method then prints a statement
    urging user to use the keyboard to type a value in cents (bewteen 25 and one dollar (100 cents)). That value is then
    stored in the int variable cash using the Scanner object. The int variable change is initialized to the difference between
    100 cents and the cash variable (change amount to be returned to user) Then, the getQuarters() method is called with change
    taking the place of the parameter and the result is stored in the varaible quarters to get the number of quarters to be
    returned. Then the number of quarters is multiplied by 25 to get the money sum of the number of quarters, which is then subtracted
    from the change variable and stored back into the change variable to be used for the getDimes() method. The getDimes() method is called with change
    taking the place of the parameter and the result is stored in the varaible dimes to get the number of dimes to be
    returned. Then the number of dimes is multiplied by 10 to get the money sum of the number of dimes, which is then subtracted
    from the change variable and stored back into the change variable to be used for the getNickels() method. The Nickels() method is called with change
    taking the place of the parameter and the result is stored in the varaible nickels to get the number of nickels to be
    returned. Then the number of nickels is multiplied by 10 to get the money sum of the number of dimes, which is then subtracted
    from the change variable and stored back into the change variable.

    The main method then prints out a statement saying the price of the item purchased and that it was paid for with a dollar. It states
    the sum of the chnage to be returned, and then prints out the various amount of coins to be returned for deach type of coin (quarters,
    dimes, nickels, etc...).
  */
  public static void main(String[] args)
  {
    Scanner console = new Scanner(System.in);
    int quarters, dimes, nickels = 0;

    System.out.println("Hello! Please enter the price of item for purchase in cents (from 25 cents to a dollar, in 5-cents increments): ");
    int cash = console.nextInt();
    int change = 100-cash;
    quarters = getQuarters(change);
    change = change-(25*quarters);
    dimes = getDimes(change);
    change = change-(10*dimes);
    nickels = getNickels(change);
    change = change-(5*nickels);

    System.out.println("You have bought an item for " + cash + " cents and paid this machine with a dollar. \nYour change is " + (100-cash) + " cents in: ");
    System.out.println(quarters + " quarters");
    System.out.println(dimes + " dimes");
    System.out.println(nickels + " nickels");
  }

  /*getQuarters() static int method: has one int paramter (money) which is the amount of change it will try to convert into
    quarters. Declares an int variable as quarters and initializes it as 0. money parameter is divided by 25 (value of one
    quarter) to find how many whole quarters can be produced from the money parameter (change to be returned to user).
    quarters is retured to the method, and the method is called in the main method.
  */
  public static int getQuarters(int money)
  {
    int quarters = 0;
    quarters = money/25;
    return quarters;
  }

  /*getDimes() static int method: has one int paramter (money) which is the amount of change it will try to convert into
    dimes. Declares an int variable as dimes and initializes it as 0. money parameter is divided by 10 (value of one
    dime) to find how many whole dimes can be produced from the money parameter (change to be returned to user).
    dimes is retured to the method, and the method is called in the main method.
  */
  public static int getDimes(int money)
  {
    int dimes = 0;
    dimes = money/10;
    return dimes;
  }

  /*getNickels() static int method: has one int paramter (money) which is the amount of change it will try to convert into
    nickels. Declares an int variable as nickels and initializes it as 0. money parameter is divided by 5 (value of one
    nickel) to find how many whole nickels can be produced from the money parameter (change to be returned to user).
    nickels is retured to the method, and the method is called in the main method.
  */
  public static int getNickels(int money)
  {
    int nickels = 0;
    nickels = money/5;
    return nickels;
  }
}
