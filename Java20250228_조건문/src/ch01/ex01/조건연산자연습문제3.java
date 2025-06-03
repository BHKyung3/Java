package ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제3 {

	public static void main(String[] args) {

		// 국어점수가 80점 이상이면 상 60점 이상이면 중 60점 미만이면 하
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수: ");
		int korScore = sc.nextInt();
		
		// (조건) ? "나타내는값"
		String result = (korScore >= 80) ? "상" : 
			            (korScore >= 60) ? "중" : "하";
		
		System.out.println(result);
	}

}
