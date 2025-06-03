package ch06.sec07.exam06;

public class Car {
	
	private String brand;
	private String model;
	private String year;
	
/*
 * 	void setBrand(String brand){ //set 외부접근 금지.
		this.brand = brand;
	}
	
	String getBrand() {
		return brand;
	}
*/
	
	Car(){
		this("기아", "K8", "2024"); // this : 자신을 가리키는 것, 생성자 호출 2가지 기능을 가지고 있음.
	}
	Car(String brand){
		this(brand, "그랜저", "2024"); 
	}
	Car(String brand, String model){
		this("brand", "model", "2024"); 
	}
	
	Car(String brand, String model, String year){
		this.brand = brand; //같은 이름이 작성될 경우 어떤 값인지 알 수 없어 본인을 가릐키는 this 기재한다.
		this.model = model;
		this.year = year;
	}

	
	void starEngine() {
//		System.out.println("[" + brand +"] + [" + model + "]의 엔진이 시작되었습니다!");
		System.out.printf("[%s] [%s]의 엔진이 시작되었습니다.\n",brand, model);
	}
	void dispalyInfo() {
		System.out.println("[" + year + "]년식 [" + brand +"] [" + model +"]");
	}
}
