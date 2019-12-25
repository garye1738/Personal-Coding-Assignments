/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: November 19, 2018
   PA6, Problem 1: Program prompts the user for a choice of random thinking or
   calculated thinking while playing rock, paper, scissors. The computer will
   then play a game of rock, paper, scissors using the method that they have
   chosen (either random or thinking). It will return the final score at the
   end of the game when the user decides they want to stop.
   Bugs: None
*/

import java.util.*;

public class Problem1
{
  /*main method(): creates a Scanner object (console). Then it prompts the use to play
  rock paper scissors and choose either the "random" mode or the "think" mode for
  the computer to use. console then assigns the users response  in lowercase to the String variable
  response.

  The method then tells the user if they want to stop the game they should type out
  "stop" at the beginning of a round.

  Then, String variables compPlay, userPlay, scoreBoard, and prev are all declared
  and initialized as "". compPlay will store the computer's hand(rock, paper or
  scissors), and userPlay will hold the user's hand. scoreBoard will contain the
  score, who is winning, and also the final score at the end. prev will contain
  the last hand that the user played.

  An int array (score) is declared with a length of 2. It will contain the score of
  both the user and the computer (the user's score is in score[0], and the
  computer's score is in score[1]).

  String result is declared and initialized as "". It will contain the
  result/winner of the most recent play of the game.

  An int array (history) is declared with a length of 3. It will contain a history
  of how many times that the user played every hand (history[0] is for the
  frequency of rock, history[1] is for paper, history[2] is for scissors.) This is
  only used if the player picks the think option.

  An if statement has the condition that if response equals random, then it will
  lead to a while loop. The while loop has the condition that while userPlay does not
  equal stop, then it will ask the user for which hand they choose (rock, paper, or
  scissors). console will then assign the user's response in lowercase to the
  String response. The method random() is then called, and the result is assigned
  to the String compPlay.

  The method referee() is called with the parameters of score, userPlay,
  compPlay, and history (note that history isn't used when the user chooses random,
  and that all of its values are set to zero in the referee() method to ensure the
  computer is random). The result of this call is then assigned to the String
  result. result is then printed out.

  The method scoreCount() is then called with the parameters of score and userPlay.
  The result is assigned to the String scoreBoard. scoreBoard is then printed out
  for the user to see.

  This while loop will repeat until the user types in stop. The previous if
  statement for response equals random ends.

  A different if statement has the condition that if response equals think, then it
  will lead to a while loop. This while loop has the condition that while userPlay
  does not equal stop, then it will ask the user for which hand they choose (rock, paper, or
  scissors). console will then assign the user's response in lowercase to the
  String response. The method think() is called with the parameters of history and
  prev, and the result is assigned to the String compPlay.

  The method referee() is called with the parameters of score, userPlay,
  compPlay, and history. history is used here to see what hands the player has
  played in the past. The result of this call is then assigned to the String
  result. result is then printed out.

  The method scoreCount() is then called with the parameters of score and userPlay.
  The result is assigned to the String scoreBoard. scoreBoard is then printed out
  for the user to see. userPlay is then assigned to prev to be used in the next
  iteration of the loop.

  int variable zeroTest is declared and initialized to 0. A for loop is initialized
  with i equals 0, i is less than the length of the history array, and i++. For
  every iteration of this loop, it will the the vaue at index i of history to
  zeroTest. This loop ends. Then an if statement states that if zeroTest equals 0
  (there was nothing at any index of history), then assign "" to prev. this process
  ensures that if in the referee() method history reset itself to 0, then prev will
  be blank and ready for the next iteration of the loop (see think() for why).

  This while loop will repeat until the user types in stop. The previous if
  statement for response equals think ends. The main method also ends too.
  */
  public static void main(String[] args)
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Hi there! Let's play some rock, paper, scissors!");
    System.out.println("I have two modes. One where I randomly choose rock paper scissors,\nor one where I will think based on your past decisions and play \nbased on them.");
    System.out.println();

    System.out.println("Type \"random\" if you want me to play randomly, or type \"think\" if you want me to play based on your past decisions: ");
    String response = console.next().toLowerCase();

    System.out.println();
    System.out.println("Great! You chose " + response + " as your response.\nIf you want to stop playing, at the beginning of a round type \"stop\" to stop.");

