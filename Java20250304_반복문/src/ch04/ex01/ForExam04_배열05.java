package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열05 {

	public static void main(String[] args) {
// 7명의 점수를 입력 받아서, 총점 / 평균 구하기
		
		Scanner sc = new Scanner(System.in); // 키보드 데이터 입력 시 꼭 필요
// 예시 >> int num = 0;
		
		int [] num = new int [] {10, -3, -700, 1, 2, 9, 3}; // 점수를 기재할 경우 따로 키보드로 기재하지 않아도 됨
		int sum = 0; 
		double average = 0;
		int max = num[0]; // 변수 초기값(변경 가능) : 최소값, 최대값 구하기 위해서는 해당 값 표기하기
		int min = num[0];
		
		for(int i = 0; i < 7; i++) { // 몇 명이 들어가는지 명수를 기재
		
			sum += num[i]; // for 함수 + 몇 명까지 더할껀지 확인이 필요하기에 기재
		}
			
			average = sum / 7.0; // 평균을 구하는 공식
			System.out.printf("총점 : %d, 평균 : %.1f\n", sum, average); // 표기 소수점 표기를 위해 printf로 기재
			System.out.println("7번째 값 출력: " + num[6]); // 점수 중 몇 번째 사람의 점수만 보려고 표기할 때
			
			System.out.println("-----------------------------------");
//			max : {-1, -3, -700, 1, 2, 9, 3} : 최소값보다 큰 값이 기재되어야함
			for(int i = 0; i < 7; i++) {
				if(max < num[i])
					max = num[i];
				
//		    min : int min = 0;으로 기재할 경우 0보다 작은 값은 없음으로 출력이 0으로 됨, 출력을 원할 경우 최대값보다 큰 값으로 기재 필요
		    if(min > num[i])
				min = num[i];	
				}
			
			System.out.println("최대값: " + max);
			System.out.println("최소값: " + min);
			
			System.out.println("-----------------------------------");
/*
 {-1, -3, -700, 1, 2, 9, 3}
 키보드 : 1입력하면, 출력 : 1값은 4번째 위치 입니다.
 키보드 : -3입력하면, 출력 -3값은 2번째 위치 입니다. 
 반복문, 조건문 이용
 */
			
			int index = -10;
			System.out.println("찾을 숫자: ");
			int numA= sc.nextInt();
			
			for(int i = 0; i < 7; i++) {
				if(numA == num[i]) {
					index = i;
				}					
			}
			if(index != -10)
				System.out.printf("%d값은 %d번째 위치입니다.\n", numA, index + 1);
			else
				System.out.printf("%d값은 찾을 수 없습니다.\n", numA);
			
			/* 위와 같은 표현방식이나 표기가 다름
			 * if(index == -1)
			 *   sysout ('%d값은 찾을 수 없습니다.\n', numA
			 *   else
			 *   sysout('%d값은 %d번째 위치입니다.\n' numA, index + 1);
			 */
		System.out.println("---------------------------------");
/*
  		{10, -3, -700, 1, 2, 9, 3}
  		정렬(sort)해서 출력하기 .... -700, -3, 1, 2, 3, 9, 10
 */
		
		
	}

}
