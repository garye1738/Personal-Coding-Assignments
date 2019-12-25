/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: November 9, 2018
   PA5, Problem 2: Program prompts the user for an array of integer values of bids as well as a 
   correct price. The program will return which value in the array is closest to the correct price 
   without going over it. 
   Bugs: None
*/

import java.util.*;

public class Problem2 
{
  /*Main method: creates and invokes an instance object of the Scanner class (console). A print 
  statement prompts the user for the number of values they want in the array. An int array 
  named arr is initialized and created with its length being the number input by the user (which is 
  read by console).

  A for loop is created and initialized to int i equals 0, i is less than arr.length, and i = i + 1 
  for incrementation. Every time the loop itirates, a print statement asks what value the user wants 
  for the i + 1th value of the array (starts at 1 and ends at arr.length). console then reads the 
  input from the user for the value and assigns it to the index of i in the array.

  A method call is used for the method longestSortedSequence with arr being the actual argument for 
  its parameter. The result of the method call is assigned to the int variable sort. 

  An if statement has the condition that if sort is equal to 0, then the method will print out 
  that the array only has 0s in it and the lonegest sequence length is 0. Then an else statement (if 
  sort is not equal to zero) will print out the length of the longest sorted sequence of the array 
  (stored in sort).
  */
  public static void main(String[] args)
  {
    Scanner console = new Scanner(System.in);
    System.out.println("How many integer values would you like to enter into your array: ");
    int[] arr = new int[console.nextInt()];

    for(int i = 0; i < arr.length; i++)
    {
      System.out.println("What would you like to input for integer value number " + (i + 1) + " of your array: ");
      arr[i] = console.nextInt();
    }

    int sort = longestSortedSequence(arr);

    if(sort == 0)
    {
      System.out.println("Your array only had zeros in it. So, the sort length is " + sort);
    }

    else 
    {
      System.out.print("The length of the longest sorted sequence in your array was " + sort);
    }  
  }

  /*static int method longestSortedSequence(): has one int array paramater (int[] A). int variable 
  len is initialized and declared as 1, int variable temp is initialized and declared as 1, and int variable zero is initialized and declared as 0.

  A for loop is created and initialized to int j = 0, j is less than A.length, and j++ for 
  incrementation. An if statement inside this for loop has the test condition that if A[j] == 0 (if 
  the value at index j of A is equal to 0), then increment zero by. This loop goes through every value of the loop to see how many zeros there are and later use zero to see if the array is empty.

  A second for loop is created and initialized to int i equals 0, i is less than A.length - 1, and i++ for 
  incrementation. An if statement inside the for loop has the test condition that if A[i] <= A[i + 1]
  (if the value at index i of A is less than or equal to the value at index i + 1 of A), then 
  increment temp by 1. This test, if met, indicates that numbers are in sorted order (non-decreasing). 

  An else if statement has the condition that if A[i] > A[i + 1] (if the value at index i of A is 
  greater than the value at index i + 1 of A), then it will lead inside itself to an if statement. 
  This next if statement has the test condition that if temp is greater than len, then the value of 
  temp will be assigned to len, and 1 will be assigned to temp. Then an else if statement after this
  inner if statement has the test condition that if temp is less than or equal to len, then 1 will 
  be assigned to temp. Basically, the first else if statement states that if one number in the array 
  is greater than the number after it, then if the value of temp is greater than the value of len 
  (meaning that temp has the length of the longest sequence), the value of temp will replace the 
  last longest sequence length stored in len and temp will be set to 1. However, if the value of 
  temp is less than or equal to len (len is still the length of the greatest sorted sequence and 
  temp is less than or equal to that length), then temp will be set to 1 so it can start counting 
  sorted sequences again. The first else if statement ends, and so does the for loop.

  A if statement has the test condition that if temp (the last value of temp after the loop has ended)
  is greater than len, then temp is assigned to len). This statement is outside the loop because the 
  loop will end before it does a check on temp and len one last time as the if and else if statements 
  inside the second loop aren't met if all numbers in the sequence are sorted. A second if statement has 
  the test condition that if zero equals A.length (meaning that all characters in array A are zeros), then 
  0 is assigned to len to indicate an empty array. len is returned to the method.
  */
  public static int longestSortedSequence(int[] A)
  {
    int len = 1;
    int temp = 1;
    int zero = 0;

    for(int j = 0; j < A.length; j++)
    {
      if(A[j] == 0)
      {
        zero++;
      }
    }

    for(int i = 0; i < A.length - 1; i++)
    { 
      if(A[i] <= A[i + 1])
      {
        temp++;
      }

      else if(A[i] > A[i + 1])
      {
        if(temp > len)
        {
          len = temp;
          temp = 1;
        }
        
        else if(temp <= len)
        {
          temp = 1;
        }
      }
    }
    if(temp > len)
    {
      len = temp;
    }

    if(zero == A.length)
    {
      len = 0;
    }
    return len;
  }
}