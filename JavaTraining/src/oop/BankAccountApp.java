package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		
		BankAccount account1 = new BankAccount();
		account1.setName (" Joshua Ibirogba");
		account1.setSSN("146765324");
		account1.accountNumber = "4502284367";
		account1.balance = 50000;
		
		account1.setRate();
		account1.increaseRate();
		
		System.out.println(account1.getName());
		System.out.println(account1.getSSN());
		
		account1.deposit(2000);
		account1.deposit(2500);
		account1.deposit(5000);
		account1.withdraw(4500);
		
		//Polymorphism through overriding
		System.out.println(account1.toString());
		
		
		
	//Polymorphism through overloading constructors
		BankAccount account2 = new BankAccount(" Checking Account");
		account2.checkBalance();
	
		BankAccount account3 = new BankAccount("Checking Account", 5000);
		account3.checkBalance();
		
		
		//Inheritance Demo
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.setName("David");
		cd1.interestRate = "4.5";
		System.out.println(cd1.toString());
		cd1.compound();

	}

}
