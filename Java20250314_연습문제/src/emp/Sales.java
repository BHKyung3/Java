package emp;

public class Sales extends Employee implements Bonus {
	
	public Sales() {}
	
	public Sales(String name, int number, String department, int salary){
		super(name, number, department, salary);
	}
	@Override
	public double tax() {
		return getsalary()*0.13; //salary에 13% 징수
	}
	public double getExtraPay() {
//		영업직원에게만 제공되는 추가수당을 리턴한다. salary의 3%금액 리턴
		return getsalary()*0.03;
	}

	@Override
	public void incentive(int pay) {
//		salary에 계산된 인센티브를 가산한다. 인센티브는 pay의 120%이다.(pay가100이면 120을 가산)
		int salary = getsalary(); // 120
		
		salary += pay*1.2; //인센티브는 pay의 80%
		setsalary(salary);
	}
	

}
