package ch01.ex03;

public class Person { //클래스 명 -> 첫글자는 대문자
	
/*
  		클래스: 상황에 따라 항목이 달라진다.(병원의 경우 키, 몸무게가 정적 특성이나 학원의 경우 필요 없음.)
  		
 */
//	필드 == 인스턴트 변수
	private String name; // private 외부 접근을 금지한다는 의미, 인스턴트 변수에는 반드시 private 작성한다.
	private String phone;
	private int age;
//	int kor;
//	int eng;
//	int math;
//	여기까지 필드
	
	/*
	 생성자 역할 : 값 초기화
	 */
	
	public Person(String n, int a, String p) {
		name = n;
		age = a;
		phone = p;
	}
	
//	디폴트 생성자
	public Person() { //외부에 접근을 허용한다.
		System.out.println("void Person()");

	}
	
	
//  메소드, 인스턴트 메소드
/*
  	void 공부하기(String name) {
  System.out.println(name + " 공부하기");
	}
	void 시험보기(int kor, int eng, int math) {
		int sum = kor + eng + math;
		System.out.println("세 과목 합: " + sum);
	}
	void 등교하기(String name) {
		System.out.println(name + " 등교하기");
 */
	

//	여기까지 메소드
		
		void 나이() {
			System.out.println("나이: " + age);
		}
		void 전화번호() {
			System.out.println("전화번호: " + phone);
		}
		void 이름() {
			System.out.println("이름: " + name);
	}

}
