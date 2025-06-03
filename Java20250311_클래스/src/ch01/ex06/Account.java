package ch01.ex06;

/* 
 책 6장 확인 문제 19번
 */

public class Account {
	
	int balance;
	
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
	void setBalance(int balance) {
		
//		if(MIN_BALANCE <= balance <= MAX_BALANCE) 해당 방식은 사용하지 않음.
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) // 변수는 항상 좌측에 기재
		this.balance = balance;
		
	}
	
	int getBalance() {
		return balance;
		
	}

}
