package ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제2 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수: ");
		int korScore = sc.nextInt();
		
		System.out.print("영어점수: ");
		int engScore = sc.nextInt();
		
		// int avg = (korScore + engScore)/2;
		
		String str = (korScore >= 70 && engScore >=7 ) ? "합격" : "불합격";
		
		// String str = (avg >= 70) ? '합격' : '불합격';
		System.out.print("합격여부: ");
		System.out.print(str);
		
		
	}

}
