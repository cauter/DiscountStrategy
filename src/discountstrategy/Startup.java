package discountstrategy;

import java.text.NumberFormat;

/**
 *
 * @author Cody Auter 
 * @course Adv. Java 152 - 135
 * @version 1.0
 */
public class Startup
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //TESTED: Product, DiscountStrategy, LineItem, Receipt, CashRegister

        CashRegister cr = new CashRegister();

        cr.startNewSale("007");

        cr.addNewItem("TV060", 1);
        cr.addNewItem("ME987", 1);
        cr.addNewItem("GM115", 1);
        cr.addNewItem("GM001", 2);

        cr.finializeSale();

        //Showing off now...
        cr.startNewSale("042");

        cr.addNewItem("TV060", 8);

        cr.finializeSale();

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("Total sales for shift: "
                           + nf.format(cr.getTotalSales()));
    }
}
