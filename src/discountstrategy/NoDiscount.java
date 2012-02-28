package discountstrategy;

/**
 *
 * @author Cody Auter
 * @course Adv. Java 152 - 135
 * @version 1.0
 */
public class NoDiscount implements DiscountStrategy
{
    //Methods
    public double calculateDiscount(double price)
    {
        return price;
    }
}
