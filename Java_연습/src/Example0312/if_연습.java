package Example0312;

import java.util.Scanner;

public class if_연습 {

	public static void main(String[] args) {
		
/*
  		사용자가 입력한 나이에 따라, 해당 사용자가 어린이인지 청소년인지 성인인지 출력하는 프로그램을 작성하세요.
  		0세에서 12세까지는 어린이
		13세에서 19세까지는 청소년
		20세 이상은 성인
 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이: ");
		int age = sc.nextInt();
		
		if(age >= 0 && age <=12) {
			System.out.println("어린이");
		} else if(age >= 13 && age <=19) {
			System.out.println("청소년");
		} else if(age >= 20){
			System.out.println("성인");
		} 
	}

}
