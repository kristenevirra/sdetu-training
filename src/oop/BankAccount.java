package oop;

public class BankAccount implements IRate{
	//Define variables
	String accountNumber;
	
	//static >> belongs to the CLASs not the object instance
	//final>> constant (often static final)
	private static final String routingNumber = "013546";
	
	//Instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	
	//Constructor definitions: unique methods
	//1. They used to define / setup / initialize properties of an object
	//2. Constructors are IMPLICITY called upon instantiation
	//3. The same name as the class itself
	//4. Constructor have No return type
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
		
	}
	//Overloading : call same method name with different arguments
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);	
	}
	
	BankAccount(String accountType, double initDeposit){
		//initDeposit, accountType, Msg are all local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $  " + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			 Msg = " ERROR: Minimum deposit must be at least $1,000";
		}else {
			 Msg = "Thanks for your initial deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	// Getter/ Setter
	
	// allow the user to define sa name
	public void setName(String name) {
		this.name = "Mr." + name;
	}
	public String getName() {
		return name;
	}
	

	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
		
	}
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	
	//Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
		
		
	}
	void withdraw(double amount) {
		balance =  balance + amount;
		showActivity("WITHRAW");
		
	}
	
	//Private:can only called from within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
		
	}
	
	void checkBalance() {
		System.out.println("balance " + balance);
		
	}
	void getStatus() {
		
	}
	@Override
	public String toString(){
		return"[ Name:" + name + ". ACCOUNT#" + accountNumber + ". ROUTING #" + routingNumber + ". BALANCE: $" + balance +" ]";
	}
}

