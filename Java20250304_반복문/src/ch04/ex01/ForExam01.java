package ch04.ex01;

public class ForExam01 {

	public static void main(String[] args) {

		/* 
		 1~5까지 합구하기
		 반복문
		 * for, while > 조건을 만족하는 순간까지 계속 반복(while 보다 for를 더 많이 사용함.)
		    for > 반복 횟수를 알 때
		    for은 초기; 조건; 증가(또는감소) 항목으로 이뤄짐
		    while > 몇 번 반복하는지 모를 때
		 * do~while > 조간을 만족하는 순간까지 계속 반복(단, 최소 1회는 보장)
		 */
		
		int sum = 0; // sum은 0
		
		for(int i=1; i <= 5; i++) { // i=1 초기값, i <= 5 조건, i++ 증가
			sum += i;
		}
		
		System.out.println("sum = " + sum);
	}

}
