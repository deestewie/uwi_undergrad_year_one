package lab5;

public class Main {

	public static void main(String[] args) {
		Property property1 = new Property(1154, 3012, "12 Fleet Street", 70000);
		Property property2 = new Property(1034, 3120, "7 Petunia Avenue", 100000);
		Property property3 = new Property(1136, 3300, "1 Plum Lane", 50000);
		Property property4 = new Property(1788, 2043, "3 Mona Circle", 150000);


		System.out.println("Property 1 \n"+ property1.toString() + "\n Property Tax: "+ property1.propertyTax());
		System.out.println("\n");
		System.out.println("Property 2 \n"+ property2.toString() + " Property Tax: "+ property2.propertyTax());
		System.out.println("\n");
		System.out.println("Property 3 \n"+ property3.toString() + " Property Tax: "+ property3.propertyTax());
		System.out.println("\n");
		System.out.println("Property 1 \n"+ property4.toString() + " Property Tax: "+ property4.propertyTax());
	
		System.out.println("\n");
		
		Home house1 = new Home(1154, 3012, "12 Fleet Street", 70000, 0);
		Home house2 = new Home(1034, 3120, "7 Petunia Avenue", 100000,3);
		Home house3  = new Home(1136, 3300, "1 Plum Lane", 50000, 0);
		Home house4 = new Home(1788, 2043, "3 Mona Circle", 150000,2);
		
		System.out.println("House 1 \n"+ house1.toString() + "\n Property Tax: "+ house1.propertyTax() + "\nSewerage Charge: "+house1.sewerageCharge());
		System.out.println("\n");
		System.out.println("House 2 \n"+ house2.toString() + " Property Tax: "+ house2.propertyTax() + "\nSewerage Charge: "+house1.sewerageCharge());
		System.out.println("\n");
		System.out.println("House 3 \n"+ house3.toString() + " Property Tax: "+ house3.propertyTax() + "\nSewerage Charge: "+house1.sewerageCharge());
		System.out.println("\n");
		System.out.println("House 4 \n"+ house4.toString() + " Property Tax: "+ house4.propertyTax() + "\nSewerage Charge: "+house1.sewerageCharge());
	
		//Discussion Question
		//Property myProperty = new House(1234, 5678,”14 Old Road”,100000,5);
		//double fee = myProperty.propertyTax();
		
		//add 
		//double other = myProperty.sewerageCharge(); 
	}

}
