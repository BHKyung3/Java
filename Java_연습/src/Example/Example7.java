package Example;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		
		// 5명의 점수를 입력 받아서, 총점 / 평균 구하기
// 1번 방법
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번학생 점수: ");  // 키보드에 입력하겠다는 의미
		int a = sc.nextInt();
		System.out.println("2번학생점수: ");
		int b = sc.nextInt();
		System.out.println("3번학생 점수: ");
		int c = sc.nextInt();
		System.out.println("4번학생 점수: ");
		int d = sc.nextInt();
		System.out.println("5번학생 점수: ");
		int e = sc.nextInt();
		
		int total = a + b + c + d + e;
		double g = total / 5.0;
		
		System.out.printf("총 점수는 %d, 평균은 %.2f\n", total, g); // 왜 f를 사용하는가..
		
// 2번 방법
		int[] num = new int[5];
		System.out.println("1번학생 점수: ");
		num[0] = sc.nextInt();
		System.out.println("2번학생점수: ");
		num[1] = sc.nextInt();
		System.out.println("3번학생 점수: ");
		num[2] = sc.nextInt();
		System.out.println("4번학생 점수: ");
		num[3] = sc.nextInt();
		System.out.println("5번학생 점수: ");
		num[4] = sc.nextInt();
		
		int total1 = a + b + c + d + e;
		double g1 = total / 5.0;
		
		System.out.printf("총 점수는 %d, 평균은 %.2f\n", total1, g1);
// 3번 방법
		int[] num1 = new int[5];
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i+1 + "번학생 점수: ");
			num[i] = sc.nextInt();
			sum += num[i];
		}
		int total2 = a + b + c + d + e;
		double g2 = total / 5.0;
		
		System.out.printf("총 점수는 %d, 평균은 %.2f\n", total2, g2);
	}

}
