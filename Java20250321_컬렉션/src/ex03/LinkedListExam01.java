package ex03;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam01 {

	public static void main(String[] args) { 
		
//		List 상위클래스로 이제하는 것이 용이하다.
		List<String> list = new LinkedList<>(); // 배열이 만들어짐(기본 세팅 방 10개인가 16개 생성). // 상위클래스이기 때문에 하위클래스를 포함 가능하다
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");		
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();
		
		for(String str : list)
			System.out.println(str); // 위 내용과 출력 방식은 다르나 출력 값 동일
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
