package Example;

public class Example1 {

	public static void main(String[] args) {

		// 변수를 문자열과 결합 후 출력하거나 연산식에 활용할 때
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");
		// >> int = 정수, hour / minute = 변수,  System.out.println = 결과
		
		int tatalMinute = (hour*60) + minute;
		System.out.println("총 " + tatalMinute + "분");
		// >> int = 정수, tatalMinute = 변수
		// 한글 기재 시 따옴표 기재 필수, 공백 기재 필요 시 따옴표 전에 기재 진행
	}

}
