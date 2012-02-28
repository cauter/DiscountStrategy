/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Cody Auter
 * @course Adv. Java 152 - 135
 * @version 1.0
 */
public class UsedItemDiscount implements DiscountStrategy
{
    //Properties
    private double discountRate;
    
    /**Constructor
     * Creates a discount for an used item. Discount rate is variable.
     * 
     * @param rate - Must be between 0 to 100. If outside range, 
     * assumes 10% rate.
     */
    public UsedItemDiscount(double rate)
    {
        //Test for applicable range
        if(rate > 0 && rate < 1)
        {
            setDiscount(rate);
        } else setDiscount(0.10); //If outside range, assume 10% rate
    }
    
    //Methods
    /**Override
     * Returns price of an item after discount is applied. Takes off discounted
     * rate from total price, according to variable rate.
     * 
     * @param price
     * @return price after discount is applied.
     */
    public double calculateDiscount(double price)
    {
        return price - (price * discountRate);
    }
    
    public final void setDiscount(double rate)
    {
        discountRate = rate;
    }
}
