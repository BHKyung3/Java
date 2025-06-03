package ex05;

public class LgTV extends TV {
	   
	@Override
	void powerOn() {
		System.out.println("LGTV 전원이 켜졌습니다.");
		}
	void powerOff() {
		System.out.println("LGTV 전원이 꺼졌습니다.");
	   }
	void volumeUp() {
		System.out.println("LGTV 볼륨을 올렸습니다.");
	   }
	void volumeDown() {
		System.out.println("LGTV 볼륨을 내렸습니다.");
	   }
}
