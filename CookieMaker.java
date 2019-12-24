/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: September 21, 2018
   PA1, CookieMaker: Program takes an amount of cookies, calculates the cups of sugar,
   butter, and flour needed for each, and gives back the required ingredient
   amounts.
   Bugs: None
*/

public class CookieMaker
{
  
  //main method runs the getSugar(), getButter(), and getFlour() static double
  //methods with three method calls, each with three seperate calls for each amount of cookies
  //Uses 48 cookies for recipe 1, 144 cookies for recipe 2, and 72 cookies for recipe 3.
  //Main method also prints out Ingredients Recipe 1, 2 and 3.
  public static void main(String[] args)
  {
    System.out.println("Ingredients Recipe 1");
    System.out.println(getSugar(48));
    System.out.println(getButter(48));
    System.out.println(getFlour(48));
    System.out.println();

    System.out.println("Ingredients Recipe 2");
    System.out.println(getSugar(144));
    System.out.println(getButter(144));
    System.out.println(getFlour(144));
    System.out.println();

    System.out.println("Ingredients Recipe 3");
    System.out.println(getSugar(72));
    System.out.println(getButter(72));
    System.out.println(getFlour(72));
    System.out.println();
  }

  //getSugar() static double method: contains the base ingredient amount of sugar
  //for making 48 cookies. It has one int parameter (int cookies) for the amount of
  //cookies trying to be made. The number of cookies is divided by 48.0 (48.0 is
  //a decimal so that the quotient is a decimal as well) in order to get a factor
  //to be multiplied by the mentioned basic amount of sugar to get the new amount
  //of sugar to make the given amount of cookies. The factor is then multplied by the double variable
  //cupsOfSugar to get the new amount of sugar, which is stored back into cupsOfSugar.
  //cupsOfSugar is then returned to the method. The returned value is then used when the
  //method is called in the main method.
  public static double getSugar(int cookies)
  {
    double cupsOfSugar = 1.5;
    double factor = cookies/48.0;
    cupsOfSugar *= factor;
    return cupsOfSugar;
  }

  //getButter() static double method: contains the base ingredient amount of butter
  //for making 48 cookies. It has one int parameter (int cookies) for the amount of
  //cookies trying to be made. The number of cookies is divided by 48.0 (48.0 is
  //a decimal so that the quotient is a decimal as well) in order to get a factor
  //to be multiplied by the mentioned basic amount of butter to get the new amount
  //of butter to make the given amount of cookies. The factor is then multplied by the double variable
  //cupsOfButter to get the new amount of butter, which is stored back into cupsOfButter.
  //cupsOfButter is then returned to the method. The returned value is then used when the
  //method is called in the main method.
  public static double getButter(int cookies)
  {
    double cupsOfButter = 1.0;
    double factor = cookies/48.0;
    cupsOfButter *= factor;
    return cupsOfButter;
  }

  //getFlour() static double method: contains the base ingredient amount of flour
  //for making 48 cookies. It has one int parameter (int cookies) for the amount of
  //cookies trying to be made. The number of cookies is divided by 48.0 (48.0 is
  //a decimal so that the quotient is a decimal as well) in order to get a factor
  //to be multiplied by the mentioned basic amount of flour to get the new amount
  //of flour to make the given amount of cookies. The factor is then multplied by the double variable
  //cupsOfFlour to get the new amount of flour, which is stored back in cupsOfFlour.
  //cupsOfFlour is then returned to the method. The returned value is then used when the
  //method is called in the main method.
  public static double getFlour(int cookies)
  {
    double cupsOfFlour = 2.75;
    double factor = cookies/48.0;
    cupsOfFlour *= factor;
    return cupsOfFlour;
  }
}
