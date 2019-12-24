/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: October 26, 2018
   PA4, Problem 2: Program uses a Scanner class object to prompt the user for an 
   value and then returns the value in Roman numerals.
   Bugs: None
*/

import java.util.*;

public class Problem2
{
  /*Main method: creates and invokes an instance object of the Scanner class (named console). It uses a print
  statement to prompt the user for a value. The console then assigns the value input by the user to the int 
  variable number (using console.nextInt()). String object romanNumeral is initialized and declared as "". 

  Then a method call is used for the numeral method, using the number variable as its one int parameter (actual 
  argument). Finally, the main method uses a print statement to print out the Roman Numeral equivalent of the 
  user's number.
  */
  public static void main(String[] args)
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Please enter your value: ");
    int number= console.nextInt();

    String romanNumeral = "";

    romanNumeral += numeral(number);

    System.out.println("Your Roman numeral is: " + romanNumeral);
  }

  /*static String method numeral(): has one int parameter (int num) which is meant to take in the variable number
  from the main method. String variable roman is initialized and declared as "". 
  
  A for loop is created and is initialized to int thou is equal to num, thou is greater than or equal to 1000, 
  and the decrementation is thou = thou - 1000. Inside the loop, for each iteration, the letter "M" is 
  concatenated to what is already in the roman variable, and num is decremented by 1000. 

  This process is repeated for eleven other for loops. The loops (in order) have been initialized to 1) int 
  nineHun = num, 2) int fiveHun = num, 3) int fourHun = num, 4) int oneHun = num, 5) int ninety = num, 6) int 
  fifty = num, 7) int forty = num, 8) int ten = num, 9) int nine = num, 10) int five = num, and 11) int four = 
  num. In all of these initializations in these eleven loops, the value of num is equal to the decremented value
  of num from last iteration of the previous loop.

  The loops (in order), have the test condition of 1) nineHun is greater than or equal to 900, 2) fiveHun is 
  greater than or equal to 500, 3) fourHun is greater than or equal to 400, 4) oneHun is greater than or equal to 
  100, 5) ninety is greater than or equal to 90, 6) fifty is greater than or equal to 50, 7) forty is greater
  than or equal to 40, 8) ten is greater than or equal to 10, 9) nine is greater than or equal to 9,10) five is
  greater than or equal to 5, and 11) four is greater than or equal to 4. Numbers 1 - 11 are present so that the 
  loops can be followed in comments.

  The loops (in order) have a decremetation of 1) nineHun = nineHun - 900, 2) fiveHun = fiveHun - 500, 3) fourHun
  = fourHun - 400, 4) oneHun = oneHun - 100, 5) ninety = ninety - 90, 6) fifty = fifty - 50, 7) forty = forty - 
  40, 8) ten = ten - 10, 9) nine = nine - 9, 10) five = five - five,and 11) four = four - 4.  

  For every iteration of each of the next eleven for loops, a letter or letters are concatenated with what is
  already in roman. Those letters are: 1) "CM", 2) "C", 3) "CD", 4) "C", 5) "XC", 6) "L", 7) "XL", 8) "X", 9) 
  "IX", 10) "V", and 11) "IV".

  For every iteration of each of the next eleven for loops, num is decremeted by 1) 900, 2) 500, 3) 400, 4) 100, 
  5) 90, 6) 50, 7) 40, 8) 10, 9) 9, 10) 5, and 11) 4.

  Finally one last loop is created and initialized to int one = num (num equals num from the decremeted value of 
  num from the last iteration of previous loop), one is greater than or equal to 1, and the decrementation is one 
  = one - 1. Inside this loop, for every iteration, the letter "I" is concatenated with what is already present 
  in roman. 

  Finally, roman is returned to the method. 
  */
  public static String numeral(int num)
  {
    String roman = "";

    for(int thou = num; thou >= 1000; thou -= 1000)  
    {
      roman += "M";
      num -= 1000;
    }

    for(int nineHun = num; nineHun >= 900; nineHun -= 900)
    {
      roman += "CM";
      num -= 900;
    }

    for(int fiveHun = num; fiveHun >= 500; fiveHun -= 500)
    {
      roman += "D";
      num -= 500;
    }

    for(int fourHun = num; fourHun >= 400; fourHun -= 400)
    {
      roman += "CD";
      num -= 400;
    }

    for(int oneHun = num; oneHun >= 100; oneHun -= 100)
    {
      roman += "C";
      num -= 100;
    } 

    for(int ninety = num; ninety >= 90; ninety -= 90)
    {
      roman += "XC";
      num -= 90;
    }

    for(int fifty = num; fifty >= 50; fifty -= 50)
    {
      roman += "L";
      num -= 50;
    }

    for(int forty = num; forty >= 40; forty -= 40)
    {
      roman += "XL";
      num -= 40;
    }

    for(int ten = num; ten >= 10; ten -= 10)
    {
      roman += "X";
      num -= 10;
    }

    for(int nine = num; nine >= 9; nine -= 9)
    {
      roman += "IX";
      num -= 9;
    }

    for(int five = num; five >= 5; five -= 5)
    {
      roman += "V";
      num -= 5;
    }

    for(int four = num; four >= 4; four -= 4) 
    {
      roman += "VI";
      num -= 4;
    }

    for(int one = num; one >= 1; one--)
    {
      roman += "I";
    }
  return roman;
  }
}