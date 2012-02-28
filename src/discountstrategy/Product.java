package discountstrategy;

/**
 *
 * @author Cody Auter 
 * @course Adv. Java 152 - 135
 * @version 1.0
 */
public class Product
{
    //Properties

    private DiscountStrategy discount;
    private String description;
    private String name;
    private String id;
    private double cost;

    //Constructor
    public Product(String productID, String productName, double cost,
                   DiscountStrategy discount)
    {
        setId(productID);
        setName(productName);
        setCost(cost);
        setDiscount(discount);
        setDescription(productName);
    }

    //Methods
    public double calculatePrice(double quantity)
    {
        return discount.calculateDiscount(cost) * quantity;
    }

    //Setters
    public final void setCost(double cost)
    {
        this.cost = cost;
    }

    public final void setDescription(String description)
    {
        this.description = description;
    }

    public final void setDiscount(DiscountStrategy discount)
    {
        this.discount = discount;
    }

    public final void setId(String id)
    {
        this.id = id;
    }

    public final void setName(String name)
    {
        this.name = name;
    }

    //Getters
    public double getCost()
    {
        return cost;
    }

    public String getDescription()
    {
        return description;
    }

    public DiscountStrategy getDiscount()
    {
        return discount;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }
}
