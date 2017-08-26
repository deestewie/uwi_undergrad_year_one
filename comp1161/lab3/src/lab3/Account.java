package lab3;


/**
 * An account (e.g. savings account) to be used for demonstration.
 * 
 * @author COMP1161
 * @version January 2015
 */
public class Account
{
    private double balance;
    //
    private String cust_name;
    private String cust_id;
    
    private double lowest_balance;
    
    /**
     * Constructor #1 - Account balance set to 0.00
     */
    public Account()
    {
        balance = 0.0;
    }
   
    /**
     * Constructor #2 - Set account balance to specified amount
     * @param amt amount that the balance is to set to 
     */
    public Account(double amt)
    {
        balance = amt;
    }
    
    
    /**
     * Constructor #3 - set the customer number, customer name, and the account balance
     * @param num
     * @param name
     * @param start
     */
    public Account(String num, String name, double start){
    	this();
    	this.setCust_id(num);
    	this.setCust_name(name);
    	this.deposit(start);
    }
 
    
    /**
     * Deposit an amount to the account.
     * @param amt amount to be deposited
     */
    public void deposit(double amt)
    {
        balance += amt;
        if (lowest_balance == 0.00){
        	lowest_balance = amt;
        }
    }
    
    /**
     * Returns the lowest balance
     * @return
     */
    public double lowestBalance(){
    	return lowest_balance;
    }
    
    /**
     * Withdraw an amount from the account.
     * @param amt amount to be withdrawn
     */
    public double withdraw(double amt)
    {
    	//modification from question #1
    	if (amt > balance){
    		double withdrawn = balance - amt;
    		if (withdrawn < balance)
    			lowest_balance = withdrawn;
    		 return balance;
    	}
        return 0;
    }
    
    
    /**
     * Return account balance
     * @param amt amount to be withdrawn
     * @return amount of money in the account (balance)
     */
    public double balance()
    {
        return balance;
    }
   
    /**
      * Return textual representation of an account
      * @param none
      * @return formatted string with information about the object
      */
    public String toString()
    {
       return "[ Customer Name: " + this.cust_id + ", Balance: "  + this.balance + "]";
    }

    /**
     * Gets the customer name eg. John Doe
     * @return
     */
	public String getCust_name() {
		return cust_name;
	}

	/**
	 * Sets the customer name
	 * @param cust_name
	 */
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	/**
	 * Gets the customer id
	 * @return
	 */
	public String getCust_id() {
		return cust_id;
	}

	/**
	 * Sets the customer id eg. CUST0001
	 * Check if id starts with CUST
	 * @param cust_id
	 */
	public void setCust_id(String cust_id) {
		String id = cust_id.toUpperCase();
		String start = id.substring(0,4);
		
		if(start.equals(start))
			this.cust_id = id;
	}
    
}
