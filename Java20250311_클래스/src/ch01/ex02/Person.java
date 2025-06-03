package ch01.ex02;

/*
  		클래스
  		사람 클래스
  		사람 특징 -> name, age, height, weight 등등
  		사람 동작 -> run, sleep, eat, study, work 등등
  		
  		간추려 내는 과정을 추상화라고 한다.
 */

public class Person { //public 외부 접근 가능.(외부에서 접근이 가능하게 하려면 public를 기재해야함.)
	
	private String name; //private : 외부에서 접근하지 못하게 한다.
	private int age;

	public void run() { //run, eat 동작을 가지고 클래스를 만든다.
		System.out.println("run...........");
	}
	
	public void eat() {
		System.out.println("eat...........");
	}
}
