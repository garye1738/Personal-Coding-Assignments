/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: September 21, 2018
   PA1, MileageReimbursement: Program is supposed to take on two double parameters,
   calculate the distance travelled, calculate the reimbursement available, then
   return the information as print statements.
   Bugs: None. Just dont know if there is a way to shorten the statements in the
   main method or not. Please let me know if possible when assignment is returned.
   I originally had one static void method that did everything much more efficently, but
   I used the static doubles because we were told to. Please tell me if you want me
   to show you the original code I had.
*/

public class MileageReimbursement
{
  //main method has several print statements with several method calls, including
  //getInitial(), getEnd(), getDistance(), and getReimbursement(). See below methods for
  //for information on them and their parameters. main method prints out Mileage REIMBURSEMENT
  //Calculator, the initial odometer reading, and the end odometer reading. Then, it prints
  //out distance travelled using getDistance(), getInitial(), and getEnd(). Then, using
  //getReimbursement() and getDistance(), it prints out the reimbursement.
  public static void main(String[] args)
  {
    System.out.println("MILEAGE REIMBURSEMENT CALCULATOR");
    System.out.print("The initial odometer reading is: ");
    System.out.println(getInitial(13505.2));
    System.out.print("The final odometer reading is: ");
    System.out.println(getEnd(13810.6));
    System.out.print("You traveled ");
    System.out.println(getDistance(getInitial(13505.2), getEnd(13810.6)));
    System.out.print("Your reimbursement is ");
    System.out.print(getReimbursement(getDistance(getInitial(13505.2), getEnd(13810.6))));
  }

  //getInitial() static double method: has one double parameter (double initial) which takes
  //the initial mileage from the odometer and returns it. Returned value is used
  //when method is called in main method.
  public static double getInitial(double initial)
  {
    return initial;
  }

  //getEnd() static double method: has one double parameter (double end) which takes the
  //initial mileage from the odometer and returns it. Returned value is used when method
  //in the main method
  public static double getEnd(double end)
  {
    return end;
  }

  //getDistance() static double method: has two double parameters (double initial,
  //and double end) which are the initial and end mileage on the odometer respectively.
  //Subtracts initial mileage from end mileage to get the distance travelled, and
  //stores the distance travelled into the double variable distTravelled. distTravelled
  //is returned to the method.
  public static double getDistance(double initial, double end)
  {
    double distTravelled = end - initial;
    return distTravelled;
  }

  //getReimbursement() static double method: has one double parameter (double distance),
  //which is the distance a vehicle has travelled (can be gained from getDistance() above).
  //distance can then be multiplied by .35 cents per mile to get the product which is
  //the amount to be reimbursed, which is then stored in the double reimbursement.
  //reimbursement is then returned to the method.
  public static double getReimbursement(double distance)
  {
    double reimbursement = distance * .35;
    return reimbursement;
  }
}
