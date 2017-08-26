package lab3;

public class Main {
	public static void main(String[] args){
		Account account = new Account(100);
		
		account.deposit(200);
		account.withdraw(250);
		
		account.deposit(20);
		account.withdraw(400);
		
		System.out.println("Current Balance: "+ account.balance());
		System.out.println("Lowest Balance: "+ account.lowestBalance());
		
		
	}
}
