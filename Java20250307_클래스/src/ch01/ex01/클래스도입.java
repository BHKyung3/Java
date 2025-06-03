package ch01.ex01;

public class 클래스도입 {

	public static void main(String[] args) {

		/*
		 		이름, 나이, 국어, 영어, 수학점수 입력 받기 -> 정적 특성(정해져 있음) : 변수로 만든는 편
		 		공부하기, 시험보기, 등교하기 -> 동적 특성(정해져 있지 않음) : 함수로 만드는 편
		 */
		
		String name = "까미"; //까미 -> 스택, phone/age/kor -> 힙
		String phone = "010-1111-2222";
		int age, kor, eng, math;
		age = 20;
		kor = 90;
		eng = 80;
		math = 77;
		
		공부하기(name);
		시험보기(kor, eng, math);
		등교하기(name);
		
		System.out.println("-----------------------------");
		
		String name2 = "로이";
		String phone2 = "010-1111-2222";
		int age2, kor2, eng2, math2;
		age2 = 30;
		kor2 = 50;
		eng2 = 40;
		math2 = 75;
		
		공부하기(name2);
		시험보기(kor2, eng2, math2);
		등교하기(name2);
		
	}

	public static void 공부하기(String name) {
		System.out.println(name + " 공부하기");
	}
	public static void 시험보기(int kor, int eng, int math) {
		int sum = kor + eng + math;
		System.out.println("세 과목 합: " + sum);
	}
	public static void 등교하기(String name) {
		System.out.println(name + " 등교하기");
	}
}
