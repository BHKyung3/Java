package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExam12 {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fls = new FileInputStream("src/ex01/test.txt");
		
		System.out.println("프로그램 종료!");

	

	}
}
