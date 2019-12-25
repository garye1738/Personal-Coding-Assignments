/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: November 19, 2018
   PA6, Hangman: Program prompts the user for a word length and then the word
   that they want the computer to try and guess. Te computer is allowed six
   wrong letter answers before they lose the game and a complete hangman is
   hung.
   Bugs: None
*/

import java.util.*;

public class Hangman
{
  /*main method(): creates and constructs a Scanner object (named console). It then uses a print statement to
  tell the user that they are playing a game of hangman. A print statement prompts the user for how many letters
  are in their word. console then assigns the user's input to the declared int wordLen (using nextInt()). Another
  print statement asks the user to input their word that is of the length they input. console then assigns this
  word in lowercase to the declared String word (using next()). A println() statement is for spacing.

  String letters is declared and initialized to "abcdefghijklmnopqrstuvwxyz". This will be the alphabet that the
  program guesses letters from. int wrong is declared and initialized to 0. It will count wrong guesses of the
  computer. int stalkLen is declared and initialized to 4. This determines how long the stalk of the hangman gallow
  will be. int lettersRight is declared and initialized to 0, and will count how many times the program guessed a
  letter correctly. String guess is declared and initialized to "". String response is declared and initialized to "".
  The method initialDisplay() is called with the parameter of wordLen, and the result of the method call is
  assigned to String lettersGuessed. Then, a print statement prints out lettersGuessed (to display the partially
  guessed or incomplete word the user chose). A println() statement is for spacing.

  The void method zero() is called with the parameter of stalkLen. It will display an initial hangman
  gallow. A while loop has the condition that while wrong is less than 6 (the 6 body parts of a hangman),
  a print statement will display how many letters the program has guessed correcty out of the total amount of letters.
  Random rand is created to be a new Random object.
  The method lettterGuesser() is called with the parameters of letters and rand. The result of the call is assigned to String
  guess, and will contain a randomly guessed letter from the String letters. The method nextLetters() is called with
  the parameters of guess and letters. The result of this call, which will be a new letters string without the
  previously guessed letter, is assigned to letters. This ensures that the same letter isn't randomly called again.
  A print statement displays the program's letter guess (in String guess) in the uppercase, and asks the user to type
  "y" if the letter is in their word, or "n" if it isn't. console then assigns the response from the user to the
  String response (with next()). A println() statement is for spacing.

  An if statement has the condition that if response equals n, then it will increment wrong by 1. The method
  display() is called with the parameters of guess, word, wordLen, and lettersGuessed. The result of this call is
  assigned to lettersGuessed. A print statement prints out lettersGuessed to display the partially/incomplete word.
  A println() statement is added for spacing. After this are a series of if and else if statements inside the first
  if statement above.

  An if statement states that if wrong equals 1, then stalkLen is decremented by 1. The void method hangMan is called
  with the parameters of wrong and stalkLen. the hangMan method will print out the necessary and updated hangman
  gallow, and the hangman's partial/completed body on it. This if statement ends.

  An else if statement states that if wrong equals 2, then stalkLen is decremented by 1. The void method hangMan is
  called with the parameters of wrong and stalkLen. This else if statement ends.

  An else if statement states that if wrong equals 3, then stalkLen is decremented by 1. The void method hangMan is
  called with the parameters of wrong and stalkLen. This else if statement ends.

  An else if statement states that if wrong equals 4, then the void method hangMan is called with the parameters of
  wrong and stalkLen. It isn't necessary to change stalkLen after this point because every inrementation of wrong
  after thus will work with the last value fo stalkLen (which is 1) to make the hangMan. This else if statement ends.

  An else if statement states that if wrong equals 5, then the void method hangMan is called with the parameters of
  wrong and stalkLen. This else if statement ends.

  An else if statement states that if wrong equals 6, then the void method hangMan is called with the parameters of
  wrong and stalkLen. A print statement states that the user beast the program, and that the game is over.
  This else if statement ends. After this, the first if statement (seen in comment on line 41) ends.

  Still in the while loop, an else if statement has the condition that if response equals y, then the method
  letterCounter() is called with the parameters guess, word, wordLen, and lettersGuessed. This method will count how
  many times the letter it guessed (in guess) appears in the word the user chose (word). The result of this method
  call is assigned to lettersRight. The method display() is called with the parameters of guess, word, wordLen, and
  lettersGuessed. The result of this call is assigned to lettersGuessed. A print statement then prints out
  lettersGuessed to show the partially completed word with correct guesses. A println() statement is for spacing.
  After this are a series of if an else if statements inside the else if statement above.

  An if statement states that if wrong is less than or equals to 5, then the hangMan method is called with the
  parameters of of wrong and wordLen. The else if statement (in comment in line 69) ends here are well.

  Still in the while loop, an if statement states that if lettersRight equals wordLen (indicating that all letters
  have been gussed correctly), then a print statement tells the user that the computer has won. 7 is assigned to wrong
  so that the while loop (comment line 31, code line 109), doesn't repeat again. This if statement ends. The while loop
  (comment line 31, code line 109) ends. The main method ends as well.
  */
  public static void main(String[] args)
  {
   Scanner console = new Scanner(System.in);
    System.out.println("This program plays a game of reverse hangman.");
    System.out.println("You think up a word and type it on the computer, and I will try to guess the letters.");
    System.out.println();

    System.out.println("How many letters are in your word? ");
    int wordLen = console.nextInt();
    System.out.println("Please enter the word for me to guess (letters only): ");
    String word = console.next().toLowerCase();
    System.out.println();

    String letters = "abcdefghijklmnopqrstuvwxyz";
    int wrong = 0;
    int stalkLen = 4;
    int lettersRight = 0;
    String guess = "";
    String response = "";
    String lettersGuessed = initialDisplay(wordLen);
    System.out.println(lettersGuessed + "\n");

    zero(stalkLen);

    while(wrong < 6)
    {
      System.out.println("I've got " + lettersRight + " out of " + wordLen + " letters so far.");
      Random rand = new Random();
      guess = letterGuesser(letters, rand);
      letters = nextLetters(guess, letters);
      System.out.println("I guess: " + guess.toUpperCase() + ". Please type \"y\" for yes if it is there and \"n\" for no \nif it is not.");
      response = console.next();
      System.out.println();

      if(response.equals("n"))
      {
        wrong++;
        lettersGuessed = display(guess, word, wordLen, lettersGuessed);
        System.out.println(lettersGuessed);
        System.out.println();

        if(wrong == 1)
        {
          stalkLen--;
          hangMan(wrong, stalkLen);
        }

        else if(wrong == 2)
        {
          stalkLen--;
          hangMan(wrong, stalkLen);
        }

        else if(wrong == 3)
        {
          stalkLen--;
          hangMan(wrong, stalkLen);
        }

        else if(wrong == 4)
        {
          hangMan(wrong, stalkLen);
        }

        else if(wrong == 5)
        {
          hangMan(wrong, stalkLen);
        }

        else if(wrong == 6)
        {
          hangMan(wrong, stalkLen);
          System.out.println("You beat me this time. Start me over. I'll get you and we'll see how good you are!");
        }
      }

      else if(response.equals("y"))
      {
        lettersRight = letterCounter(guess, word, wordLen, lettersRight);
        lettersGuessed = display(guess, word, wordLen, lettersGuessed);
        System.out.println(lettersGuessed);
        System.out.println();

        if(wrong <= 5)
        {
          hangMan(wrong, stalkLen);
        }
      }

      if(lettersRight == wordLen)
      {
        System.out.println("I beat you! YES!! I am victorious! Start me again. \nI bet can beat you a second time");
        wrong = 7;
      }
    }
  }

