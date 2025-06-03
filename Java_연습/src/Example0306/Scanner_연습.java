package Example0306;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthToggleButtonUI;

public class Scanner_연습 {

	public static void main(String[] args) {

//		문제1) 근무시간과 시간 당 급여을 입력받아 주급을 계산하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.println("근무시간: ");
		int hour = sc.nextInt();
		
		System.out.println("시간당 급여: ");
		int money = sc.nextInt();
		
		System.out.println("주급: " + hour*money);
		System.out.println();
		
//		문제2) 이름, 국어, 영어, 수학 점수를 입력 받아 총첨 및 평균을 구하시오.
		
		System.out.println("이름: ");
		str = sc.nextLine();
		str = sc.nextLine();
		
		System.out.println("국어점수: ");
		int kor = sc.nextInt();
		
		System.out.println(str);
		
		
	}

}
