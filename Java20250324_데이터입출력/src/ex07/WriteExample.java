package ex07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

//		객체 생성 단축키 ctrl + 2(숫자)( => L 입력 

public class WriteExample {

	public static void main(String[] args) {
		
		try {
			Writer writer = new FileWriter("c:/data/test.txt"); // 문자 기반 출력 스트림 생성
			
			char a = 'A'; 		//1개씩 문재열 생성
			writer.write(a);
			char b = 'B';
			writer.write(b);
			
			char[] arr = {'C', 'D', 'E', 'F', 'G'}; // char 배열 출력
			writer.write(arr);
			
			writer.write("FGH"); 		// 문자열 출력
			
			writer.flush(); //버퍼에 잔류하고 있는 문자들을 출력하고, 버퍼를 비움
			
			writer.close(); // 출력 스트림을 닫고 메모리 해제
		} catch (IOException e) {
				e.printStackTrace();
			
		}
	}

}
