package ch01.ex02;

public class 난수발생 {

	public static void main(String[] args) {
		
		/* 
		 주사위와 같이 ~숫자 표현하기. 
		 수학 관련 표현 Math. 기재 시 여러항목이 뜸.
		 */

		System.out.println(Math.random()); // 0~1사이 난수
		
		System.out.println( (int)(Math.random()*6)); // 0~5사이 정수
		
		System.out.println( (int)(Math.random()*6) + 1); // 1~1사이 정수
		
		
		System.out.println(Math.PI); //pi
		System.out.println(Math.abs(-1)); //절대값
		System.out.println(Math.sqrt(4)); //루트
		System.out.println(Math.sqrt(9)); //루트
		
		System.out.println(Math.max(5, -1));
		
		System.out.println(Math.floor(12.91)); //소수점 자리 절삭
		
		
	
	}
}
