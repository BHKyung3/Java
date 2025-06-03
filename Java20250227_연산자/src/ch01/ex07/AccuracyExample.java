package ch01.ex07;

public class AccuracyExample {

	public static void main(String[] args) {
		
		int apple = 10;
		int totalPieces = apple * 10;
		int number = 7;
				
		int result = totalPieces - number;
		System.out.println("10조각에서 남은 조각: " + result);
		System.out.println("사과 1개에서 남은 양: " + result/10.0);
		
		// 위에 내용은 정수를 실수로 변환 진행 함
		
		int b = 20;
		int v = b * 50;
		
		
		// ing = 1000-40
		int Result = v - (b*2);
		
		System.out.println("결과: " + Result);
		
		
	}

}
