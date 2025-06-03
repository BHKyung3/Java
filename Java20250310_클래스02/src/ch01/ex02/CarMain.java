package ch01.ex02;

public class CarMain {

	public static void main(String[] args) {
		
//		정적 메소드를 객체에 생성하지 않고 클래스명, 정적메소드(정적 변수명) 명으로 실행 가능.
		Car.runState();
		System.out.println(Car.companyState);

		Car car1 = new Car();
		car1.displayInfo();
		car1.runState();
		System.out.println();
		
		Car car2 = new Car("기아", "KB", "흰색", 200); //해당 값이 있어야 불러올 수 있음
		car2.displayInfo();
		car2.runState(); //runState 정적 메소드로 인지 가능
		System.out.println();
		
//		Random random = new Random();
		
		
	}

}
