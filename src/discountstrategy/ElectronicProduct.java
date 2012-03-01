package discountstrategy;

/**
 *
 * @author Cody Auter
 * @course Adv. Java 152 - 135
 * @version 1.0
 */
public class ElectronicProduct implements Product
{
    //Properties
    private DiscountStrategy discount;
    private String description;
    private String name;
    private String id;
    private double cost;

    //Constructor
    public ElectronicProduct(String productID, String productName, double cost,
                   DiscountStrategy discount)
    {
        setId(productID);
        setName(productName);
        setCost(cost);
        setDiscount(discount);
        setDescription(productName);
    }

    //Methods
    @Override
    public double calculatePrice(double quantity)
    {
        return discount.calculateDiscount(cost) * quantity;
    }

    //Setters
    @Override
    public final void setCost(double cost)
    {
        this.cost = cost;
    }

    @Override
    public final void setDescription(String description)
    {
        this.description = description;
    }

    @Override
    public final void setDiscount(DiscountStrategy discount)
    {
        this.discount = discount;
    }

    @Override
    public final void setId(String id)
    {
        this.id = id;
    }

    @Override
    public final void setName(String name)
    {
        this.name = name;
    }

    //Getters
    @Override
    public double getCost()
    {
        return cost;
    }

    @Override
    public String getDescription()
    {
        return description;
    }

    @Override
    public DiscountStrategy getDiscount()
    {
        return discount;
    }

    @Override
    public String getId()
    {
        return id;
    }

    @Override
    public String getName()
    {
        return name;
    }
}
