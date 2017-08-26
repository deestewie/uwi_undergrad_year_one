package lab5;

public class Property {
	private int volume_no;
	private int folio_no;
	private String address;
	private double value;
	
	

	public Property(int vol, int fol, String add, double value){
		this.volume_no = vol;
		this.folio_no = fol;
		this.address = add;
		this.value = value;
	}
	
	public int getVolume_no() {
		return volume_no;
	}

	public int getFolio_no() {
		return folio_no;
	}

	public String getAddress() {
		return address;
	}

	public double getValue() {
		return value;
	}
	
	public double propertyTax(){
		return value * 0.01;
	}

	@Override
	public String toString() {
		return "Property [Volume Number=" + volume_no + ", Folio Number=" + folio_no + ", Address=" + address + ", Value="
				+ value + "]";
	}
}
