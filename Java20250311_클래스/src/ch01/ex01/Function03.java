package ch01.ex01;

import java.util.Scanner;

/*
 			함수
 			반환타입 O, 매개변수 X (키보드를 통해 입력 받은 버전)
 */
public class Function03 {

	public static void main(String[] args) {
		
		
		
//		int num1 = 10; 매개변수 없음
//		int num2 = 20; 매개변수 없음
		
		String result = add();
		
		System.out.println("result =  " + result);
	}

	static String add() { // ←, ↓ 함수, static 객체 생성 없이 생성할 수 있음
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력>> ");
		
		String name = sc.nextLine();
		return name;
//		↑ 변수에 sc.nextLine() 담지 않고 return sc.nextLine();으로도 출력 가능.(후자 케이스가 더 편리)
	}
}
