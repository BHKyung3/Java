package ch04.ex01;

import java.util.Scanner;

public class WhileExample03 {

	public static void main(String[] args) {
		
		/*
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		
		int number = sc.nextInt();
		
		for(int i = 1; i <= number; i++)
			sum +=i;
		
		System.out.println(sum);
		 */
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("숫자입력: ");
		int number = sc.nextInt();
		int i = 1;
		
		while(i<=number) {
			if(i%2 == 1) // 1부터 number까지 홀수합만 누적
				sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
