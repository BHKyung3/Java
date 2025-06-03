package ch04.ex01;

import java.util.Scanner;

public class ForExam03 {

	public static void main(String[] args) {

		/*
		 키보드 숫자 입력 받는다.
		 5 --> 1~5 누적합 15
		 10 --> 1~10 누적합 55
		 100 --> 1~100 누적합 5050
		 */
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		
		int number = sc.nextInt();
		
		for(int i = 1; i <= number; i++)
			sum +=i;
		
		System.out.println(sum);
		
		
		
		
	}

}
