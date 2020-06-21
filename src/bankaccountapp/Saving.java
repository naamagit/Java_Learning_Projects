package bankaccountapp;

public class Saving extends Account {
	//list properties specific to the Saving accounts
	 private int safetyDepositBoxID;
	 private int safetyDepositBoxKey;
    
	 
	//constructor to initialize setting for the saving properties 
	public Saving(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
		
	}
	private void setSafetyDepositBox() {
		this.safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
		this.safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	//list any methods specific to saving accounts
    public void showInfo() {
    	super.showInfo();
    	System.out.println("Your Saving Account Features: " +
    	"\n Safety Deposit Box ID " + safetyDepositBoxID +
    	"\n Safety Deposit Box Key " + safetyDepositBoxKey);
    }
	
}
