package day5;

public class Hacker {

	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		
//		account.password = "1234";
		if ("이상훈".equals(account.owner)) {
			account.owner = "어나니머스";	
		}
		
		
//		account.amount = 10;
		account.setPassword("1234");
		account.setAmount(100);
		System.out.println("password : " + account.getPassword());
		System.out.println("amount : " + account.getAmount());		
//		System.out.println("password : " + account.password);
//		System.out.println("owner : " + account.owner);
//		System.out.println("amount : " + account.amount);
	}
}
