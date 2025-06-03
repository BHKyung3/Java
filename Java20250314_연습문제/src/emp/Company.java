package emp;

public class Company {
	
	public static void main(String[] args) {
//		Employee [] employees = new Employee[5];
//		employees[0] = new Secretary("Duke", 1, "secretary", 800);
//		employees[1] = new Sales("Tuxi", 2, "sales", 1200); ↓ 아래 내용과 동일하나 표현방식 다름
		
	// Employee 배열에 객체들을 생성하여 저장한다. 
		Employee [] employees = {
				new Secretary("Duke", 1, "secretary", 800),
				
				new Sales("Tuxi", 2, "sales", 1200)
				};//위에 내용과 같음
		
	// printEmployee()  메서드를 호출하여 Employee 배열의 객체들 정보를 출력한다.(이 때는 세금을 출력하지 않는다.)
		System.out.println("name\tdepartment\tsalary\t    extra pay");
		System.out.println("--------------------------------------------------------");
		Company.printEmployee(employees, false);
		
	// 모든 직원에게 인센티브로 100씩 지급한다.(직원에 따라 적용되는 인센티브 금액은 다르다.
		for(Employee emp : employees) {
			if(emp instanceof Bonus) { // emp가 참조하는 대상이 Bonus를 구현한 객체니?
//				Bonus bonus = (Bonus)emp;
//				bonus.incentive(100); 아래 표현 방식과 동일
				
				((Bonus)emp).incentive(100);
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("[인센티브 100 지급]");
	// printEmployee()  메서드를 호출하여 Employee 배열의 객체들 정보 와 세금을 출력한다.
		System.out.println("name\tdepartment\tsalary \t      tax\textra pay");
		System.out.println("--------------------------------------------------------");
		Company.printEmployee(employees, true);
	}
	public static void printEmployee(Employee[] emp, boolean isTax) {
			// 객체의 정보를 출력한다.(실행 결과를 참조) 
			// isTax 의 참/거짓 여부에 따라서 텍스 출력 여부를 결정하여 처리한다.
			
		
		
//		for(int i=0; i<emp.length; i++) {
//			System.out.println(emp[i].getName() + "\t\t" + emp[i].getDepartment() + "\t\t" + emp[i].getsalary());
//		}
		
		for(Employee e : emp) {
			System.out.printf("%-8s%-10s%10d", e.getName(), e.getDepartment(), e.getsalary());
			
			if(isTax) {
				System.out.printf("%15.1f", e.tax());
			}
			
			if(e instanceof Sales) {
				Sales s = (Sales)e;
				System.out.printf("%12.1f", s.getExtraPay());
			}
			System.out.println();
		}

		
	}

}
