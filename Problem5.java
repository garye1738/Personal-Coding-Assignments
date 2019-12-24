/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: October 26, 2018
   PA4, Problem 5: Program uses a Scanner class object to prompt the user for a message and an 
   encoding key (number) that will be used to give the user a message that is encoded by the 
   Casearean Cipher.
   Bugs: None. My code itself is 354 lines long, but it works. I don't know how to make it shorter.
   If there is a way to make it shorter or more condensed, please let me know in the comments for 
   the assignment.
*/

import java.util.*;

public class Problem5
{
  /*Main method: creates and invokes an instance object of the Scanner class (named console).
  Uses a print statement to prompt the user to type in a message to be used in the cipher.
  console then assigns the result of this to String object message (by using .nextLine()). 
  message is then made to be all uppercase by using message.toUpperCase; the result of this
  assigned to message. Another print statement prompts the user for an encoding key of how many 
  letters they want each letter in the string to change by. The input value is then assigned to 
  int variable key by the console (using .nextInt()). 

  A method call is used for the method caesarCipher with the parameters of message and key being 
  actual arguments. The result of this method call is assigned to String object nextMessage. A 
  print statement prints out that "Your message" is the String in nextMessage.
  */
  public static void main(String[] args)
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Please type your message: ");
    String message = console.nextLine();
    message = message.toUpperCase();
    System.out.println("Please type your encoding key: ");
    int key = console.nextInt();

