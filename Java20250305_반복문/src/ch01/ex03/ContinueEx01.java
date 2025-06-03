package ch01.ex03;

import java.util.Scanner;

public class ContinueEx01 {

	public static void main(String[] args) {
		
//		1~100사이에서 홀수 합 구하기

		int sum = 0;
		
		for(int i=0; i<=100; i++) {
			if(i%2 == 1) //홀수인 경우
			sum += i;
		}
		System.out.println(sum);
		System.out.println();
		
		int sum2 = 0;
		for(int i=0; i<=10; i++) {
			
			if(i%2 == 0) continue; //조건에 맞을 경우 19번째 줄로 이동하여 반복하는 것
			sum2 += i; //해당 부분이 있고 없고에 따라 누적인지 별도인지 다름(아래 예제 참고)
		}
		System.out.println(sum2);
		System.out.println();
		
//		1~10 사이의 수중 짝수만 출력하고 홀수인 경우 다음 반복으로 넘어간다.
		
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {
				continue;
			}
			System.out.print(i + " ");
			System.out.println();
		}
		
	}

}
