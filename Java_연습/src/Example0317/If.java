package Example0317;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

//		정수 한 개를 입력받아서, 그 수가 50 이상의 수이면 잘했어요 인지 50미만의 수면 노력해요를 표기하자.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수입력: ");
		int num = sc.nextInt();
		
		if (num > 50) {
			System.out.println("참잘했어요");
		} else {
			System.out.println("노력해요");
		}
	}

}
