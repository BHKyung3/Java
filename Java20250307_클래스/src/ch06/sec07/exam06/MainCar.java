package ch06.sec07.exam06;

public class MainCar {

	public static void main(String[] args) {
		
		Car car1 = new Car(); //반드시 객체 생성.
		car1.dispalyInfo(); 
		
		Car car2 = new Car("현대");
		car2.dispalyInfo();
		
		Car car3 = new Car("기아", "K9");
		car3.dispalyInfo();

		Car car = new Car("기아자동차", "K8", "2023");
		
		car.starEngine();
		
		car.dispalyInfo();
	}

}
