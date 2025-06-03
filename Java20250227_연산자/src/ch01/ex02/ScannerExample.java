package ch01.ex02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		System.out.print("문자입력 : ");
		Scanner sc = new Scanner(System.in);
		int str = sc.nextInt();
		
		str = str + 10; 
		
		System.out.println("입력된 값 : " + str);
		
	
		
		
		
	}

}
