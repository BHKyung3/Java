package ex05;

public class SonyTV extends TV {
	
	@Override
	void powerOn() {
		System.out.println("SonyTV 전원이 켜졌습니다.");
		}
	void powerOff() {
		System.out.println("SonyTV 전원이 꺼졌습니다.");
	   }
	void volumeUp() {
		System.out.println("SonyTV 볼륨을 올렸습니다.");
	   }
	void volumeDown() {
		System.out.println("SonyTV 볼륨을 내렸습니다.");
	   }
}
