package ch01.ex07;

/* 
 		싱글톤 패턴
 		1. 1번 생성자, 2번 코드, 3번 문장이 반드시 필요함
 		2. 1번, 2번에는 private 기재 필수
 		3. 3번 public 또는 defoure 기재 필요
 		4. 객체는 딱 1개, 외부에서 생성 못하도록 해야함(private 사용)
 		5. 참조 변수 생성
 */

public class Account {
	
	int balance;
	
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
	private static Account ac = new Account(); //객체 생성, 참조 account
//								↑ 2번 코드(정적 필드 선언과 미리 생성된 객체 초기화)
	
	private Account() { //1번 생성자(생성자 선언)
		
	}
	
	static Account getInstance(){ //ac의 참조 변수 Account를 앞에 기재
//			↑ 3번 문장(정적 메소드)
//		static 알페 public 기재 시 같은 프로젝트에 다른 패키지에서 사용 가능
//		미기재 시 같은 패키지에서만 사용 가능.
		return ac;
	}
	
	void setBalance(int balance) {
		
//		if(MIN_BALANCE <= balance <= MAX_BALANCE) 해당 방식은 사용하지 않음.
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) // 변수는 항상 좌측에 기재
		this.balance = balance;
		
	}
	
	int getBalance() {
		return balance;
		
	}

}
