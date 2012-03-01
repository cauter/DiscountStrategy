package discountstrategy;

/**
 *
 * @author Cody Auter @course Adv. Java 152 - 135
 * @version 1.5
 */
public class CashRegister
{
    //Properties
    private Invoice invoice;
    private double totalSales;

    //Constructor
    public CashRegister()
    {
        setTotalSales(0.0);
    }

    //Methods
    /**
     * Clerk swipes customers ID card to begin sales transaction. swipe will
     * submit String variable of customers ID.
     *
     * @param customerID - ID for customer. Typically 3 numbers.
     */
    public void startNewSale(String customerID)
    {
        invoice = new Receipt(customerID);
    }

    /**
     * Clerk scans an item to add to invoice. Clerk must enter how many of each
     * item are being purchased. Each entered item has its own line on the final
     * receipt.
     *
     * @param productID - 5 digit code for item. Follows pattern of two letters
     * followed by three numbers.
     * @param quantity - amount of item to be purchased. Does NOT allow multiple
     * scans of items.
     */
    public void addNewItem(String productID, int quantity)
    {
        invoice.addItem(productID, quantity);
    }

    /**
     * Clerk ends transaction with customer, and receipt prints. salesTotal
     * variable is currently unused. Future version will allow program to
     * balance register at shift end.
     *
     */
    public final void finializeSale()
    {
        double salesTotal = invoice.getTotal(); //To be used in future update
        System.out.println(invoice.getReceiptInfo() + "\n\n**********\n");
        totalSales += salesTotal;
    }

    //Getter & Setter
    public double getTotalSales()
    {
        return totalSales;
    }

    private final void setTotalSales(double totalSales)
    {
        this.totalSales = totalSales;
    }
}
