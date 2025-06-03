package ch01.ex05;

import java.util.Scanner;

public class Exam_문제1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
				
		int hour = 1;
		int minute = 6;
		int second = 40;
		
		System.out.print("출력: ");
		System.out.print(hour + "시간 " + minute + "분 " + second + "초");
		String data = scanner.nextLine();
		
		// int result = y;
		// System.out.println("x + y: " + result);
		// System.out.println();
		
		
		// 선생님
		//Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력: ");
		String strA = scanner.nextLine();
		
		int totalSeconds = Integer.parseInt(strA);
		
		int hours = totalSeconds / 3600;
		int minutes = (totalSeconds % 3600) / 60;
		int seconds = totalSeconds % 60;
		
		System.out.printf("출력: %d, 시간: %d, 분: %d, 초: %d\n", totalSeconds, hours, minutes, seconds );
		
		
		
		
	}

}
