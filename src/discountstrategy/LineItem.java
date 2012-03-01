package discountstrategy;

import java.text.NumberFormat;

/**
 *
 * @author Cody Auter 
 * @course Adv. Java 152 - 135
 * @version 1.5
 */
public class LineItem
{
    //Properties
    //'has a' Product

    private Product product;
    private double quantity;
    private NumberFormat nf = NumberFormat.getCurrencyInstance();
    //Product Database
    private Product[] productDB =
    {
        new ElectronicProduct("ME987", "Raiders of the Lost Ark - DVD", 24.95,
                    new HalfOffDiscount()),
        new ElectronicProduct("TV060", "Sony Bravia 1080p - 55\"", 3200,
                    new UsedItemDiscount(.1)),
        new ElectronicProduct("GM115", "Mass Effect 3 - X360", 59.95, new NoDiscount()),
        new ElectronicProduct("GM001", "X360 Wireless Controller", 19.99,
                    new UsedItemDiscount(.15))
    };

    //Constructor
    public LineItem(String productID, double quantity)
    {
        product = findProductById(productID);
        setQuantity(quantity);
    }

    //Methods
    public double getLineTotal()
    {
        return product.calculatePrice(quantity);
    }

    public String getItemInfo()
    {
        String s = product.getId() + ":  " + product.getName() + "\n"
                   + "\t" + quantity
                   + " @ " + nf.format(product.calculatePrice(1))
                   + " =\t" + nf.format(getLineTotal());
        return s;
    }

    private final Product findProductById(String id)
    {
        Product product = null;
        for (Product p : productDB)
        {
            if (id.equals(p.getId()))
            {
                product = p;
            }
        }

        return product;
    }

    //Setters
    public final void setProduct(Product product)
    {
        this.product = product;
    }

    public final void setQuantity(double quantity)
    {
        this.quantity = quantity;
    }

    //Getters
    public Product getProduct()
    {
        return product;
    }

    public double getQuantity()
    {
        return quantity;
    }
}
