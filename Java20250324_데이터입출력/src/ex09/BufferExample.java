package ex09;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream; // 파일을 읽고 위한 스트림
import java.io.FileOutputStream; // 파일을 쓰기 위한 스트림
import java.io.InputStream; // 데이터 입력을 위한 상위 클래스
import java.io.OutputStream; // 데이터 출력을 위한 상위 클래스

public class BufferExample {

	public static void main(String[] args) throws Exception {
		
//		String originalFilePath1 = BufferExample.class.getResource("originalFile1.jpg").getPath();
		String originalFilePath1 = "c:/data/originalFile1.jpg"; // 원본 파일의 경로
		String targetFilePath1 = "c:/data/targetFile1.jpg"; // 복사될 파일의 경로
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
//		String originalFilePath2 = BufferExample.class.getResource("originalFile2.jpg").getPath();
		String originalFilePath2 = "c:/data/originalFile2.jpg";
		String targetFilePath2 = "c:/data/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2); //파일 읽기 시 버퍼를 활용해 성능을 향상
		BufferedOutputStream bos = new BufferedOutputStream(fos2); //파일 쓰기 시 버퍼를 활용해 속도를 높인다.
		
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼 미사용:\t" + nonBufferTime + " ns");
		
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼 사용:\t" + bufferTime + " ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
		}
			
	public static long copy(InputStream is, OutputStream os) throws Exception{
		
		long start = System.nanoTime();
		
		while(true) {
			int data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		
		long end = System.nanoTime();
		
		return(end-start);
	}

}
