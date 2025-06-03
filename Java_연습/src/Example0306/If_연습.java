package Example0306;

import java.util.Scanner;

public class If_연습 {

	public static void main(String[] args) {

//		문제1) 키보드로 입력받아 몸무게 70이상이면 큰일이다. 60이상이면 어떻하지 50이상이면 다이어트 40이상이면 이상적인 몸무게를 if문을 사용하여 나타내시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몸무게: ");
		int kg = sc.nextInt();
		
		if(kg >= 70) {
			System.out.println("큰일이다.");
		}else if(kg >= 60) {
			System.out.println("어떻하지");
		}else if(kg >= 50) {
			System.out.println("다이어트");
		}else if(kg >= 40) {
			System.out.println("이상적인 몸무게");
		}else {
			System.out.println("살 좀 쪄라");
		}
	}

}
