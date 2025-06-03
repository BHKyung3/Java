package ex04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExam01 {

	public static void main(String[] args) { 
		
		List<String> list = new ArrayList<>(); // 배열이 만들어짐(기본 세팅 방 10개인가 16개 생성). // 상위클래스이기 때문에 하위클래스를 포함 가능하다
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
		
		list.add(0, "Robot");
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();
		
		for(String str : list) // 이름 : 향상된 for문
			System.out.println(str); // 위 내용과 출력 방식은 다르나 출력 값 동일
		System.out.println();
		System.out.println("----------------------------");
		
		
		Iterator<String> itr = list.iterator(); // 반복자 : 29~33번째 작성하는 이유 -> 코드 최소화(별로 다를께 없음..) iterator : 인터페이스로 아무나 사용할 수 없음
		
//		list.iterator(); 
		while(itr.hasNext()) {
			System.out.print(itr.next() + " "); // 해당 식은 1회만 출력이 가능함 2회 출력을 원할 경우 31번째 주석 처리한 내용을 추가 기재하고 동일한 내용을 한 번 더 기재해야함
		}
		System.out.println();
		
		list.remove(0); // remove : 삭제한다, 0번째방 삭제 
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
//		System.out.println(list.get(2)); 에러발생 : 0번째 방 삭제로 0~1 방만 존재
		
		System.out.println();
		
		list.clear(); // 전체 삭제
		
//		System.out.println(list.get(0));
	}

}
