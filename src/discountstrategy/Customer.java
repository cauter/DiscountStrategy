package discountstrategy;

/**
 *
 * @author Cody Auter
 * @course Adv. Java 152 - 135
 * @version 1.0
 */
public class Customer
{
    //Properties
    private String name;
    private String id;
    private boolean preferredCustomer;
    
    //Constructor
    public Customer(String id, String name)
    {
        setId(id);
        setName(name);
        setPreferredCustomer(false);
    }
    
    //Methods
    public String toString()
    {
        if(preferredCustomer)
        {
            return "Customer ID:\t" + id +
                "\nName:\t" + name +
                "PREFERRED CUSTOMER";
        } else
            return "Customer ID:\t" + id +
                "\nName:\t" + name;
    }
    public String getId()
    {
        return id;
    }

    public final void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public final void setName(String name)
    {
        this.name = name;
    }

    public boolean isPreferredCustomer()
    {
        return preferredCustomer;
    }

    public final void setPreferredCustomer(boolean preferredCustomer)
    {
        this.preferredCustomer = preferredCustomer;
    }
    
}
