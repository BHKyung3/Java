package ex03;

/*
 멤버변수bonus에0을 할당한다.
 멤버변수에 매개변수 bonus값을 할당한다.
 grade의 값이 1이면 
멤버 변수bonus에100더한 후 이 값을 리턴.
 grade의 값이 2이면 
멤버 변수bonus에90더한 후 이 값을 리턴.
 grade의 값이 3이면 
멤버 변수bonus에80더한 후 이 값을 리턴.
 grade의 값이 4이면 
멤버 변수bonus에70더한 후 이 값을 리턴
 */
public class SalaryExpr {

	private int bonus;
	
	public SalaryExpr() {
		this.bonus = 0;
	}
	
	public SalaryExpr(int bonus) {
		this.bonus = bonus;
	}
	
	int getBonus() {
		return bonus;
	}
	
	int getSalary(int grade) {
		
		switch(grade) {
		case 1:
			bonus += 100;
			break;
		case 2:
			bonus += 90;
			break;
		case 3:
			bonus += 80;
			break;
		case 4:
			bonus += 70;
			break;
		}	
		
		return bonus;
	}
}
