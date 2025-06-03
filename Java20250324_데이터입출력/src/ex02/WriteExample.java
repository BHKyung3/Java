package ex02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//		객체 생성 단축키 ctrl + 2(숫자)( => L 입력 

public class WriteExample {

	public static void main(String[] args) {
		
		String path = "c:/data/test2.db"; //경로
		
		OutputStream os = null;
		
		try {
			 os = new FileOutputStream(path); // 길 만들기, 파일 만들기
			 byte[] arr = {10, 20, 30};
			 
			 os.write(arr);
			 
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
