package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExam07 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("src/ex01/test.txt")){
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("src/ex01/test.txt");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close(); // finally 기재 시 반드시 close 해줘야함
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try(FileInputStream fis2 = new FileInputStream("src/ex01/test.txt")){
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료!");
	}

}
