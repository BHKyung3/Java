package ex06;

/*
 		추상클래스
 */

public abstract class Animal {

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); //추상 메소드 선언
}
