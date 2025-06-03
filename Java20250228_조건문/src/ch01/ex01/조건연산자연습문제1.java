package ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수: ");
		int korScore = sc.nextInt();
		
		//조건 ? 참 : 거짓
		String str = (korScore >= 70) ? "합격" : "불합격";
		
		System.out.println(str);
		
		
		
		
		
	
	}

}
