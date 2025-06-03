package ex05;

/* 
매소드 4개
전원 키고, 끄는 기능
사운드 올리고, 내리는 기능 담당하는 메소드

		클래스 내부에 추상글래스가 1개 이상 존재하면 그 클래스는 추상클래스이다.
		추상클래스를 상속한 클래스는 중괄호를 반드시 채워넣어야한다.
		(추상클래스 : TV // 상속한클래스 : LgTV, SamsungTV, SonyTV
		추상클래스는 미완성 클래스로 추출값 확인 불가(뼈대만 제공)
		사용용도 : 클래스의 메소드를 반드시 재정의를 해야할 때 사용하는 것이 좋다. 그렇지 않다면 사용하지 않아도 무관
*/

public abstract class TV {
	
	boolean power;
	int volume;
	
	TV(){
		power = false;
		volume = 0;
	}
//	추상클래스(abstract) -> {}가 없다.
	abstract void powerOn();
		
	abstract void powerOff();
	
	abstract void volumeUp();
		
	abstract void volumeDown();
	
//	추상클래스 안에 일반클래스가 존재할 수 있다.(재정의 여부는 각자 알아서 생각하기)
//	추상클래스 : 객체 생성은 불가하나 참조는 가능하다.

}
