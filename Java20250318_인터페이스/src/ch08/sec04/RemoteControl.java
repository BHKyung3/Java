package ch08.sec04;

public interface RemoteControl {
	
//	상수필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 5;
	
//	추상메소드
	void trunOn();
	void trunOff();
	void setVolume(int volume);

}
