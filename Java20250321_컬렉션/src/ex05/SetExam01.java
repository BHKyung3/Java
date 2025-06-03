package ex05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam01 {

	public static void main(String[] args) { 
		
		Set<String> list = new HashSet<>(); // 배열이 만들어짐(기본 세팅 방 10개인가 16개 생성). // 상위클래스이기 때문에 하위클래스를 포함 가능하다
		
		list.add("Robot"); // 해당 값으로 출력 요청을 해도 순서는 기재한 순서로 출력되지 않음, 중복되지 않음
		list.add("Box"); // String으로 불러왔기 때문에 그 외에 내용은 기재할 수 없다
		list.add("Toy");
		
		for(String str : list) // 이름 : 향상된 for문
			System.out.println(str); // 위 내용과 출력 방식은 다르나 출력 값 동일
		System.out.println();
		System.out.println("----------------------------");
		
		
		Iterator<String> itr = list.iterator(); // 반복자 : 29~33번째 작성하는 이유 -> 코드 최소화(별로 다를께 없음..) 
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + " "); // 해당 식은 1회만 출력이 가능함 2회 출력을 원할 경우 31번째 주석 처리한 내용을 추가 기재하고 동일한 내용을 한 번 더 기재해야함
		}
		System.out.println();
	}

}
