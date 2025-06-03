package ex05;

public class MainTv {

	public static void main(String[] args) {

		TV tv = new SamsungTV();
		
		tv.powerOn();
		tv.powerOff();
		
		tv.volumeUp();
		tv.volumeDown();
	}

}
