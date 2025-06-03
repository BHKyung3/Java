package ch06.sec07.exam05;

public class Car {
	
	/*
	 요구사항
	 1. brand(브랜드), model(모델명), year(연식)을 필드로 가짐.
	 2. 생성자를 통해 brand(브랜드), model(모델명), year(연식) 설정할 수 있음.
	 3. 
	 */
	
	private String brand;
	private String model;
	private String year;
	
	Car(){}
	
	public Car(String brand, String model, String year){
		this.brand = brand;
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
