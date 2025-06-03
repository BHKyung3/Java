package ch01.ex02_예제;

import ch01.ex02.Car;

public class MianCar {

	public static void main(String[] args) {
		
		Car.runState();
		System.out.println(Car.companyState);
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		Car car4 = new Car();
		Car car5 = new Car();
	}
	
}
