/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: October 26, 2018
   PA4, Problem 3: Program uses a Scanner class object to prompt the user for two 
   person's birthdays and the current date, and it returns the remaining days until 
   each person's birthday, as well as which person's birthday is sooner.
   Bugs: None
*/

import java.util.*;

public class Problem3
{
  /*Main method: creates and invokes an instance of object of the Scanner class (named console). It uses a print 
  statment to prompt the user for person one's birthday, which console then assigns to int variable 
  personOneMonth using .nextInt(). It uses another print statement to ask theuser for person one's birth day, 
  which console then assigns to int variabl personOneDay. 
  
  The last two mentioned print statements are used for person two's birth month and birth day, and the result for 
  the birth month input is assigned to int variable personTwoMonth by the console, while the result of the birth 
  day input is assigned to int variable personTwoDay. 

  A print statment then prompts the user for today's month. console then assigns the input from the user to int 
  variable currentMonth. Another print statement then prompts the user for today's day. console then assigns the 
  input from the user to int variable currentDay.

  Three method calls are used for the method dayMaker: first with the parameters of personOneMonth and 
  personOneDay, whose result is assigned to int variable oneDays; second with the parameters of personTwoMonth 
  and personTwoDay, whose result is assigned to int variable twoDays; third with the parameters of currentMonth 
  and currentDay, whose result is assigned to int variable cDays. 

  Two method calls are used for the method remain: first with the parameters of oneDays and cDays,whose result 
  is assigned to int variable oneRem; second with the parameters of twoDays and cDays, whose result is assigned 
  to int variable twoRem. 

  A method call is used for the method sooner with the parameters of oneRem and twoRem. The result is assigned to 
  String variable soon.

  Finally, three print statement print out the number of days that remain until person one's birth day (stored in 
  oneRem), the number of days that remain until person two's birthday (stored in twoRem), and which person's 
  birthday is sooner (stored in soon).
  */ 
  public static void main(String[] args)
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Please enter person one's birth month as a number (Ex. October would be 10): ");
    int personOneMonth = console.nextInt();
    System.out.println("Please enter person one's birth day: ");
    int personOneDay = console.nextInt();

    System.out.println("Please enter person two's birth month as a number (Ex. October would be 10): ");
    int personTwoMonth = console.nextInt();
    System.out.println("Please enter person one's birth day: "); 
    int personTwoDay = console.nextInt();

    System.out.println("Please enter today's month as a number (Ex. October would be 10): ");
    int currentMonth = console.nextInt();
    System.out.println("Please enter today's day: ");
    int currentDay = console.nextInt();
    System.out.println();

    int cDays = dayMaker(currentMonth, currentDay);
    int oneDays = dayMaker(personOneMonth, personOneDay);
    int twoDays = dayMaker(personTwoMonth, personTwoDay);

    int oneRem = remain(oneDays, cDays);
    int twoRem = remain(twoDays, cDays);

    String soon = sooner(oneRem, twoRem);

    System.out.println(oneRem + " days remain for person one.");
    System.out.println(twoRem + " days remain for person two.");
    System.out.println(soon);
  }

  /*static int method dayMaker(): has two int parameters (int month and int day) as formal arguments. It 
  initializes and declares int variable days as 0. An if statement has the condition of if month is equal to 1, 
  then add the value of day to days. 
  
  An else if statement has the condition that if month is equal to 2, then add 
  31 (the number of days in January) and the value of day together and add the sum to what is in the days
  variable. 
  
  A second else if statement has the condition that if month is equal to 3, then add 59 (the total number of days 
  in January and February) to the value of day and add the sum to what is in the days variable. 
  
  A similar process is repeated for nine more else-if statements, with the value being added to day being equal
  to the combined number of in all the months previous to (and not including) the one indicated in the else-if 
  statement header. The final else if statement has the condition that if month is equal to twelve, then add 334 
  (number of days from January to November) to day and add the sum to what is in the days variable.

  The variable days is then returned to the method. 
  */
  public static int dayMaker(int month, int day)
  {
    int days = 0;

    if(month == 1) 
    {
      days += day;
    }

    else if(month == 2) 
    {
      days += 31 + day;
    }

    else if(month == 3) 
    {
      days += 59 + day;
    }

    else if(month == 4) 
    {
      days += 90 + day;
    }

    else if(month == 5) 
    {
      days += 120 + day;
    }

    else if(month == 6) 
    {
      days += 151 + day;
    }

    else if(month == 7) 
    {
      days += 181 + day;
    }

    else if(month == 8) 
    {
      days += 212 + day;
    }

    else if(month == 9) 
    {
      days += 243 + day;
    }

    else if(month == 10) 
    {
      days += 273 + day;
    }

    else if(month == 11) 
    {
      days += 304 + day;
    }

    else if(month == 12)
    {
      days += 334 + day;
    }
    return days;
  }
  /*static in method remain(): has two int parameters (int days and int cDays) as formal arguments. It 
  initializes and declares int variable daysLeft as 0.

  An if statment has the condition that if days is less than cDays, then first substract days from cDays to find 
  out how long ago a person's last birthday was from the current date, and subtract this result from 365 to find 
  how long until their next birthday will be. The result of this is assigned to daysLeft.

  An else-if statement has the condition that if cDays is less than or equal to days, then subtract cDays from 
  days to find out how many days are left until a person's next birthdy will be.The result of 
  this is assigned to daysLeft.

  daysLeft is then returned to the method.
  */
  public static int remain(int days, int cDays)
  {
    int daysLeft = 0;

    if(days < cDays) 
    {
      daysLeft = 365 - (cDays - days);
    }

    else if(cDays <= days)
    {
      daysLeft = days - cDays;
    }
    return daysLeft;
  }

  /*static String method sooner(): has two int parameters (int one and int two) as formal arguments to act as
  place holders for the days remaining for peron one and two's birthdays respectively. It initializes and declares String object person as "".

  An if statement has the condition that if two is less than one, then "Person two's birthday is sooner" is
  concatenated to person.

  An else-if statement has the condition that if one is less than two, then "Person one's birthday is sooner" is 
  concatenated to person.

  A second else-if statement has the condition that if one is equal to two (both days remaining are the same), then "Both person one and two's birthdays are sooner. They're on the same date!" is concatenated to person.

  person is then returned to the method.
  */
  public static String sooner(int one, int two) 
  {
    String person = "";
    if(two < one)
    {
      person += "Person two's birthday is sooner";
    }

    else if(one < two)
    {
      person += "Person one's birthday is sooner";
    }

    else if(one == two)
    {
      person += "Both person one and two's birthdays are sooner. They're on the same date!";
    }
    return person;
  }
}