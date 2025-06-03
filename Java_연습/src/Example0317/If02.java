package Example0317;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {

//		정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수입력: ");
		int num = sc.nextInt();
		
		if(num % 3 == 0) {
			System.out.println("맞아요");
		} else {
			System.out.println("아니예요");
		}
	}
}
