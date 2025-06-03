package ch01.ex07;

public class MainAccount {

	public static void main(String[] args) {

		Account acc = Account.getInstance(); //정적 메소드 호출
		acc.setBalance(100);
		
		System.out.println(acc.getBalance());
		
		Account acc2 = Account.getInstance();		
		System.out.println(acc2.getBalance());
	}

}
