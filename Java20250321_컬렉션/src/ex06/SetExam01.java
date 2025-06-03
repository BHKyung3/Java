package ex06;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import lombok.ToString;

class Member {
	String name;
	int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	

	@Override
	public int hashCode() {
		System.out.println("----------hashCode----------");
		
		int result = name.hashCode()+age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("----------equals----------");
		Member m = (Member)obj;
		return this.name.equals(m.name) && this.age == m.age;
	}
}

public class SetExam01 {

	public static void main(String[] args) { 
		
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("홍길동", 20));
		set.add(new Member("박길동", 20));
		set.add(new Member("이길동", 20));
		
		for(Member m : set)
			System.out.println(m);
	}

}