    String nextMessage = caesarCipher(message, key);
    System.out.println("Your message: " + nextMessage);
  }
  /*static String caesarCipher(): has one String parameter(String mess) and one int parameter 
  (int amount) to act as formal arguments for message and key. It initializes and declares String 
  object cipher to "". It initializes and declares String object alphabet to 
  "ABCDEFGHIJKLMNOPQRSTUVWXYZ".

  A for loop is created and initialized to int i = 0, its test condition is that i is less than 
  mess.length() (length of message string), and its incrementation is i = i + 1. 

  An if statement has the condition of if mess.charAt(i) is equal to 'A', then it leads to 
  another if statement inside this if statement. 
  
  This next if statement has the condition that if 
  amount is greater than or equal to alphabet.substring(0).length() (the length of alphabet 
  starting at location 0 where A is), then concatenate alphabet.charAt(amount - alphabet.substring(0).length
  ()) to what ever is already in cipher. Basically this inner if statement says that if the 
  encoding key is greater than or equal to the length of alphabet at the location of character A, 
  then wrap around (start over) in the alphabet as if you have used numbers of the encoding key 
  on the remaining part of the alphabet string after letter A, and you are starting over at the 
  beginning of the alphabet string with the left over amount of the encoding key until you find 
  the new letter to input. 

  An else statement inside the first for if statement alphabet.charAt(0 + amount) with what 
  is already in cipher. This assumes that the encoding key is reasonable and it is less than the 
  length of alphabet.substring(0), so a new letter can be found by the encoding key without 
  having to start over in the alphabet. The first if statement thus ends. 

  An else-if statement has the condition of if mess.charAt(i) is equal to 'B', then it leads to 
  an if statement inside this else-if statement. 
  
  This next if statement has the condition that if 
  amount is greater than or equal to alphabet.substring(1).length() (the length of alphabet 
  starting at location 1 where B is), then concatenate alphabet.charAt(amount - alphabet.substring(1).length()) to what ever is already in cipher. Basically this inner if statement says that if 
  the encoding key is greater than or equal to the length of alphabet at the location of 
  character B, then wrap around (start over) in the alphabet as if you have used numbers of the 
  encoding key on the remaining part of the alphabet string after letter B, and you are starting 
  over at the beginning of the alphabet string with the left over amount/value of the encoding 
  key until you find the new letter to input. 

  An else statement inside the first if statement concatenates alphabet.charAt(1 + amount) with 
  what is already in cipher. This assumes that the encoding key is reasonable and it is less than 
  the length of alphabet.substring(1), so a new letter can be found by the encoding key without 
  having to start over in the alphabet. This else-if statement thus ends.

  An else-if statement has the condition of if mess.charAt(i) is equal to 'C', then it leads to 
  an if statement inside this else-if statement. 
  
  This next if statement has the condition that if 
  amount is greater than or equal to alphabet.substring(2).length() (the length of alphabet 
  starting at location 2 where C is), then concatenate alphabet.charAt(amount - alphabet.substring(2).length()) to what ever is already in cipher. Basically this inner if statement says that if 
  the encoding key is greater than or equal to the length of alphabet at the location of 
  character C, then wrap around (start over) in the alphabet as if you have used numbers of the 
  encoding key on the remaining part of the alphabet string after letter C, and you are starting 
  over at the beginning of the alphabet string with the left over amount/value of the encoding 
  key until you find the new letter to input. 

  An else statement inside the first if statement concatenates alphabet.charAt(2 + amount) with 
  what is already in cipher. This assumes that the encoding key is reasonable and it is less than 
  the length of alphabet.substring(2), so a new letter can be found by the encoding key without 
  having to start over in the alphabet. This else-if statement thus ends.

  These else if statements continue for the other 23 letters in the alphabet (D to Z). The main 
  thing that changes in each one is that the else-if statement block for each letter changes to 
  accomodate the next letter in the alphabet: else if (mess.charat(i) == 'D'), else-if (mess.charat(i) == 'E'), etc...  Also, the number in .substring() changes to accomdate the 
  letter's location in the alphabet ('D' would be alphabet.substring(4), 'F' would be alphabet.substring(5), etc...). The first number value in .charAt would be changed to accomdate
  the letter's location in the alphabet as well ('D' would be alphabet.charAt(4 + amount), 'F' 
  would be alphabet.charAt(5 + amount), etc...). Writing comments for all 23 other letters would 
  be too much and really kill the grader (sorry Nolan or other TA).

  A final else-if statement has the condition that if mess.charAt(i) is equal to a space (" "), then concatenate a space to what is already in cipher. cipher is the returned to the method.
  */
  public static String caesarCipher(String mess, int amount) 
  {
    String cipher = "";
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    for(int i = 0; i < mess.length(); i++) 
    {
      //int letter = mess.charAt(i); 

      if(mess.charAt(i) == 'A') 
      {
        if(amount >= alphabet.substring(0).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(0).length());
        }

        else
        {
          cipher += alphabet.charAt(0 + amount);
        } 
      }

      else if(mess.charAt(i) == 'B') 
      {
        if(amount >= alphabet.substring(1).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(1).length());
        }

        else
        {
          cipher += alphabet.charAt(1 + amount);
        } 
      }

      else if(mess.charAt(i) == 'C') 
      {
        if(amount >= alphabet.substring(2).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(2).length());
        }

        else
        {
          cipher += alphabet.charAt(2 + amount);
        }
      }

      else if(mess.charAt(i) == 'D') 
      {
        if(amount >= alphabet.substring(3).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(3).length());
        }

        else
        {
          cipher += alphabet.charAt(3 + amount);
        }
      }

      else if(mess.charAt(i) == 'E') 
      {
        if(amount >= alphabet.substring(4).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(4).length());
        }

        else
        {
          cipher += alphabet.charAt(4 + amount);
        }
      }

      else if(mess.charAt(i) == 'F') 
      {
        if(amount >= alphabet.substring(5).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(5).length());
        }

        else
        {
          cipher += alphabet.charAt(5 + amount);
        }
      }

      else if(mess.charAt(i) == 'G') 
      {
        if(amount >= alphabet.substring(6).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(6).length());
        }

        else
        {
          cipher += alphabet.charAt(6 + amount);
        }
      }

      else if(mess.charAt(i) == 'H') 
      {
        if(amount >= alphabet.substring(7).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(7).length());
        }

        else
        {
          cipher += alphabet.charAt(7 + amount);
        }
      }

      else if(mess.charAt(i) == 'I') 
      {
        if(amount >= alphabet.substring(8).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(8).length());
        }

        else
        {
          cipher += alphabet.charAt(8 + amount);
        }
      }

      else if(mess.charAt(i) == 'J') 
      {
        if(amount >= alphabet.substring(9).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(9).length());
        }

        else
        {
          cipher += alphabet.charAt(9 + amount);
        }
      }
      else if(mess.charAt(i) == 'K') 
      {
        if(amount >= alphabet.substring(10).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(10).length());
        }

        else
        {
          cipher += alphabet.charAt(10 + amount);
        }
      }

      else if(mess.charAt(i) == 'L') 
      {
        if(amount >= alphabet.substring(11).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(11).length());
        }

        else
        {
          cipher += alphabet.charAt(11 + amount);
        }
      }

      else if(mess.charAt(i) == 'M') 
      {
        if(amount >= alphabet.substring(12).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(12).length());
        }

        else
        {
          cipher += alphabet.charAt(12 + amount);
        }
      }
      
      else if(mess.charAt(i) == 'N') 
      {
        if(amount >= alphabet.substring(13).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(13).length());
        }

        else
        {
          cipher += alphabet.charAt(13 + amount);
        }
      }

      else if(mess.charAt(i) == 'O') 
      {
        if(amount >= alphabet.substring(14).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(14).length());
        }

        else
        {
          cipher += alphabet.charAt(14 + amount);
        }
      }

      else if(mess.charAt(i) == 'P') 
      {
        if(amount >= alphabet.substring(15).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(15).length());
        }

        else
        {
          cipher += alphabet.charAt(15 + amount);
        }
      }

      else if(mess.charAt(i) == 'Q') 
      {
        if(amount >= alphabet.substring(16).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(16).length());
        }

        else
        {
          cipher += alphabet.charAt(16 + amount);
        }
      }

      else if(mess.charAt(i) == 'R') 
      {
        if(amount >= alphabet.substring(17).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(17).length());
        }

        else
        {
          cipher += alphabet.charAt(17 + amount);
        }
      }

      else if(mess.charAt(i) == 'S') 
      {
        if(amount >= alphabet.substring(18).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(18).length());
        }

        else
        {
          cipher += alphabet.charAt(18 + amount);
        }
      }

      else if(mess.charAt(i) == 'T') 
      {
        if(amount >= alphabet.substring(19).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(19).length());
        }

        else
        {
          cipher += alphabet.charAt(19 + amount);
        }
      }

      else if(mess.charAt(i) == 'U') 
      {
        if(amount >= alphabet.substring(20).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(20).length());
        }

        else
        {
          cipher += alphabet.charAt(20 + amount);
        }
      }

      else if(mess.charAt(i) == 'V') 
      {
        if(amount >= alphabet.substring(21).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(21).length());
        }

        else
        {
          cipher += alphabet.charAt(21 + amount);
        }
      }
      
      else if(mess.charAt(i) == 'W') 
      {
        if(amount >= alphabet.substring(22).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(22).length());
        }

        else
        {
          cipher += alphabet.charAt(22 + amount);
        }
      }

      else if(mess.charAt(i) == 'X') 
      {
        if(amount >= alphabet.substring(23).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(23).length());
        }

        else
        {
          cipher += alphabet.charAt(23 + amount);
        }
      }

      else if(mess.charAt(i) == 'Y') 
      {
        if(amount >= alphabet.substring(24).length())
        {
          cipher += alphabet.charAt(amount - alphabet.substring(24).length());
        }

        else
        {
          cipher += alphabet.charAt(24 + amount);
        }
      }

      else if(mess.charAt(i) == 'Z') 
      {
        cipher += alphabet.charAt(amount - 1);
      }

      else if(mess.charAt(i) == ' ')
      {
        cipher += ' ';
      }
    }
    return cipher;
  }
}