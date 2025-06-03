package test_실습;

public class TVTest {

	public static void main(String[] args) {
		
//		SaleTV, RentalTV 클래스의 객체를 각각 생성한다. 
		SaleTV saletv = new SaleTV("SALETV-1", 40, 1, 300000);
		RentalTV rentaltv = new RentalTV("RENTALTV-10 ", 42, 1, 100000);
		
//		SaleTV 객체는 채널을 두 개 높인다.
		saletv.channelUp(); // TV class 참고(1 -> 2 -> 3)
		saletv.channelUp();
		
//		RentalTV 객체는 채널을 세 개 내린다. 
		rentaltv.channelDown(); // TV class 참고(1 -> 10 -> 9 -> 8)
		rentaltv.channelDown();
		rentaltv.channelDown();
		
//		각 객체에 대하여 printAllTV()을 호출한다.
		printAllTV(saletv); // printAllTV() 메서드 호출
		printAllTV(rentaltv);
		
//		Rentable 타입의 객체인 RentalTV 객체는 printRentalTV() 를 호출한다.
		printRentalTV(rentaltv);
		
	}
//	instanceof => Java에서 객체가 특정 클래스의 인스턴스인지 확인할 때 사용하는 연산자
	static void printAllTV(TV tv) {
		if(tv instanceof SaleTV) {
			tv = (SaleTV)tv;
			System.out.println(((SaleTV)tv).toString());
			((SaleTV)tv).play();
			((SaleTV)tv).sale();
		} else if(tv instanceof RentalTV) {
			tv = (RentalTV)tv;
			((RentalTV) tv).play();
			System.out.println(((RentalTV)tv).toString());
		}
	}

	static void printRentalTV(RentalTV tv) {
		tv.rent();
	}

}
