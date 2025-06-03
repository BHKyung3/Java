package ex11;

class Box<T> {
	private T obj;
	
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	@Override
	public String toString() {
		return (String)obj; // box.setObj("Hello Java"); 에 기재된 문구를 출력하려면 해당 건 기재 필요
	}

}

class A {}
class B extends A {}
class C extends B {}
class D extends C {}

class Unboxer {
	public static <T> T openBox(Box<T> box) {
		return box.getObj();
	}
	public static void peekBox(Box <? > box) {
		System.out.println(box);
	}
	
//	상한제한 : extends B 의미 -> B, C, D만 대입할 수 있다 -> 목적 : 읽기 전용(쓰기 금지!)
	public static void peekBox1(Box <? extends B> box) {
//		System.out.println(box);
		box.getObj();
//		box.setObj(box); -> setObj 쓰기 전용으로 오류 발생
	}
//	하한제한 : super B 의미 -> B, A만 대입할 수 있다  -> 목적 : 쓰기 전용(읽기 금지!)
	public static void peekBox2(Box<? super B> box) {
//		System.out.println(box);
//		box.getObj(); -> getObj 쓰기 전용으로 오류 발생
//		box.setObj(box);
		
		
	}
}

public class WildcardExample01 {

	public static void main(String[] args) {
		
		Box<B> box = new Box<>();
//		box.setObj(new A()); 
			
			Unboxer.peekBox2(box);		
	}

}
