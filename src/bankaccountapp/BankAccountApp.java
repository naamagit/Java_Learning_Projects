package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
        
		List<Account> accounts = new LinkedList<Account>();
		// Read a CSV file then create new accounts based on that data

		String file = "C:\\java\\JavaPractice\\JavaProjects\\NewBankAccounts.csv";
		List<String[]> newAccountHoldes = utilities.CSV.read(file);
		for (String[] acountHolder : newAccountHoldes) {
			String name = acountHolder[0];
			String sSN = acountHolder[1];
			String accountType = acountHolder[2];
			double initDeposit = Double.parseDouble(acountHolder[3]);
			if (accountType.equals("Savings")) {
				accounts.add(new Saving(name, sSN, initDeposit));
			} else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, sSN, initDeposit));
			} else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}

		}
		// test one element 
		//accounts.get(4).showInfo();
		for (Account acct : accounts) {
			System.out.println("******************");
			acct.showInfo();
		}
	}
	

}