    String compPlay = "";
    String userPlay = "";
    String scoreBoard = "";
    String prev = "";
    int[] score = new int[2];
    String result = "";
    int[] history = new int[3];

    if(response.equals("random"))
    {
      while(!userPlay.equals("stop"))
      {
        System.out.println();
        System.out.println("What do you choose? Rock, paper or scissors? ");
        userPlay = console.next().toLowerCase();
        compPlay = random();

        System.out.println();
        result = referee(score, userPlay, compPlay, history);
        System.out.println(result);

        scoreBoard = scoreCount(score, userPlay);
        System.out.println(scoreBoard);

      }
    }

    if(response.equals("think"))
    {
      while(!userPlay.equals("stop"))
      {
        System.out.println();
        System.out.println("What do you choose? Rock, paper or scissors? ");
        userPlay = console.next().toLowerCase();
        compPlay = think(history, prev);

        result = referee(score, userPlay, compPlay, history);
        System.out.println(result);

        scoreBoard = scoreCount(score, userPlay);
        System.out.println(scoreBoard);
        prev = userPlay;

        int zeroTest = 0;
        for(int i = 0; i < history.length; i++)
        {
          zeroTest += history[i];
        }

        if(zeroTest == 0)
        {
          prev = "";
        }
      }
    }
  }

  /*static String method random(): has no paramters. String res is declared and initialized to "". int r is declared and initialized to 0. Random rand is created and constructed as new Random(). rand.nextInt(3) is then assigned to r (will assign a random integer from 0-2).

  An if statement states that if r equals 0, then "rock" is assigned to res as the computer's hand to play. The if statement ends.

  An else if sttaements states that if r equals 1, then "paper" is assigned to res.

  Another else if statement states that if if r equals 2, then "scissors" is
  assigned to res. res is then returned to the method with the computer's random
  hand to play.
  */
  public static String random()
  {
    String res = "";
    int r = 0;
    Random rand = new Random();
    r = rand.nextInt(3);

    if(r == 0)
    {
      res = "rock";
    }

    else if(r == 1)
    {
      res = "paper";
    }

    else if(r == 2)
    {
      res = "scissors";
    }
    return res;
  }

  /*static String method think(): has two parameters: int[] history and String prev (previous play),
  which take on their named objects in the main method. String res is declared and
  initialized to "".

  An if statement states that if history[0] (rock plays), history[1] (paper plays),
  and history[2] (scissors plays) are all
  equal to zero, then the random() method is called and the result is assigned to
  res. All zeros in the history array mean either the game has started, or the array
  has been reset when the program guesses the correct counter to the user's next hand.

  An else if statement states that if rock plays are greater than both paper and
  scissors plays, then "paper" is assigned to res. to counter a possible rock play
  by the user.

  An else if statement states that if paper plays are greater than both rock and scissors plays, then
  "scissors" is assigned to res to counter a possible paper play.

  An else if statement states that if scissors plays are greater than both rock and
  paper plays, then rock is assigned to res to counter a possible scissors play.

  Then, an else if statement states that if the previous play by the user was rock and either
  rock plays equals paper plays or rock plays equals scissors plays, then paper is
  assigned to res since the user is likely to choose rock this round.

  An else if statement states that if the previous play by the user was paper and either paper
  plays equals rock plays or paper plays equals scissor plays, then scissors is assigned
  to res since the user is likely to choose paper this round.

  An else if statement states that if the previous play by the user was scissors and either scissors
  plays equals rock plays or scissors plays equals paper plays, then rock is assigned
  to res since the user is likely to choose scissors this round.

  An else if statement states that if the previous play by the user was rock and both
  rock plays equals paper plays and rock plays equals scissors plays, then paper is
  assigned to res since the user is likely to choose rock this round.

  An else if statement states that if the previous play by the user was paper and both paper
  plays equals rock plays and paper plays equals scissor plays, then scissors is assigned
  to res since the user is likely to choose paper this round.

  An else if statement states that if the previous play by the user was scissors and both scissors plays equals rock plays and scissors plays equals paper plays, then rock is assigned
  to res since the user is likely to choose scissors this round. res is then returned to the method.
  */
  public static String think(int[] history, String prev)
  {
    String res = "";

    if(history[0] == 0 && history[1] == 0 && history[2] == 0)
    {
      res = random();
    }

    else if(history[0] > history[1] && history[0] > history[2])
    {
      res = "paper";
    }

    else if(history[1] > history[0] && history[1] > history[2])
    {
      res = "scissors";
    }

    else if(history[2] > history[0] && history[2] > history[1])
    {
      res = "rock";
    }

    else if(prev.equals("rock") && history[0] == history[1] || history[0] == history[2])
    {
      res = "paper";
    }

    else if(prev.equals("paper") && history[1] == history[0] || history[1] == history[2])
    {
      res = "scissors";
    }

    else if(prev.equals("scissors") && history[2] == history[0] || history[2] == history[1])
    {
      res = "rock";
    }

    else if(prev.equals("rock") && history[0] == history[1] && history[0] == history[2])
    {
      res = "paper";
    }

    else if(prev.equals("paper") && history[0] == history[1] && history[0] == history[2])
    {
      res = "scissors";
    }

    else if(prev.equals("scissors") && history[0] == history[1] && history[0] == history[2])
    {
      res = "rock";
    }
    return res;
  }

  /*static String method referee(): has 4 paramters; int[] score, String userPlay, Strong compPlay,
  and int[] history. They are all meant to take in the variables and objects in the main method that
  share their name. String res is decarled and initialized to "". int clearHistory is declared and initialized to 0.

  An if statement states that if userPlay equals scissors and compPlay equals rock, then score[1]
  (the computer's score) is incremented by one. A reaction string is assigned to res. history[2] is
  incremented by 1 to indicate a scissor play by the user. clearHistory is incremented by 2.

  An else if statement states that if userPlay equals scissors and compPlay equals paper, then score
  [0] (the user's score) is incremented by one. A reaction string is assigned to res. history[2] is
  incremented by 1 to indicate a scissor play by the user. clearHistory is incremented by 1.

  An else if statement states that if userPlay equals rock and compPlay equals paper, then score
  [1] is incremented by one. A reaction string is assigned to res. history[0] is
  incremented by 1 to indicate a rock play by the user. clearHistory is incremented by 2.

  An else if statement states that if userPlay equals rock and compPlay equals scissors, then score
  [0] is incremented by one. A reaction string is assigned to res. history[0] is
  incremented by 1 to indicate a rock play by the user. clearHistory is incremented by 1.

  An else if statement states that if userPlay equals paper and compPlay equals scissors, then score
  [1] is incremented by one. A reaction string is assigned to res. history[1] is
  incremented by 1 to indicate a paper play by the user. clearHistory is incremented by 2.

  An else if statement states that if userPlay equals paper and compPlay equals rock, then score
  [0] is incremented by one. A reaction string is assigned to res. history[1] is
  incremented by 1 to indicate a paper play by the user. clearHistory is incremented by 1.

  An else if statement states that if userPlay equals compPlay and userPlay equals rock, then a rock
  specific response is assigned to res. clearHistory is incremented by 1.

  An else if statement states that if userPlay equals compPlay and userPlay equals paper, then a paper
  specific response is assigned to res. clearHistory is incremented by 1.

  An else if statement states that if userPlay equals compPlay and userPlay equals scissors, then a
  scissors specific response is assigned to res. clearHistory is incremented by 1.

  An if statement states that if clearHistory equals 1, then result is simply returned to the method.

  An else if statement states that clearHistory equals 2, then a for loop is initialized to i = 0, i
  is less than the length of the history array, and i++. Then, with every iteration of the loop, every
  value of the history array will be set to 0. My reasoning behind this is that when if statements
  where clearHistory was incremented by 2 (with the think() method in play) indicate that the computer
  correctly guessed (based of off the user passed plays) what hand the user was going to play next.
  The user may then mix up their strategy, so their previous record of plays is then useless to the
  program, so all of the history values are thus reset. The for loop ends, and so does the else if statement
  it is inside of. res is then returned to the method.
  */
  public static String referee(int[] score, String userPlay, String compPlay, int[] history)
  {
    String res = "";
    int clearHistory = 0;
    if(userPlay.equals("scissors") && compPlay.equals("rock"))
    {
      score[1]++;
      res = "Take that! Rock beats scissors!";
      history[2]++;
      clearHistory += 2;
    }

    else if(userPlay.equals("scissors") && compPlay.equals("paper"))
    {
      score[0]++;
      res = "Ouch! That hurt! Scissors beats paper. Well played!";
      history[2]++;
      clearHistory++;
    }

    else if(userPlay.equals("rock") && compPlay.equals("paper"))
    {
      score[1]++;
      res = "I just wrapped you up! Paper beats rock!";
      history[0]++;
      clearHistory += 2;
    }

    else if(userPlay.equals("rock") && compPlay.equals("scissors"))
    {
      score[0]++;
      res = "Ow, that hurt! Rock beats scissors. Well played.";
      history[0]++;
      clearHistory++;
    }

    else if(userPlay.equals("paper") && compPlay.equals("scissors"))
    {
      score[1]++;
      res = "I just cut you up! Scissors beats paper!";
      history[1]++;
      clearHistory += 2;
    }

    else if(userPlay.equals("paper") && compPlay.equals("rock"))
    {
      score[0]++;
      res = "You just wrapped me up! Paper beats rock. Well played!";
      history[1]++;
      clearHistory++;
    }

    else if(userPlay.equals(compPlay) && userPlay.equals("rock"))
    {
      res = "It's a tie! We can't hit each other with rocks.";
      history[0]++;
      clearHistory++;
    }

    else if(userPlay.equals(compPlay) && userPlay.equals("paper"))
    {
      res = "It's a tie! We only slide against each other as paper leaves.";
      history[1]++;
      clearHistory++;
    }

    else if(userPlay.equals(compPlay) && userPlay.equals("scissors"))
    {
      res = "It's a tie! We can't cut each each other with scissors!";
      history[2]++;
      clearHistory++;
    }

    if(clearHistory == 1)
    {
      return res;
    }

    else if(clearHistory == 2)
    {
      for(int i = 0; i < history.length; i++)
      {
        history[i] = 0;
      }
    }
    return res;
  }

  /*static String method scoreCount(): has two parameters: int[] score and String userPlay. Both are intended to pass through the object counter parts in the main method that share their name. String res is declared and initialized to "".

  An if statement states that if score[0] (the user's score) is greater than score[1] (the computer's score) and
  userPlay does not equal stop, then a statement saying the scores and that the player is winning is assigned to res.

  An else if statement states that if score[1] is greater than score[0] and userPlay does not equal stop, then a
  statement saying the scores and that the computer is winning is assigned to res.

  An else if statement states that if score[1] is equal to score[0] and userPlay does not equal stop, then a
  statement saying the scores and that the player and computer are tied is assigned to res.

  An else if statement states that if score[0] is greater than score[1] and userPlay equals stop (indicating that the
  user doesn't want to play and wants the final score), then a statement saying the scores and that the player has
  won is assigned to res.

  An else if statement states that if score[1] is greater than score[0] and userPlay equals stop, then a statement
  saying the scores and that the computer has won is assigned to res.

  Finally, an else if statement states that if score[1] is equal to score[0] and userPlay equals stop, then a statement
  saying the scores and that both the play and computer are tied and no one wins is assigned to res. res is returned to
  the method.
  */
  public static String scoreCount(int[] score, String userPlay)
  {
    String res = "";

    if(score[0] > score[1] && !userPlay.equals("stop"))
    {
      res = "The score is " + score[0] + " to " + score[1] + ", your lead! You're doing great!";
    }

    else if(score[1] > score[0] && !userPlay.equals("stop"))
    {
      res = "The score is " + score[1] + " to " + score[0] + ", my lead! Pick up the pace or \nyou're going to lose!";
    }

    else if(score[1] == score[0] && !userPlay.equals("stop"))
    {
      res = "The score is " + score[1] + " to " + score[0] + ". we're tied right now, \nbut it's going to change in a minute. In my favor!";
    }

    else if(score[0] > score[1] && userPlay.equals("stop"))
    {
      res = "The final score is " + score[0] + " to " + score[1] + ". You won! Try me again. \nI'll get you next time, you just got lucky!";
    }

    else if(score[1] > score[0] && userPlay.equals("stop"))
    {
      res = "The final score is " + score[1] + " to " + score[0] + ". I WON!!! Take that! Try me\n again! No way you can beat me. You were too cocky this round. Start me up again to\n see if you can win!";
    }

    else if(score[1] == score[0] && userPlay.equals("stop"))
    {
      res = "The final score is " + score[1] + " to " + score[0] + ". It's a tie! That was a good game. \nBut I don't think you'll be lucky next time around!";
    }
    return res;
  }
}
