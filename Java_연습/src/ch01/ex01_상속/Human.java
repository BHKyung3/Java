package ch01.ex01_상속;

public class Human {
	
	private String name;
	private int age;
	private int height;
	private int weight;
	
	public Human () {}
	
	public Human(String name, int age, int height, int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}	
	public String printInformation() {
		return name + "\t" + age + "\t" + height + "\t" + weight + "\t";
	}
	@Override
	public String toString() {
		return name + "\t" + age + "\t" + height + "\t" + weight + "\t";
	}

}
