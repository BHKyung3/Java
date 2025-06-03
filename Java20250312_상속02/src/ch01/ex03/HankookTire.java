package ch01.ex03;

public class HankookTire extends Tire {
	
	@Override //오버라이드가 있을 경우 불러오는 값은 가장 최근 값으로 불러온다.
	public void roll() {
		System.out.println("한국 타이거가 회전합니다.");
	}

}
