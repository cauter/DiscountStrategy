package discountstrategy;

/**
 *
 * @author Cody Auter
 * @course Adv. Java 152 - 135
 * @version 1.0
 */
public interface ReceiptItem 
{
    //Returns total for item (qty * productCost)
    public abstract double getLineTotal();

    //Essentially toString(), returns what would print on receipt
    public abstract String getItemInfo();

    //Setters
    public abstract void setProduct(Product product);

    public abstract void setQuantity(double quantity);

    //Getters
    public abstract Product getProduct();

    public abstract double getQuantity();
}
