/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: September 21, 2018
   PA1, Problem 3: Program is supposed to be given the high temperature of the
   day in degrees Fahrenheit (today is actually 72 degrees Fahrenheit) and convert
   it to degrees Celsius.
   Bugs: None
*/

public class TemperatureChange
{
  //main method has  print statements and the method calls for temperatureF() and
  //temperature with with one parameter of the high of the day in degrees Fahrenheit
  //Prints out the high temperature of the day in degrees Fahrenheit and what that
  //is in degrees Celsius.
  public static void main(String[] args)
  {
    System.out.print("The high for today in degrees Fahrenheit is: ");
    System.out.println(temperatureF(72));
    System.out.print(temperatureF(72));
    System.out.print(" degrees Fahrenheit is ");
    System.out.print(temperatureC(72));
    System.out.print(" degrees Celsius.");
  }

  //temperature() method: static method that takes on one parameter of the high of the say in degrees Fahrenheit.
  //It calculates degrees Celsius by subtracting 32 from the degrees Fahrenheit,
  //multiplying it by 5, and then diving by 9.0 (a decimal so that the quotient
  //will have number after the decimal point and not be all 0s). Then, the method
  //prints out two lines of code; the first saying the high in degrees Fahrenheit,
  //and the second saying the equivalent of degrees Celsius to degrees Fahrenheit.

  //temperatureF() static int method: has one parameter (int degreesF) for the high of
  //the day in degrees Fahrenheit. Method returns the value, which is used when the
  //method is called in the main method.
  public static int temperatureF(int degreesF)
  {
    return degreesF;
  }

  //temperatureC() static double method: has one parameter (int degreesF) for the high of
  //the day in degrees Fahrenheit. Method converts degreesF variable (temperature in
  //degrees Fahrenheit) to temperature in degrees Celsius using the equation: 5*(degreesF-32)/9.0
  //(9.0 is a double so the result will have the needed digits after the decimal point).
  //Result is stored in the double degreesC. Then, degreesC is multiplied by 10 to
  //keep the tenths digit after the decimal place and move it to the ones place,
  //and casted as an int to cut off the rest of the decimal places. The result is
  //stored in degreesC. Then, degreesC is divided by 10 to bring the ones place digit
  //to the tenths place (bring back the decimal), and casted as a double so that the
  //variable is returned to a double format. degreesC is then returned, and used when
  //the method is called in the main method.
  public static double temperatureC(int degreesF)
  {
    double degreesC = 5*(degreesF-32)/9.0;
    degreesC = (int)(degreesC*10);
    degreesC = (double)(degreesC/10);
    return degreesC;
  }
}
