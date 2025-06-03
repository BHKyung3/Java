package ex08;

import ex08.Mobile;

public class Ltab extends Mobile {
	
public Ltab() {}
	
	public Ltab(String mobileName, int batterySize, String osType) { 
		super(mobileName, batterySize, osType);
	}
//	사용을 통해 배터리 감소 구현 -> 배터리 1분 사용 시 10 감소
	@Override
	public void operate(int time) {
		int size = getBatterySize();
		size += time*-10;
		setBatterySize(size);
	}
//	충전을 통해 배터리 증가 구현 -> 배터리 1분 충전 시 10 증가
	@Override
	public void charge(int time) {
		int size = getBatterySize();
		size += time*10;
		setBatterySize(size);
	}
}
