package ch01.ex06;

public class MainAccount {

	public static void main(String[] args) {

		Account account = new Account();
		Account account1 = new Account();
		Account account2 = new Account();
		Account account3 = new Account();
		
		account.setBalance(10000);
		System.out.println("현재잔고: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재잔고: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재잔고: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재잔고: " + account.getBalance());
		
		
		
		
	}

}
