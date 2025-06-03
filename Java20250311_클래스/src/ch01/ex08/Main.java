package ch01.ex08;

public class Main {

	public static void main(String[] args) {

		A aa = new A();
		aa.funcA();
		
		B bb = new B(); // 1번 객채 셍성
		
		B b2 = new B("지리산", 50, "전라남도 남원시");
		b2.info();
		
	}
}