  /*static String method letterGuesser(): has two paramters: String letters, and Random rand. Both of
  these parameters will pass through the String and Random objects in the main method that share
  their name. String res is declared and initialized to "". int len is declared and initialized to
  letters.length() (length of letters string). int r is declared declared and initialized to 0.

  Then, rand.nextInt(len) is assigned to r. This will generate a random number from 0 to one less than
  the length of the letters String (so 0 to letters.length()-1, which is the index of last character
  int the String letters). letters.susbtring(r, r + 1) is assigned to res. This will use the number
  value in r to retrieve a random letter at index r (substring(r, r + 1)) in the letters String.
  res is returned to the method.
  */
  public static String letterGuesser(String letters, Random rand)
  {
    String res = "";
    int len = letters.length();
    int r = 0;
    r = rand.nextInt(len);
    res = letters.substring(r, r + 1);
    return res;
  }

  /*static String method nextLetters(): has two parameters: String guess and String letters.
  Both of these parameters will pass through the String objects in the main method that
  share their name. String res is declaed and initialized to "".

  Then, a for loop is created and initialized to int i = 0, u is less than letters.length(), and i++.
  An if statement states that if letters.susbtring(i, i + 1) does not equal guess, then concatenate
  letters.susbtring(i, i + 1) to whatever is in res. This if statement ends. The for loop also ends.
  With every iteration of this for loop, it will skip over the guess letter in the String letters and
  add all other letters in letters to be used when the next guess is made in the main method. This
  ensures that a letter is only guessed once. res is returned to the method.
  */
  public static String nextLetters(String guess, String letters)
  {
    String res = "";
    for(int i = 0; i < letters.length(); i++)
    {
      if(!(letters.substring(i, i + 1).equals(guess)))
      {
        res += letters.substring(i, i + 1);
      }
    }
    return res;
  }
  /*static int method letterCounter():has 4 parameters: String guess, String word, int wordLen, and int
  letsR. All these parameters (with the exception of int letsR) are meant to pass throught the objects
  and variables in the main method that they share names with. int letsR is meant to pass through
  int lettersRight.

  int present is declared and initialized to letsR. A for loop is initialized to int i = 0, i is less
  than wordLen, and i++. Inside the for loop is an if statement that states that if
  word.substring(i, i + 1) equals guess, then increment present by 1. The if statement ends, and so
  does the for loop. Every time this for loop iterates, it is checking to see if a letter in word is equal to guess. If it is then present (or letters correctly guessed), is incremented by 1. This is repeated for every letter in word. present is returned to the method.
  */
  public static int letterCounter(String guess, String word, int wordLen, int letsR)
  {
    int present = letsR;

    for(int i = 0; i < wordLen; i++)
    {
      if(word.substring(i, i + 1).equals(guess))
      {
        present++;
      }
    }
    return present;
  }
  /*static String method initialDisplay() has one paramter which is int wordLen. The method will
  create the initial incomplete word with dashes (number of dashes is equal to the user's word
  length). String res is declared and initialized to int i = 0, i is less than wordLen, and i++.
  For every iteration of this loop, a "-" is concatenated with what is already in res. The for loop
  ends. res is returned to the method.
  */
  public static String initialDisplay(int wordLen)
  {
    String res = "";
    for(int i = 0; i < wordLen; i++)
    {
      res += "-";
    }
    return res;
  }

