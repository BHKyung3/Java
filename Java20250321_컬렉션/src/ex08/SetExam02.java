package ex08;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import lombok.EqualsAndHashCode;

class Num {
	private int num;
	public Num(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return num + " ";
	}
	
	@Override
	public int hashCode() {
		System.out.println("-hashCode-");
		return num % 3;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("-equals-");
		
		Num number = (Num)obj;
		
		return this.num == number.num;
	}
}
public class SetExam02 {

	public static void main(String[] args) { 
		
		Set<String> set = new TreeSet<>();
		
		set.add("Toy"); //아스키코드에 의하여 기재한 값이 아닌 대문자 -> 소문자 순서로 정렬되어 출력됨.(출력 내용 참고)
		set.add("toy"); 
		set.add("box");
		set.add("Box");
		set.add("Robot");
		set.add("robot");
		set.add("Toy");
		
//		set.add(new Num(1234));
//		set.add(new Num(1357));
//		set.add(new Num(1395));
//		set.add(new Num(1234));
//		set.add(new Num(1359));
		
		for(String n : set)
			System.out.println(n);
		
		System.out.println();
		
		Set<Integer> iset = new TreeSet<>();
		
		iset.add(40); //중복 제거 후 정렬되어 출력
		iset.add(30);
		iset.add(50);
		iset.add(10);
		iset.add(15);
		iset.add(20);
		iset.add(30);
		
		for(Integer i : iset)
			System.out.println(i);
	}
}
