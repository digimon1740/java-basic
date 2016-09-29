package day5;

public class Atm {

	
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		if ("이상훈".equals(account.owner)) {
			account.owner = "어나니머스";	
		}
	}
}
