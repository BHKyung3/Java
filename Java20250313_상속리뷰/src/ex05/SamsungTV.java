package ex05;

public class SamsungTV extends LgTV {

	@Override
	void powerOn() {
		System.out.println("SamsungTV 전원이 켜졌습니다.");
		}
	void powerOff() {
		System.out.println("SamsungTV 전원이 꺼졌습니다.");
	   }
	void volumeUp() {
		System.out.println("SamsungTV 볼륨을 올렸습니다.");
	   }
	void volumeDown() {
		System.out.println("SamsungTV 볼륨을 내렸습니다.");
	   }
}