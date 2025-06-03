package ex04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {

		Date date = new Date();
		String strNow1 = date.toString();
		System.out.println(strNow1); // 홈페이지 날짜 표기하는 법
		
		
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일, HH시 mm분 ss초"); //위에 표기된 날짜를 알기 쉽게 표현하기 "SimpleDateFormat" // 월, 시간은 대문자로 표기
		
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}

}
