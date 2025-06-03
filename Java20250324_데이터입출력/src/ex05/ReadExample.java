package ex05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//		객체 생성 단축키 ctrl + 2(숫자)( => L 입력 

public class ReadExample {

	public static void main(String[] args) {
		
		String path = "c:/data/test2.db"; //경로
		
		
		try {
			InputStream is = new FileInputStream(path);
			
			byte[] data = new byte[2]; //기재 값 중 첫번째로 2개만 읽어오겠다.
			
			while(true) {
				int num = is.read(data);
				System.out.println(num); // 10, 20, 30 3개(출력값 참고)
				
//				data == -1이란 더 이상 읽어올 데이터가 없다(파일 끝!)
				if(num == -1) break;
				
				for(int i=0; i<num; i++)
				System.out.println(data[i]);
			}
			is.close();
		} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}
	}

}
