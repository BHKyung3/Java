package ch01.ex02;

import java.util.Scanner;

public class IfExam6 {

	public static void main(String[] args) {

		/*
		 * 버스요금 계산 프로그램(bus) 
		 * 기본요금 : 2000, 1~5세 : 무료, 6~12세 : 50%할인, 13~18세 : 25%할인, 19~64세 : 0%할인, 65세 이상 : 무료
		 */
		
		// 내가 해본 해결식(키보드에 입력할 수 있도록은 사용하지 않음)
		
		int year = 17;
		int bus = 2000;
	      
	      if(year <= 5) {
	         System.out.println("무료");
	      }else if(year <= 12) {
	    	  System.out.println(bus / 2 + "원");
	      }else if(year <= 18) {
	    	  System.out.println (bus * 0.75 + "원");
	      }else if(year <= 64) {
	    	  System.out.println(2000 + "원");
	      }else {
	    	  System.out.println("무료");
	      }
	      
	      System.out.println("종료");
	      
	      // 선생님 계산식
	      
	      Scanner sc = new Scanner(System.in);
	      int age = 0;
	      double fee = 2000; // 버스요금
	      double rate = 0; // 할인율
	      
	      System.out.println("나이: ");
	      age = sc. nextInt();
	      
	      if(age >= 65 || age <= 5) {
	    	  rate = 0;
	      }else if(age >= 6 && age <= 12) {
	    	  rate = 0.5;
	      }else if(age >= 13 && age <= 18) {
	    	  rate = 0.75;
	      }else if(age >=19 && age <=64) {
	    	  rate = 1;
	      }
	      
	      fee = (fee * rate);
	      
	      System.out.printf("버스 요금 %.0f원 입니다.\n", fee);
	      
	      System.out.println("감사합니다.");
	    	  
	      
	      
	}
}