  /* static String method display(): has 4 parameters: String guess, String word, int wordLen, and
  String letsG. All these parameters (with the exception of int letsG) are meant to pass through the
  objects and variables in the main method that they share names with. int letsG is meant to pass
  through int lettersGuessed.

  String res is declared and initialized as "".A for loop is created and initialized to int j = 0, j is
  less than wordLen, and j++. An if statement states that if word.substring(j, j + 1) equals guess,
  then concatenate guess to what every is already in res. This if statement means that if the word the
  user input has at substring(j, j + 1) the letter in guess, than add that to the new partially
  completed word to display.

  Then, an else statement says to concatenate letsG.susbtring(j, j + 1) to whatever is already in res.
  This else statement, when guess is is not equal to the current letter in the word String, will
  concatenate whatever was in the letsG (or lettersGuessed) string res. This includes both letters and
  dashes to indicate not guessed letters. This else loop ends. The for loop also ends. The for loop is
  repeated for every letter in the word String. res is returned to the method.
  */
  public static String display(String guess, String word, int wordLen, String letsG)
  {
    String res = "";

    for(int j = 0; j < wordLen; j++)
    {
      if(word.substring(j, j + 1).equals(guess))
      {
        res += guess;
      }

      else
      {
        res += letsG.substring(j, j + 1);
      }
    }
    return res;
  }

