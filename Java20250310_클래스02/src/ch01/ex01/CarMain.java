package ch01.ex01;

public class CarMain {

	public static void main(String[] args) {

		Car car1 = new Car(); //해당 값이 있어야 불러올 수 있음(괄호 안 아무것도 기재되어 있지 않아 값은 뜨지 않음)
		car1.displayInfo();
		System.out.println();
		
		Car car2 = new Car("기아", "KB", "흰색", 200); //해당 값이 있어야 불러올 수 있음
		car2.displayInfo();
		System.out.println();
		
		Car car3 = new Car("현대", "소나타");
		
		car3.setColor("흰색");
		System.out.println(car3.getCompany());
		
		car3.displayInfo();
		
		System.out.println();	
		
	}

}
