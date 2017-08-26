package lab2;


/**
 * Stores details of a ticket for travel
 * 
 * @author COMP1161
 * @version 1.00
 */
public class Ticket
{
    // instance variables - replace the example below with your own
    private String passenger;
    private String from, to;
    private int bags; 
    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String passenger, String from, String to)
    {
        this.passenger = passenger;
        this.from = from;
        this.to = to;
    }

    /**
     * getter method for passenger name
     * @return name of passenger
     */
    public String getName()
    {
        return passenger;
       
    }
    
    /**
     * get route information
     * @return route information (e.g. "Kingston to Mandeville")
     */
    public String getRoute()
    {
        return from + "to "+to;
    }
    
    /**
     * Setter method for the number of bags a passenger will carry
     * @param bags number of bags the passenger will carry
     */
    public void checkIn(int bags)
    {
        this.bags = bags;
    }
    
    /**
     * method that calculates baggage charge based on number of bags
     * @return calculated baggage charge
     */
    public double getBaggageCharge()
    {
        if (bags > 3)
            return 5.0 * 3 + 6.0*(bags -3);
        else
            return 5.0 * bags;
    }
    
    public static void main(String[] args)
    {
        Ticket mine = new Ticket("John Brown","Kingston", "New York");
        mine.checkIn(5);
        System.out.println(mine.getName());
        System.out.println(mine.getRoute());
        System.out.println(mine.getBaggageCharge());
    }
    
}
