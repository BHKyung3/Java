package ch01.ex01;

import java.util.Random;

public class Lotto02 {

	public static void main(String[] args) {

		/* 
		 로또 프로그램
		 배열: 6칸짜리 int 배열
		 로또는 1~45 중 랜덤으로 저장
		 단, 중복 불가
		 */
		
		int[] lotto = new int [45]; // 45개 방

		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
//			배열 섞기.
		for(int i=0; i<500; i++) { // 500번을 반복하겠다.
			int index = (int)(Math.random()*45); //0~44
			
			int temp = lotto[0];
			lotto[0] = lotto[index];
			lotto[index] = temp;
			
		}
//		배열 45개 칸 중 앞자리 6자리만 출력
		for(int i=0; i<6; i++)
			System.out.print(lotto[i] + " ");
	}

}
