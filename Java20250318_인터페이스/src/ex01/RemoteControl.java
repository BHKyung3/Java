package ex01;

public interface RemoteControl {
	
/*	일반메소드 기재 불가(오류발생), 인터페이스는 객체 생성 불가
	객체를 생성하려면 상속을 받아야한다.
	멤버변수는 생성이 불가하다.
	정적변수만 생성 가능하다.
	인ㅌ
*/
	
//	추상메소드
	public void turnOn();
	void turnOff();
	void setVolume(int volume);
	
//	int(모든값) 앞에 "public static final" 이 기재되어 있지 않아도 필수 값으로 기재되어 있다고 생각해야함
	int MAX_VOLUME = 10;
	
/*	인터페이스를 수정(추가)하면 인터페이스를 상속하고 있는 클래스는 오류가 발생한다.
	클래스가 다수일 경우 오류가 발생되면 수정하기 힘들기 때문에 아래와 같이 "default 메소드"를 사용한다.
	default 메소드 : 재정의 해도 되고 안해도 되는 상태로 만드는것(일반 클래스에서는 사용 불가)
*/	
	default void 신기능() {
		
	}
}
