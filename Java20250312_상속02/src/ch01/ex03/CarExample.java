package ch01.ex03;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();
		
//		myCar.run(); <= 오류 : 생성하는 개체가 없어서(참조하는 대상 자체가 없어)
		
		myCar.tire = new Tire();
		myCar.run();
		
		myCar.tire = new HankookTire();
		myCar.run();
		
		myCar.tire = new KumhoTire();
		myCar.run();
		
		
	}

}
