package ex03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//		객체 생성 단축키 ctrl + 2(숫자)( => L 입력 

public class WriteExample {

	public static void main(String[] args) {
		
		String path = "c:/data/test3.db"; //경로
		
		OutputStream os = null;
		
		try {
			 os = new FileOutputStream(path); // 길 만들기, 파일 만들기
			 byte[] arr = {10, 20, 30, 40, 50};
			 
			 os.write(arr, 1, 3); // 값 중 1~3번만 파일에 불러오겠다.
			 
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
