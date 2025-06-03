package Example0305;

import java.util.Scanner;

public class p73 {

	public static void main(String[] args) {
		
//		키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.

		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.println("정수입력: ");
		int a = sc.nextInt();
		
		System.out.println("정수입력: ");
		int b = sc.nextInt(); // nextInt: 숫자 입력, nextLine: 문자/공백 입력
		
		System.out.println("두 수의합: " + (a+b));
		
		sc.nextLine(); // nextInt와 nextLine는 같이 사용할 수 없다. Int가 개행문자(Enter)를 제거하지 않기 때문에. 같이 사용하려면 sc.nextLine(); 중간에 기재하면 사용 가능하다.
		
		System.out.print("입력: ");
		str = sc.nextLine();
		
		System.out.println(str);
		
	}

}
