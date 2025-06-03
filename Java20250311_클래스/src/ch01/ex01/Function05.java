package ch01.ex01;

import java.util.Scanner;

/*
 			함수
 			반환타입 X, 매개변수 O
 */
public class Function05 {

	public static void main(String[] args) {
		
		add(1.5); //1.5 매개 변수
		
		System.out.println("result =  ");
	}

	static void add(double dNum) { // ←, ↓ 함수, static 객체 생성 없이 생성할 수 있음, void 반환타입 없다는 의미
		
		System.out.println(dNum);

		
		return;
	}
}
