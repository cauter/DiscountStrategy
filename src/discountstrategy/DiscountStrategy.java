package discountstrategy;

/**
 *
 * @author Cody Auter
 * @course Adv. Java 152 - 135
 * @version 1.0
 */
public interface DiscountStrategy
{
    //Methods
    /**
     * Calculates discounts for products in retail systems.
     * 
     * @param price - base price of item to be discounted
     * @return price after discount
     */
    public abstract double calculateDiscount(double price);
}
