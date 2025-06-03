package ch02.ex04;

public class BankAccount { 
/*    public를 붙일 수 있고 안붙일 수 있다.(2가지 경우만 있음)
      public이 기재되어 있을 경우 외부 패키지에서도 사용이 가능하다. 
      public 제외할 경우 같은 패키지에서는 사용 가능하나, 외부 패키지에서는 사용 불가하다.
	  1개의 파일에 class는 1개만 사용한다.(다수 작성은 가능)
	  다수의 class가 있을 경우 public은 1곳에만 기재할 수 있다.
	  파일명은 public가 기재되어 있는 class 명을 기재해야하고, 2개 이상의 class가 있으나,
	  public이 기재되어 있지 않는 경우는 파일명을 어떻게 사용하던 상관 없다.
	*/
	private String owner;
	private double balance;
	
	public BankAccount() {} //디폴트 생성자
	
	public BankAccount(String ower,double balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("잔액 부족");
		}else {
			balance -= amount;
		}
	}

}
