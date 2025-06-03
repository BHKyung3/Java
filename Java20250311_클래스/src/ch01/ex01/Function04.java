package ch01.ex01;

import java.util.Scanner;

/*
 			함수
 			반환타입 X, 매개변수 X
 */
public class Function04 {

	public static void main(String[] args) {
		
		add();
		
		System.out.println("result =  ");
	}

	static void add() { // ←, ↓ 함수, static 객체 생성 없이 생성할 수 있음, void 반환타입 없다는 의미
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력>> ");
		
		String name = sc.nextLine();
		System.out.println(name);
//		return name; 반환타입이 없을 경우 return이 없음
//		간략하게 기재하려면 System.out.println(name); -> System.out.println(sc.nextLine()); 기재 후 String name = sc.nextLine(); 삭제 가능
		
		return;
	}
}
