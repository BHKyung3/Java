package Example0304;

public class p39 {

	public static void main(String[] args) {

//		변수를 문자열과 결합 후 출력하거나 연산식에서 활용
		
		int hour = 6;
		int minute = 54;
		System.out.println(hour + "시간" + " " + minute + "분");
		
		int total = (hour*60) + minute;
		System.out.println(total + "분");
		
//      문제1) **씨의 근무 시간과 총 근무 분을 구하여라, 출근 09시 30분 / 퇴근 19:00 / 점심시간 1시간
		
		int hour1 = 9; //출근
		int minute1 = 30;
		
		int hour2 = 19; //퇴근
		int hour3 = 1; //점심시간
		
		// System.out.println((hour2-hour1)-hour3 );
		
		int totalhour = (hour2-hour1)-hour3;
		System.out.println(totalhour);
		
		System.out.println(totalhour + "시간" + " " + minute1 + "분");
		
		int totalMinute = (totalhour*60 + minute1);
		System.out.println("총" + totalMinute + "분" );
	}

}
