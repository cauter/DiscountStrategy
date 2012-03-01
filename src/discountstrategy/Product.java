package discountstrategy;

/**
 *
 * @author Cody Auter 
 * @course Adv. Java 152 - 135
 * @version 2.0
 */
public interface Product
{
    //Methods
    public abstract double calculatePrice(double quantity);

    //Setters
    public abstract void setCost(double cost);

    public abstract void setDescription(String description);

    public abstract void setDiscount(DiscountStrategy discount);

    public abstract void setId(String id);

    public abstract void setName(String name);
    //Getters
    public abstract double getCost();

    public abstract String getDescription();

    public abstract DiscountStrategy getDiscount();

    public abstract String getId();

    public abstract String getName();
}
