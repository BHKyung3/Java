package ch01.ex03;

public class CarMain {
	
	static int speed;

	void run() {
		speed = 100; // 메인 메소드 밖에서는 사용 가능
	}

	public static void main(String[] args) {
		
		CarMain car = new CarMain(); // 반드시 객체를 넣어주어야함
		speed = 200; //메인 메소드 안에서는 사용 불가 사용하려면 ↑

		
	}

}
