package Example;

public class Example2 {

	public static void main(String[] args) {

		// temp 선언 : 변수의 값을 교환할 때 사용
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println("a: " + a + "," + "b: " + b + "," + "c: " + c);
		// >> tamp 사용 전 표현
		
		int temp = b;
		b = c; c = a;
		System.out.println("a: " + a + "," + "b: " + b + "," + "c: " + c);
		// b = c 값인 30, c와 a는 a 값인 10(b가 먼저 c 값인 30으로 변경되면 그 뒤에?????
		
		// 유니코드 표현 : 44032는 한글로 '가'를 표현, 65는 영어로 'A"를 표현(참고만, 크게 비중을 차지하지 않음)
		char c1 = 'A';
		char c2 = 65;
		char c3 = '가';
		char c4 = 44032;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
	
		
	}

}
