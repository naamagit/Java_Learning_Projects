package bankaccountapp;

public class Checking extends Account {
	//list specific properties to  checking account : debit card & pin 
	 private long debitCardNumber;
	 private int debitCardPIN;
	//constructor to initialize specific account properties 
	  public Checking(String name, String sSN, double initDeposit) {
		  super(name, sSN, initDeposit);
		  accountNumber = "2" + accountNumber;
		  setDebitCard();
		 
	  }
	  @Override
	  public  void setRate() {
		  rate = getBaseRate() * 0.15;
	  }
	
	// list specific methods to the checking account 
	private void setDebitCard() {
		this.debitCardNumber = (long) (Math.random() * Math.pow(10, 12));
		this.debitCardPIN = (int)(Math.random() * Math.pow(10, 4));
		
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Features :" +
		"\nDebit Card Number " + debitCardNumber + 
		"\nDebit Card PIN " + debitCardPIN);
	}

}
