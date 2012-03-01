package discountstrategy;

import java.text.NumberFormat;

/**
 *
 * @author Cody Auter 
 * @course Adv. Java 152 - 135
 * @version 2.0
 */
public class Receipt implements Invoice
{
    //Properties
    private Customer customer;
    private ReceiptItem[] items;
    private NumberFormat nf = NumberFormat.getCurrencyInstance();
    //Customer Database
    private Customer[] customerDB =
    {
        new Customer("123", "John Smith"),
        new Customer("007", "James Bond"),
        new Customer("042", "Douglas Adams")
    };

    //Constructor
    public Receipt(String customerID)
    {
        customer = findCustomer(customerID);
        items = new LineItem[0];
    }

    //Methods
    @Override
    public final double getTotal()
    {
        //Variables to handle calculations
        double subTotal = 0;
        double salesTaxRate = 0;

        //Cycle through array to get subTotals for each item.
        for (int i = 0; i < items.length; i++)
        {
            subTotal += items[i].getLineTotal();
        }

        return subTotal * (1 + salesTaxRate);
    }

    //Display method (ToString) - Put in Register?
    @Override
    public final String getReceiptInfo()
    {
        //Store info
        String storeInfo = "Super Electronics\n2639 Java Way"
                           + "\n(262) 555 - 5283"; //add address and phone

        //loop through array and print each lineItem
        String itemInfo = "";
        for (int i = 0; i < items.length; i++)
        {
            itemInfo = itemInfo + items[i].getItemInfo() + "\n";
        }

        //display final total
        String total = "Grand Total: \t\t" + nf.format(getTotal());

        return storeInfo + "\n"
               + customer.toString() + "\n"
               + itemInfo + "\n"
               + total;
    }

    //Add items to receipt (create a new array)
    @Override
    public final void addItem(String productID, int amount)
    {
        //Create LineItem object
        ReceiptItem newItem = new LineItem(productID, amount);

        //Create temp array for resize
        ReceiptItem[] temp = new LineItem[items.length + 1];
        //Copy current array
        for (int i = 0; i < items.length; i++)
        {
            temp[i] = items[i];
        }
        //Add new item in
        temp[temp.length - 1] = newItem;

        //Finalize transfer
        items = temp;
    }

    //Find customer by looping for id
    private final Customer findCustomer(String id)
    {
        Customer customer = null;
        for (Customer c : customerDB) //Quik loop for array
        {
            if (id.equals(c.getId()))
            {
                customer = c;
                break;
            }
        }
        return customer;
    }
}
