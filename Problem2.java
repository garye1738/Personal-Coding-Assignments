/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: November 19, 2018
   PA6, Problem 2: Program prompts the user to play a guessing game. The
   program will guess from a range of numbers (the highest one being
   determined the the final int VAR right under the class). The program will
   guess numbers, have the uder tell them if their number is higher or lower,
   and adjust is guessing range until it finds the correct number. The user
   can choose how many game to play. After the user decides to stop playing,
   the program will return results of the game.
   Bugs: None
*/

import java.util.*;

public class Problem2 {
  /*static final int VAR: shows the max range of the integer values that the computer
  will try to guess up to. Can be edited by grader :)
  */
  public static final int VAR = 100;

 /*main method(): creates and constructs an int[] array named numbers to have the length
  of the value of VAR (above). int guess (computer's number guess) is declared and
  initialzied to to 0. int guesses (number of guesses per game) is declared and
  initialized to 0. double aveGuesses (the average amount of guesses for all games the
  user has played) is declared and initialzied to 0.0. int totGuesses (the total amount of
  guesses the computer made for all games played) is declared and initialized to 0.

  int games (number of games played) is declared and initialzied to 0. int maxGuesses (the
  greatest amount of guesses that the computer made in any game) is declared and initialzied
  to 0. String procede is declared and initialzied to yes. It will allow the game to be
  played and stop if it is changed to anything but "yes". String answer is declared and
  initialized to "". It will take the users answer when the computer shows them a guess and
  asks if the number they are thinking of is higher, lower, or the same as their guess.

  A for loop is initialized to i = 0, i is less than VAR, and i++ for incrementation. For
  every iteration of the loop, 1 is added to the value of i, and this sum is assigned to
  numbers at index i.

  int min is declared and initialized as number[0] (or 1). int max is declared and initialized
  as numbers[numbers.length - 1] (or the value of VAR).

  A Scanner object (console) is created and constructed. Print statements tell the user that
  they are playing a guessing game, how the game works, and to tell the computer whether the
  user's number is higher, lower or the same as (correct) the computer's guess.

  A while loop has the condition that while procede.substring(0, 1) is equal to "y", then ""
  will be assigned to answer. Also, 0 is assigned to int guess, and 0 is assigned to int
  guesses. numbers[0] is assigned to min, and numbers[numbers.length-1] is assigned to max.
  A print statement prompts the user to think of a number.

  Another while loop inside the previous while loop has the condtion of while answer does not
  equal correct, the numberGuess() method is called with numbers, min, max, answer, and guess
  as its parameters. The result of this method call is then assigned to guess. guesses is
  incremented by 1. A println() statement then prints out what the computer's guess is (in the
  guess variable). The console then assigns the next thing input by the user to the variable
  answer.

  An if statement states that if answer equals lower, then guess - 1 is assigned to max (decreasing
  the highest number the computer can guess up to). An else if statement states that if answer
  equals higher, then guess + 1 is assigned to min (to increase the lowest number that the computer
  can guess down to). This while loop ends. Every time this inner while loop iterates, it will
  narrow down the range of numbers that the can be guessing from.

  Still inside the first while loop, guesses is added to whatever is already in totGuesses to
  increase the total number of guesses the program has made. games is also incremented by 1.

  An if statement states that if guesses is greater than or equal to maxGuesses, then guesses
  is assigned to maxGuesses to store the greatest amount of guesses made bfore a number was
  correct.

  A print statement says how many guesses it took for the program to get the answer correct
  (stored in guesses). Another print statement prompts the user if they want to play again.
  console then assigns the input by the user to the String procede. Then this while loop ends.
  Every time this outer while loop itirates, the program will play another guessing game, and
  several values (seen above in the comments when the first while loop started) are reset to 0
  and "".

  totGuesses is divided by games casted as a double (with (double) games). A print statement
  prints out "Overall Results:". Then a series a printf() statements (to format the results),
  print out the total number of games played (in int games), the total guesses (in int
  totGuesses) average guesses a game (in int aveGuesses), and the max amount of guesses in any
  game (in int maxGuesses). The main method ends here.
  */
  public static void main(String[] args)
  {

    int[] numbers = new int[VAR];
    int guess = 0;
    int guesses = 0;
    double aveGuesses = 0.0;
    int totGuesses = 0;
    int games = 0;
    int maxGuesses = 0;
    String procede = "yes";
    String answer = "";

    for(int i = 0; i < VAR; i++)
    {
      numbers[i] = i + 1;
    }

    int min = numbers[0];
    int max = numbers[numbers.length-1];

    Scanner console = new Scanner(System.in);
    System.out.println("This program allows you to play a guessing game.");
    System.out.println("Think of a number between 1 and " + VAR + " \nand I  will quess until I get it.");
    System.out.println("For each guess, tell me if the \nright answer is higher or lower than your guess, or if it is correct.");

    while(procede.substring(0, 1).equals("y"))
    {
      answer = "";
      guess = 0;
      guesses = 0;
      min = numbers[0];
      max = numbers[numbers.length - 1];
      System.out.println();
      System.out.println("Think of a number...");
      while(!answer.equals("correct"))
      {
        guess = numberGuess(numbers, min, max, answer, guess);
        guesses++;
        System.out.println("My guess: " + guess);
        answer = console.next();

        if(answer.equals("lower"))
        {
          max = guess - 1;
        }

        else if(answer.equals("higher"))
        {
          min = guess + 1;
        }
      }
      totGuesses += guesses;
      games++;

      if(guesses >= maxGuesses)
      {
        maxGuesses = guesses;
      }

      System.out.println("I got it right in " + guesses + " guesses. \n");
      System.out.println("Do you want to play again? ");
      procede = console.next();
    }
    aveGuesses = totGuesses/(double) games;
    System.out.println("Overall results: ");
    System.out.printf("%-17s %-2s %-3d\n", "    total games", "=", games);
    System.out.printf("%-17s %-2s %-3d\n", "    total guesses", "=", totGuesses);
    System.out.printf("%-17s %-2s %-3.1f\n", "    guesses/game", "=", aveGuesses);
    System.out.printf("%-17s %-2s %-3d\n", "    max guesses", "=", maxGuesses);
  }
  /*static int method numberGuess(): has 5 parameters: int[] numbers, int min, int max, String
  answer, and int guess. All of these variables share names with the variables in the main
  method that are supposed to pass through them in a method call.

  int res is declared and initialized as 0. int index is declared and initialized as 0 as well.
  Random rand is created and constructed as new Random().

  An if statement states that if answer equals "" and guess == 0 (indicating that a game or
  round is just starting), then rand.nextInt(max) + 1 is assigned to index. This will always
  return a random number from 1-VAR (the numbers in the int array numbers).

  Then, an else if statement states that if answer equals lower, it will do rand.nextInt(max - min) + min - 1.
  This will keep narrowing down the numbers to choose from with each response of lower from the
  user. The else if statement ends.

  An else if statement states that if answer equals higher, it will do rand.nextInt(max - min) + min. This will
  keep narrowing down the numbers to choose from with each response of higher from the user. The else
  statement ends.

  numbers[index] is assigned to res. Finally, res is returned to the method.
  */
  public static int numberGuess(int[] numbers, int min, int max, String answer, int guess)
  {
    int res = 0;
    int index = 0;
    Random rand = new Random();

    if(answer.equals("") && guess == 0)
    {
      index = rand.nextInt(max) + 1;
    }

    else if(answer.equals("lower"))
    {
      index = rand.nextInt(max - min) + min - 1;
    }

    else if(answer.equals("higher"))
    {
      index = rand.nextInt(max - min) + min;
    }
    res = numbers[index];
    return res;
  }
}
