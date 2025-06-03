package ch04.ex01;

import java.util.Scanner;

public class WhileExample05 {

	public static void main(String[] args) {
		
		int count = 0;
		for(; ; count++) {
			
			if(count>100) break; // 해당 값이 없을 경우 무한반복
			
			System.out.println(count);
			}
		System.out.println();
		
		int cnt = 0;
		
		while(true) {
			cnt++;
			if(cnt>100) break;
			System.out.println(cnt);
		}
	}

}
