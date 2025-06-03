package ex06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//		객체 생성 단축키 ctrl + 2(숫자)( => L 입력 

public class CopyExample {

	public static void main(String[] args) {
		
//		String originalPath = "c:/data/dog.jpg"; //경로 data 파일에서 복사하여(사진)
//		String targetPath = "c:/test/dog.jpg"; //경로 test 파일로 붙넣넣기
//		String originalPath = "c:/data/git.mp4"; //경로 data 파일에서 복사하여(동영상)
//		String targetPath = "c:/test/git.mp4"; //경로 test 파일로 붙넣넣기
		String originalPath = "c:/data/new.txt"; //경로 data 파일에서 복사하여(텍스트파일)
		String targetPath = "c:/test/new.txt"; //경로 test 파일로 붙넣넣기
		
		
		try {
			InputStream is = new FileInputStream(originalPath);
			OutputStream os = new FileOutputStream(targetPath);
			
			byte[] data = new byte[1024]; 
			
			while(true) {
				int num = is.read(data);
				System.out.println(num);
				
//				data == -1이란 더 이상 읽어올 데이터가 없다(파일 끝!)
				if(num == -1) break;
				
				os.write(data, 0, num);
			}
			os.flush(); // 열었으니
			is.close();
			os.close(); // 꼭 닫아라
			
		} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}
	}

}
