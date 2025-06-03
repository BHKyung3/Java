package ch01.ex02;

public class Person { //클래스 명 -> 첫글자는 대문자
	
/*
  		클래스: 상황에 따라 항목이 달라진다.(병원의 경우 키, 몸무게가 정적 특성이나 학원의 경우 필요 없음.)
  		
 */
//	필드 == 인스턴트 변수
	String name; 
	String phone;
	int age;
//	int kor;
//	int eng;
//	int math;
//	여기까지 필드
	
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
		
		void 나이(int age) {
			System.out.println("나이: " + age);
		}
		void 전화번호(String phone) {
			System.out.println("전화번호: " + phone);
		}
		void 이름(String name) {
			System.out.println("이름: " + name);
	}

}