  /*static void method hangMan(): has two parameters: int wrong and int stalkLen. Both of these
  parameters are meant to pass throught the objects and variables in the main method that they share
  names with.

  An if statement states that if wrong equals 0, then a method call to the void method zero is used
  with the parameter of stalkLen. This if statement ends. This statement will print out a blank
  hangman gallow with no hangman on it.

  An else if statement states that if wrong equals 1, then a method call to the void method one is
  used with the parameter of stalkLen. This else if statement ends. This statement will print out a
  hangman gallow with a head.

  An else if statement states that if wrong equals 2, then a method call to the void method two is
  used with the parameter of stalkLen. This else if statement ends. This statement will print out a
  hangman gallow with a head and a body.

  An else if statement states that if wrong equals 3, then a method call to the void method three is
  used with the parameter of stalkLen. This else if statement ends. This statement will print out a
  hangman gallow with a head, body and one leg.

  An else if statement states that if wrong equals 4, then a method call to the void method four is
  used with the parameter of stalkLen. This else if statement ends. This statement will print out a
  hangman gallow with a head, body and two legs.

  An else if statement states that if wrong equals 5, then a method call to the void method five is
  used with the parameter of stalkLen. This else if statement ends. This statement will print out a
  hangman gallow with a head, body, two legs, and an arm.

  An else if statement states that if wrong equals 6, then a method call to the void method fix is
  used with the parameter of stalkLen. This else if statement ends. This statement will print out a
  hangman gallow with a head, body, two legs, and both arms, a complete hangman. This indicates the
  end of the game. The method ends after this else if statement.
  */
  public static void hangMan(int wrong, int stalkLen)
  {
    if(wrong == 0)
    {
      zero(stalkLen);
    }

    if(wrong == 1)
    {
      one(stalkLen);
    }

    else if(wrong == 2)
    {
      two(stalkLen);
    }

    else if(wrong == 3)
    {
      three(stalkLen);
    }

    else if(wrong == 4)
    {
      four(stalkLen);
    }

    else if(wrong == 5)
    {
      five(stalkLen);
    }

    else if(wrong == 6)
    {
      six(stalkLen);
      //System.out.println("You beat me this time. Start me over. I'll get you and we'll see how good you are!");
    }
  }

  /*static void method head(): will print out the hangman's head and part of the gallow stalk.
  */
  public static void head()
  {
    System.out.println("|  O");
  }

  /*static void method body(): will print out the hangman's body and part of the gallow stalk.
  */
  public static void body()
  {
    System.out.println("|  |");
  }

  /*static void method rightLeg(): will print out the hangman'sright leg and part of the gallow stalk.
  */
  public static void rightLeg()
  {
    System.out.println("| /");
  }

  /*static void method leftLeg(): will print out the hangman's left and right legs and part of the
  gallow stalk.
  */
  public static void leftLeg()
  {
    System.out.println("| / \\");
  }

  /*static void method rightArm(): will print out the hangman's right arm, their body, and part of the
  gallow stalk.
  */
  public static void rightArm()
  {
    System.out.println("| /|");
  }

  /*static void method leftArm(): will print out the hangman's right and left arms, their body, and
  part of the gallow stalk.
  */
  public static void leftArm()
  {
    System.out.println("| /|\\");
  }

  /*static void method zero(): has one int paramter (int len) which is meant to pass through
  int stalkLen from the hangMan() method. It uses a method call for top() to print the top of a gallow,
  a call for noose() to print the rope to connect the hangman to the gallow, a call for stalk() with
  len as a parameter to print out the gallow stalk, and a call for base() to print the gallow base.
  The method ends.
  */
  public static void zero(int len)
  {
    top();
    noose();
    stalk(len);
    base();
  }

  /*static void method one(): has one int paramter (int len) which is meant to pass through
  int stalkLen from the hangMan() method. It uses a method call for top() to print the top of a gallow,
  a call for noose() to print the rope to connect the hangman to the gallow, a call for head() to print
  the hangman's head, a call for stalk() with len as a parameter to print out the gallow stalk, and a
  call for base() to print the gallow base. The method ends.
  */
  public static void one(int len)
  {
    top();
    noose();
    head();
    stalk(len);
    base();
  }

