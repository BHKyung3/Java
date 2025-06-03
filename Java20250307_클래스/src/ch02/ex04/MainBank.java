package ch02.ex04;

public class MainBank {

	public static void main(String[] args) {

		BankAccount b1 = new BankAccount("홍길동", 10000); //객체생성, 잔고 10000원
		
		
		b1.deposit(10000);
		b1.withdraw(1000000); //100만원 인출, 잔액부족으로 처리 불가
		b1.withdraw(2000);
		
		System.out.println(b1.getBalance());
		
		
	}

}
