/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: November 9, 2018
   PA5, Problem 3: Program prompts the user for an 
   value, then it will divide the value by two if it is odd or multiply it by 3 and 
   add one to it and print back the new value. This process is repeated until the 
   value is 1. 
   Bugs: None
*/

import java.util.*;

public class Problem3 
{
  /*Main method: creates and invokes an instance object of the Scanner class (console). A print 
  statement prompts the user for the number of bid values they want in the array. An int array 
  named bids is initialized and created with its length being the number input by the user (which is 
  read by console).

  A for loop is created and initialized to int i equals 0, i is less than bids.length, and i = i + 1 
  for incrementation. Every time the loop itirates, a print statement asks what bid value the user wants 
  for the i + 1th value of the array (starts at 1 and ends at bid.length). console then reads the 
  input from the user for the value and assigns it to the index of i in the array.

  A print statement then prompts the user for the correct price. console reads this input and assigns it to 
  int variable correctPrice. A method call is used for the method priceIsRight with bids and correctPrice 
  taking the place of int[] array parameter and int parameter. The result of thisclass is then assigned to the 
  int variable closestBid. 

  An if statement has the test condition that if closestBid equals -1 (meaning that all the values in the 
  array bids are over the value of correctPrice), then a print statement will say that all the values are 
  larger than the correct price and print out closestBid (which would be -1). Then an else statement will 
  print out the closest bid (in closestBid) to the correct price (in correctPrice) is closestBid is not 
  equal to -1. 
  */
  public static void main(String[] args)
  {
    Scanner console = new Scanner(System.in);
    System.out.println("How many integer bid values would you like to enter into your array: ");
    int[] bids = new int[console.nextInt()];

    for(int i = 0; i < bids.length; i++)
    {
      System.out.println("What would you like to input for integer bid value number " + (i + 1) + ": ");
      bids[i] = console.nextInt();
    }

    System.out.println("Enter the correct price as an integer: ");
    int correctPrice = console.nextInt();
    int closestBid = priceIsRight(bids, correctPrice);

    if(closestBid == -1)
    {
      System.out.println("All of the bids are larger than the correct price. You got " + closestBid);
    }

    else 
    {
      System.out.println("The closest bid to the correct price of " + correctPrice + " is " + closestBid);
    }
  }

  /*static int method priceIsRight(): has two parameters; one int array parameter (int[] A) and one int 
  parameter (int correct). It initializes and declares int variables diff, temo, index and count to 0.

  A for loop is created and initialized to int j is equal to 0, j is less than A.length, and j++ for 
  incrementation. Inside the loop, an if statement has the test condition that if A[j] is less than or 
  equal to correct, then the difference of the value of correct minus the value of index j of array A is 
  assigned to diff. j is assigned to index. j is set to A.length to stop the loop. This loop's purpose is 
  to find the first instance in the array where a value is less than the value of correct. This way, diff 
  will have a baseline value with which to compare other differences in order to find the closest bid to 
  the correct price (correct). index allows us to later retrieve the value with the smallest difference 
  from correct (the difference of which is stored in diff).

  A second for loop is created and initialized to int i = 0, i is less than A.length, and i++ for 
  incrementation. An if statement inside the loop has the test condition that if A[i] is greater than 
  correct, then count is incremented by 1 (to count the number of times a bid is over the value of correct).

  Then an else if statement has the test condition of else if A[i] (index i of array A) is less than or 
  equal to correct, then the difference of correct minus A[i] is assigned to temp. An if statement (inside 
  of the else if statement) has the test condition that if diff is greater than or equal to temp, then the 
  value of temp is assigned to diff, and i is assigned at index. This if statement will compare two values 
  (the difference between the bid and correct price in diff and the difference between the bid and correct 
  price stored in temp) and assign/keep the smaller one in diff as it would be closer to the correct price 
  (in correct). index allows us to retrieve the value of the number that is closest to correct. The else if
  statement ends, and so does the for loop.

  An if statement has the test condition that if count is equal to A.length (indicating that all the values 
  in the array are larger than the correct price in correct),then return -1 to the method. A[index] (the 
  index "index" location of array A) is returned the method in any other case.
  */
  public static int priceIsRight(int[] A, int correct)
  {
    int diff = 0; 
    int temp = 0;
    int index = 0;
    int count = 0;

    for(int j = 0; j < A.length; j++)
    {
      if(A[j] <= correct)
      {
        diff = correct - A[j];
        index = j;
        j = A.length;
      }
    }

    for(int i = 0; i < A.length; i++)
    {
      if(A[i] > correct)
      {
        count++;
      }

      else if(A[i] <= correct)
      {
        temp = correct - A[i];

        if(diff >= temp)
        {
          diff = temp;
          index = i;
        }
      }
    }

    if(count == A.length)
    {
      return -1;
    }
    return A[index];
  }
}