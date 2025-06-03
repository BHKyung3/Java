package ex01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//		객체 생성 단축키 ctrl + 2(숫자)( => L 입력 

public class WriteExample {

	public static void main(String[] args) {
		
		String path = "c:/data/test1.db"; //경로
		
		OutputStream os = null;
		
		try {
			 os = new FileOutputStream(path); // 길 만들기, 파일 만들기
			 byte a = 10; //파일에 값 기재 및 저장
			 byte b = 20;
			 byte c = 30;
			 
			 os.write(a);
			 os.write(b);
			 os.write(c);
			 
			 os.flush();
			 
			 os.close(); // 파일 열였으면 반드시 닫아줘야함
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
