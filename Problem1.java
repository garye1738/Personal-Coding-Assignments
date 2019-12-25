/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: November 9, 2018
   PA5, Problem 1: Program prompts the user for an array of integer values, and then returns true if 
   the array is unique and it doesn't have any repeating values, and false if it does have any 
   repeating values.
   Bugs: None
*/

import java.util.*;

public class Problem1 
{
  /*Main method: creates and invokes an instance object of the Scanner class (console). It uses a  
  print statement to prompt the user for the number of values they want in the array. An int array 
  named arr is initialized and created with its length being the number input by the user (which is 
  read by console).

  A for loop is created and initialized to int i equals 0, i is less than arr.length, and i++
  for incrementation. Every time the loop itirates, a print statement asks what value the user wants 
  for the i + 1th value of the array (starts at 1 and ends at arr.length). console then reads the 
  input from the user for the value and assigns it to the index of i in the array.

  A method call is used for the method isUnique with arr being the actual argument for its 
  parameter. The result of the call is assigned to the boolan variable unique. Then a println 
  statement prints out the value of unique (either true or false). 
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

    boolean unique = isUnique(arr);
    System.out.println(unique);
    //System.out.print(Arrays.toString(arr));
  }

  /*static boolean method isUnique(): has one int array parameter (int[] A). It creates a for loop
  initialized to j equals 0, j is less than A.length, and j++. Inside the first for loop there is a
  second for loop. This inner for loop is initialized to int k equals j + 1, j is less than A.length 
  and j++. For every iteration of the inner loop, an if statement has the condition that if A[j] 
  (index j of array A) is equal to A[k] (index k of array A), then return false. Basically the inner 
  for loop will compare the value at index j of array A to every subsequent value after the j index 
  (those subsequent values be controlled by k). The incrementation of j ensures that every value of 
  the array will be compared to every value after it. 

  After both the inner and out for loop have ended, true is returned by default, and it will return 
  if all the values are different.
  */
  public static boolean isUnique(int[] A)
  {
    for(int j = 0; j < A.length - 1; j++)
    {
      for(int k = j + 1; k < A.length; k++)
      {
        if(A[j] == A[k])
        {
          return false;
        }
      }
    }
  return true;
  }
}