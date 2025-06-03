package ex01;

public class Otab extends Mobile {
	
	public Otab() {}
	
	public Otab(String mobileName, int batterySize, String osType) { 
		super(mobileName, batterySize, osType);
	}
//	사용을 통해 배터리 감소 구현 -> 배터리 1분 사용 시 12 감소
	@Override
	public void operate(int time) {
		
	}
//	충전을 통해 배터리 증가 구현 -> 배터리 1분 충전 시 8 증가
	@Override
	public void charge(int time) {
		int size = getBatterySize();
		size += time*8;
		setBatterySize(size);
	}
}
