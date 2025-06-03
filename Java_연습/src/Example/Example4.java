package Example;

public class Example4 {

	public static void main(String[] args) {

		// 정수 타입 변환 후 연산하기
		byte a = 10;
		byte b = 20;
		int resu = a + b;
		System.out.println("값: " + resu);
		
		// 결합 연산
		String g = "100" + (2 + 98);
		System.out.println("result: " + g);
		
		int h = 10;
		int t = 100;
		int i = 200;
		int u = 300;
		
		System.out.printf("값: ");
		System.out.println(u + t);
		System.out.printf("값: ");
		System.out.print(h + i);
		// int 정수를 덧샘으로 사용하려면 한글이 동시에 들어가서는 불가
		// 띄어서 사용하려면 값을 기재한 언어를 수정해야함(예시로 : System.out.printf('값: ');
		
		
		
	}

}
