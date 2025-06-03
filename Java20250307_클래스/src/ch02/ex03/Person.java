package ch02.ex03;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	String introduce() {
		return "안녕하세요,제이름은 [" + name + "]이고, [" + age + "]살 입니다.";
	
	}
}
