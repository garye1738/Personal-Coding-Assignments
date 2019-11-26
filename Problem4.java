/* Name: Gabriel Arye
   Email: gabrielarye@brandeis.edu
   Date: October 1, 2018
   PA2, Problem 4: Program uses a Scanner class object to prompt the user for three items,their quantities, and their prices.
   Then the program will calculate individual item totals, a subtotal, tax for the purchase, and the final purchase price for the
   user.
   Bugs: None.
*/
import java.util.*;

public class Problem4
{
  /*Main method: Declares and invokes an object of the Scanner class (console). It prints out statments asking the user
    for the name of an item (which console assigns to string firstName), the quantity of an item (which console assigns to
    int firstQuan), and the price of an item (which console assigns to double firstPrice). This process is repeated two
    more times for two sperate items, and the values are stored in second_ and third_ variables.

    The method itemTotal() is called upon with the parameters of firstQuan and firstPrice being actual arguments. The
    method returns the value to the double variable total1, which is the total price of the quantity of the first item
    (or total price made up of the price of each individual item times its quantity). Process is repeated twice for the second and third items,
    the results being assigned to the double variables total2 and total3.

    The double method getSubTotal() is called with the 3 parameters of total1, total2, and total3 being actual arguments.
    The method call combines the mentioned price totals to get the subtotal price of the combined quantities of all the items.
    The result of getSubTotal is assigned to the double variable subTotal.
    The double method getTax() is called with the parameter of the subTotal variable as the actual argument. It will
    find 6.25% of the subtotal and return it to the method, which then stores it in the double variable tax.
    The double method getTotal() is called with the parameters of the variables subTotal and tax as the actual arguments.
    It will add the tax and the subtotal together to find the final total of all the items including tax. The result is then
    returned to the method and stored in in the double variable total.

    The method prints out 3 blank lines. Then, it prints out "Your bill", and uses System.out.printf along with print format for
    String (%-xs), int (%-xd), and double (%-x.yf) values to align the statements to the left (the dash, -) and give them the
    proper character widths (from left to right, 30, 10, 10, and 10). x indicates the width, while y indicates the number of characters
    after the decimal point that should be visible. Prints out the name, quantity, price per item, and total item price for each
    item using the printf() methods and \n to move to the next line. This is done 3 times for the three items.
    Then, "Subtotal" and the variable subTotal are printed out with printf() and printf precision for String and double. It also has a \n to
    skips a line with \n too. The same is done for "6.25% sales tax" and the variable tax, as well as for "Total" and the total variable.
  */
  public static void main(String[] args)
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Input name of item 1 (use underscores instead of spaces): ");
    String firstName = console.next();
    System.out.println("Input quantity of item 1: ");
    int firstQuan = console.nextInt();
    System.out.println("Input price of item 1: ");
    double firstPrice = console.nextDouble();

    System.out.println("Input name of item 2 (use underscores instead of spaces): ");
    String secondName = console.next();
    System.out.println("Input quantity of item 2: ");
    int secondQuan = console.nextInt();
    System.out.println("Input price of item 2: ");
    double secondPrice = console.nextDouble();

    System.out.println("Input name of item 3 (use underscores instead of spaces): ");
    String thirdName = console.next();
    System.out.println("Input quantity of item 3: ");
    int thirdQuan = console.nextInt();
    System.out.println("Input price of item 3: ");
    double thirdPrice = console.nextDouble();

    double total1 = itemTotal(firstQuan, firstPrice);
    double total2 = itemTotal(secondQuan, secondPrice);
    double total3 = itemTotal (thirdQuan, thirdPrice);

    double subTotal = getSubTotal(total1, total2, total3);
    double tax = getTax(subTotal);
    double total = getTotal(subTotal, tax);


    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("Your bill: ");
    System.out.printf("%-30s %-10s %-10s %-10s\n", "Item", "Quantity", "Price", "Total");
    System.out.printf("%-30s %-10s %-10.2f %-10.2f\n", firstName, firstQuan, firstPrice, total1);
    System.out.printf("%-30s %-10s %-10.2f %-10.2f\n", secondName, secondQuan, secondPrice, total2);
    System.out.printf("%-30s %-10s %-10.2f %-10.2f\n", thirdName, thirdQuan, thirdPrice, total3);
    System.out.println();
    System.out.printf("%-52s %-10.2f\n", "Subtotal", subTotal);
    System.out.printf("%-52s %-10.2f\n", "6.25% sales tax", tax);
    System.out.printf("%-52s %-10.2f\n", "Total", total);
  }

  /*static double method itemTotal(): has two parameters (int quan and double price) for the quantity of items and the
    price for each individual item. It multiplies quan by price to get the total price of all the items of that type.
    The total price is assigned to the double variable itemTot. itemTot is returned to the method.
  */
  public static double itemTotal(int quan, double price)
  {
    double itemTot = quan*price;
    return itemTot;
  }

  /*double static method getSubtotal(): has three double parameters (tot1, tot2, and tot3), each representing the total price of the quantity
    of one item (total price made up of the price of each individual item times its quantity). The tots are all added together
    and assigned to the double variable subTot. subTot is then returned to the method.
  */
  public static double getSubTotal(double tot1, double tot2, double tot3)
  {
    double subTot = tot1 + tot2 + tot3;
    return subTot;
  }

  /*double static method getTax(): has one double parameter (subTot), which is the subtotal of the prices all items combined.
    subTot is multiplied by .0625 (the 6.025% tax rate) to get the amount of tax required for that subtotal. The result is assigned to
    the double variable tax. tax is then returned to the method.
  */
  public static double getTax(double subTot)
  {
    double tax = .0625*subTot;
    return tax;
  }

  /*static double method getTotal(): has two double parameters (subTot and tax), which respectively are the subtotal of all
    the item prices, and the tax for that subtotal. The method then adds subTot to tax to get the final total including tax.
    The result is assigned to the double variable tot. tot is then returned to the method.
  */
  public static double getTotal(double subTot, double tax)
  {
    double tot = subTot + tax;
    return tot;
  }
}