  /*static void method two(): has one int paramter (int len) which is meant to pass through
  int stalkLen from the hangMan() method. It uses a method call for top() to print the top of a gallow,
  a call for noose() to print the rope to connect the hangman to the gallow, a call for head() to print
  the hangman's head, a call for body() to print his body, a call for stalk() with len as a parameter
  to print out the gallow stalk, and a call for base() to print the gallow base. The method ends.
  */
  public static void two(int len)
  {
    top();
    noose();
    head();
    body();
    stalk(len);
    base();
  }

  /*static void method three(): has one int paramter (int len) which is meant to pass through
  int stalkLen from the hangMan() method. It uses a method call for top() to print the top of a gallow,
  a call for noose() to print the rope to connect the hangman to the gallow, a call for head() to print
  the hangman's head, a call for body() to print his body, a call for rightLeg() to print out his
  right leg, a call for stalk() with len as a parameter to print out the gallow stalk, and a call for
  base() to print the gallow base. The method ends.
  */
  public static void three(int len)
  {
    top();
    noose();
    head();
    body();
    rightLeg();
    stalk(len);
    base();
  }

  /*static void method four(): has one int paramter (int len) which is meant to pass through
  int stalkLen from the hangMan() method. It uses a method call for top() to print the top of a gallow,
  a call for noose() to print the rope to connect the hangman to the gallow, a call for head() to print
  the hangman's head, a call for body() to print his body, a call for leftLeg() to print out his
  left and right leg, a call for stalk() with len as a parameter to print out the gallow stalk, and a
  call for base() to print the gallow base. The method ends.
  */
  public static void four(int len)
  {
    top();
    noose();
    head();
    body();
    leftLeg();
    stalk(len);
    base();
  }

  /*static void method five(): has one int paramter (int len) which is meant to pass through
  int stalkLen from the hangMan() method. It uses a method call for top() to print the top of a gallow,
  a call for noose() to print the rope to connect the hangman to the gallow, a call for head() to print
  the hangman's head, a call for rightArm() to print his right arm and his body, a call for leftLeg()
  to print out his left and right leg, a call for stalk() with len as a parameter to print out the
  gallow stalk, and a call for base() to print the gallow base. The method ends.
  */
  public static void five(int len)
  {
    top();
    noose();
    head();
    rightArm();
    leftLeg();
    stalk(len);
    base();
  }

  /*static void method six(): has one int paramter (int len) which is meant to pass through
  int stalkLen from the hangMan() method. It uses a method call for top() to print the top of a gallow,
  a call for noose() to print the rope to connect the hangman to the gallow, a call for head() to print
  the hangman's head, a call for leftArm() to print his right and left arm and his body, a call for
  leftLeg() to print out his left and right leg, a call for stalk() with len as a parameter to print
  out the gallow stalk, and a call for base() to print the gallow base. The method ends.
  */
  public static void six(int len)
  {
    top();
    noose();
    head();
    leftArm();
    leftLeg();
    stalk(len);
    base();
  }

  /*static void method top(): prints out +--+ to be the top of the gallows.
  */
  public static void top()
  {
    System.out.println("+--+");
  }

  /*static void method noose(): prints out |  | to be the hangman's noose and part of the gallow stalk.
  */
  public static void noose()
  {
    System.out.println("|  |");
  }

  /*static void method stalk(): has one int parameter (int len) with will be the length of the gallow
  stalk that isn't adjacent to the hangman's body on a line. A for loop is created and initialized to
  int i = 0, i is less than len, and i++. For every iteration of the loop, it will print one |, part of the gallow stalk. The loop ends, and so does the method.
  */
  public static void stalk(int len)
  {
    for(int i = 0; i < len; i++)
    {
      System.out.println("|");
    }
  }

  /*static void method base(): will print out +----- as the gallow base. Also uses  two println()
  statements to add space and organize output.
  */
  public static void base()
  {
    System.out.print("+-----");
    System.out.println();
    System.out.println();
  }
}
