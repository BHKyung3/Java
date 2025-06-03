package Example0305;

import java.util.Scanner;

public class 연습문제02 {

	public static void main(String[] args) {

		/* 
		 while문을 사용하여 키보드로 입려 받을 때 10보다 작을 때만 입력 받을 수 있게 하시오. 
		 10 이상이 출력될 경우 종료되었습니다. 문구가 표시되게 하시오.
		 */
		
		int num;
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while(flag) {
			System.out.println("정수를 입력하세요.: ");
			num = sc.nextInt();
			
			if(num > 10) {
				flag = false;
				System.out.println("종료되었습니다.");
			}
		}
			
		
	}

}
