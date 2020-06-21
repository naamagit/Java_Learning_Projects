package bankaccountapp;

public abstract class Account implements IBaseRate {
	// list common properties for saving / checking account
	private String name;
	private String sSN;
	private double balance;
	public static int z;

	private static int index = 10000;
	protected String accountNumber;
	protected double rate;

	/*
	 * String accountType; String initialDeposit;
	 */

	// constructor to set base properties and to inialize the account
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		// set account number
		index++;
		this.accountNumber = setAccountNumber();
		setRate();
	}
    public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * 1000);
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	public void calculateCompoundInterest() {
		double accruedInterest = balance * (rate/100);
		balance += accruedInterest;
		System.out.println("Accrued Interest: $" + accruedInterest);
		printBalance();
	}
   // List common methods - transactions
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}

	public void transfer(String toWhere, double amount) {
		balance -= amount;
		System.out.println("Transfering $" + amount + " to " + toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is now: $" + balance);
	}

	public void showInfo() {
		System.out.println("NAME: " + name + "\nACCOUNT NUMBER: " + accountNumber + 
				"\nBALANCE: " + balance + 
				"\nRATE: " + rate +"%");
	}

}
