package lab2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Ticket ticket = null;
		//Job job = new Job();
		Scanner scan = new Scanner(System.in);
		
		double total = 0.00;
				
		System.out.print("Enter full name of the passenger: ");
		String fullName = scan.nextLine();
		System.out.println("Enter the departure location: ");
		String departure = scan.nextLine();
		System.out.println("Enter the destination: ");
		String destination =  scan.nextLine();
	
		ticket = new Ticket(fullName, departure, destination);
		
		System.out.println("Enter the number of bags to checkin: ");
		int bags = scan.nextInt();
		
		ticket.checkIn(bags);
		
		System.out.println("****************************************");
		System.out.println("Passenger: "+ ticket.getName());
		System.out.println("Route: "+ticket.getRoute());
		System.out.println("****************************************");
		System.out.println("Number of bags: "+bags);
		System.out.println("Baggage Charge: "+ ticket.getBaggageCharge());
		
		total += ticket.getBaggageCharge();
		
		if (ticket.getBaggageCharge() > 15.0){
			System.out.println("Overweight Insurance: 10.00");
			total += 10.00;
		}
		
		if(bags > 3){
			System.out.println("Space Supercharge: 10.00");
			total += 10.00;
		}
		
		System.out.println("Total Charge: "+total);
		
		
		
		
		
		scan.close();
		
	}
}
