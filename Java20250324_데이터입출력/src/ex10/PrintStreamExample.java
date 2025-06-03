package ex10;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {

	public static void main(String[] args) throws Exception { // 예외 처리를 명시적으로 선언하여 발생하는 예외를 호출자에게 전달
		
		FileOutputStream fos = new FileOutputStream("c:/data/printstream.txt"); // 파일에 데이터를 출력, 텍스트 파일 위치
		
		PrintStream ps = new PrintStream(fos); //텍스트 데이터 출력
		
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다.");
		ps.printf("1번 홍길동 도적입니다.");
		ps.println();
		ps.printf("2번 감자바 학생입니다.");
		
		ps.flush();
		ps.close();
	}

}
