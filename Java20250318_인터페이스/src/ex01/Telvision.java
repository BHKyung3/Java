package ex01;

// 		인터페이스를 상속할 때는 implements(구현한다) 기재
// 		RemoteControl 클래스에 추상메소드 갯수에 따라 구현 갯수를 똑같이 맞춰야함

public class Telvision implements RemoteControl {
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}
}
