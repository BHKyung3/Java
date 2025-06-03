package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열04 {

	public static void main(String[] args) {
// 7명의 점수를 입력 받아서, 총점 / 평균 구하기
		
		Scanner sc = new Scanner(System.in); // 키보드 데이터 입력 시 꼭 필요
		
		int[] num = new int [7]; // 1개의 방에 몇 명이 들어 갈껀지 []에 기재
		int sum = 0;
		
		for(int i = 0; i < 7; i++) { // 몇 명이 들어가는짐 명수를 기재
		
			System.out.println(i+1 + "번학생 자바점수: "); 
			num[i] = sc.nextInt(); // 키보드 데이터 입력 시 꼭 필요
			sum += num[i]; // for 함수 + 몇 명까지 더할껀지 확인이 필요하기에 기재
			
		}
			
			double average = sum / 7.0; // 평균을 구하는 공식
			
			System.out.printf("총점 : %d, 평균 : %.2f\n", sum, average); // 표기 소수점 표기를 위해 printf로 기재
			
			
	}

}
