/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: October 1, 2018
   PA2, PigLatin: Program uses a Scanner class object to prompt the user for their first and last name. It then creates the user's pig latin
   name and returns it to them.
   Bugs: None.
*/
import java.util.*;

public class Problem5
{
  /*Main method: creates an object of the Scanner class (console) connected to the standard input. Prints a statement prompting the
    user to enter their first name, which the console then assigns into the String variable first. It then pirnts a statement prompting them
    for their last name, which the console then assigns into the String variable last.

    The main method calls the method pigLatin() and uses first as the parameter to find the pig latin first name of the user. The result is then
    stored in the String variable pigFirst. It calls the method pigLatin() again and uses last as the parameter this time, to find the pig latin
    last name of the user. The result is then stored in the String variable pigLast. pigFirst is then added to a space, which is then added to pigLast
    to create the full pig latin name of the user, which is then stored in the String variable pigName. Then, the ethod prints out
    "Your pig latin name is:" concatenated with pigName.
  */
  public static void main(String[] args)
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Please enter your first name: ");
    String first = console.next();
    System.out.println("Please enter your last name: ");
    String last = console.next();

    String pigFirst = pigLatin(first);
    String pigLast = pigLatin(last);
    String pigName = pigFirst + " " + pigLast;
    System.out.println("Your pig latin name is: " + pigName);
  }

  /*static double method pigLatin(): has one String parameter (name), which can either be the first or last name of the user.
    name is first set to lower case with .toLowerCase(), and is assigned back to name. The substring of name which is the character at
    index 0 is assigned to the String variable firstInitial with name.substring(0, 1). The substring of name which is the character at
    index 1 is assigned to the String variable nextFirstInitial with name.susbtring(1, 2). The substring of name from the third character (at index 2)
    and everything beyond that to the end of the name String are assigned to the name with name.substring(2), making the new name everything except the first two letters.
    Then, the new first initial (the previous second initial in name) is made to uppercase with nextFirstInitial.toUpperCase() and is concatenated with name, which is
    concatenated with the firstInitial variable (the previous first initial in name), which is concatenated with "ay" to complete the pig latin formation.
    This new pig latin name is then asigned to the variable name. Then, name is returend to the method.
  */
  public static String pigLatin(String name)
  {
    name = name.toLowerCase();
    String firstInitial = name.substring(0, 1);
    String nextFirstInitial = name.substring(1, 2);
    name = name.substring(2);
    name = nextFirstInitial.toUpperCase() + name + firstInitial + "ay";
    return name;
  }
}
