package ex08;

/*
 		T : 타입인자..제한을 주겠다. 모든걸 허용
 		T extends A -> T에게 전달되는 대상은 A이거나 A 하위클래스만 전달 가능하다.
 */

class Box<T extends A> { // T에 전달 될 수 있는 클래스는 A이거나 A를 상속하는 클래스만 가능하다.
	private T obj;
	
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
}
class A {}
class B extends A {}
class C extends B {}

class D {}
class Person {}
class Car {}

public class 제네릭이해 { 
			
	public static void main(String[] args) {
		
		Box<A> aBox = new Box();
		Box<B> bBox = new Box();
		Box<C> cBox = new Box();
		
//		Box<D> dBox = new Box(); 해당 3건은 상속을 받지 않은 클래스로 BOX안에 담기가 불가하다
//		Box<Person> personBox = new Box();
//		Box<Car> carBox = new Box();
		
		
	
		
	}

}
