package ex01;

import java.util.Scanner;

public class ExceptionExam02 {

	public static void main(String[] args) {

		// 오류1)		int num = 10/0; 기재 시 "ArithmeticException" 오류 발생
		
		/* 오류2)
		 		int[] arr = new int [5];
		 		arr[4] = 100;
				arr[5] = 10; 		0~4번째 방이니ㅏ 5번쩨 방이 없을 경우 "ArrayIndexOutOfBoundsException" 오류 발생
		 */
				
		/* 오류3)
		 		String str = null;
		 		System.out.println(str.length()); null 값으로 참조하는 대상이 없어 "NullPointerException" 오류 발생
		 */
				String str2 = "korea";
				
				if(str2 != null)
					System.out.println(str2.length()); // length() 글자수 몇 개인지 함수
	}
		}
