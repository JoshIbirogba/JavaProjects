package oop;

public class BankAccount implements IRate{


	private String name;
	String accountNumber;
	private static final String routingNumber = "04552";
	private String SSN;

	double balance = 0;
	
	//constructors
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
		System.out.println();
	}
	
	//overloaded constructor
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT " + accountType);
		System.out.println();
	}
	
	BankAccount(String accountType, double initDeposit){
		System.out.println("NEW ACCOUNT " + accountType);
		System.out.println();
		System.out.println("INITIAL DEPOSIT OF : $" + initDeposit); 
		String Msg = "";
		if ( initDeposit < 2000) {
			Msg = "ERROR: Minimum deposit must be at least $2000";
		}
		else {
			Msg = "Thank you for your initial deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	//Getters/setters
	
	//Allow users to define name
	public void setName (String name) {
		this.name = "Mr." + name;
	}
	public String getName() {
		return name;
	}
	
	//getter
	public String getSSN() {
		return SSN;
	}
	
    //setter for SSN
	public void setSSN(String sSN) {
		this.SSN = sSN;
	}
	
	//interface implementation  
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate() {
		System.out.println("INCREASE RATE");
	}
	
	//defined methods
	void deposit(double amount) {
		balance += amount;    //balance = balance + amount
		showActivity("DEPOSIT");
		
	}
	
	void withdraw (double amount) {
		balance -= amount;
		showActivity("WITHDRAW");
		
	}
	
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION : " + activity);
		System.out.println("YOUR NEW BALANCE IS : $" + balance);
		System.out.println();
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return " [ NAME: " + name + ". ACCOUNT NO: " + accountNumber + ". ROUTING NO: " + routingNumber + ". BALANCE: $" + balance + "] ";
	}
	
}
