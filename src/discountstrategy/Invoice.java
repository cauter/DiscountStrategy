package discountstrategy;

/**
 *
 * @author Cody Auter
 * @course Adv. Java 152 - 135
 * @version 1.0
 */
public interface Invoice 
{
    public abstract double getTotal();

    //Display method (ToString) - Put in Register?
    public abstract String getReceiptInfo();

    //Add items to receipt (create a new array)
    public abstract void addItem(String productID, int amount);

//    //Find customer by looping for id - use in constructor
//    private abstract Customer findCustomer(String id);
}
