package lab5;

public class Home extends Property {
	private int rooms;
	public Home(int vol, int fol, String add, double value, int rooms) {
		super(vol, fol, add, value);
		this.rooms = rooms;
	}
	
	/**
	 * 
	 */
	@Override
	public double getValue(){
		double first_value = super.getValue();
		double per_room =  50000 * this.rooms;
		
		return first_value + per_room;
	}
	
	@Override
	public double propertyTax(){
		return this.getValue() * 0.012;
	}

	public double sewerageCharge(){
		return 50 * rooms;
	}
}
