package ex08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

//		객체 생성 단축키 ctrl + 2(숫자)( => L 입력 

public class ReadExample {

	public static void main(String[] args) {
		
		try {
			Reader reader = null;
			
			reader = new FileReader("c:/data/test.txt");
			
			while(true) { 		//1개 문자씩 읽기
				int data = reader.read();
				
				if(data == -1) break;
				System.out.print((char)data);
			}
			
			reader.close();
			System.out.println();
			
			reader = new FileReader("c:/data/test.txt"); // 문자 배열로 읽기
			char[] data = new char[100];
			
			while(true) { 		//1개 문자씩 읽기
				int num = reader.read(data);
				
				if(num == -1) break;
				for(int i=0; i<num; i++)
				System.out.print(data[i]);
			}
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
