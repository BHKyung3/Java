package ex01;

public class RemoteTest {

	public static void main(String[] args) {
		
//		객체 생성 시 앞에는 부모클래스를 기재하는 것이 좋음(자녀클래스는 부모클래스를 상속하고 있기 때문)
		RemoteControl remote = new Radio();
		
		remote.turnOn();

		
	}

}
