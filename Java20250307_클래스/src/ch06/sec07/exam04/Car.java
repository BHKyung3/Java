package ch06.sec07.exam04; //패키지 선언

public class Car { //클래스 선언, 클래스명 Car(공개클래스)
	
	String company = "현대자동차"; //필드선언
	String model;
	String color;
	int maxSpeed;
	
	Car(){} //생성자선언
	
	Car(String model){ //생성자
		this.model = model;
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
// 필드선언, 생성자선업, 생성자 작성 필요.
//	생성자, set를 통해서 넣는게 좋음.
}
