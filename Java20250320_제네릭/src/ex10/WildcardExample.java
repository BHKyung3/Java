package ex10;

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

class Unboxer {
	public static <T> T openBox(Box<T> box) {
		return box.getObj();
	}
	
	public static void peekBox(Box<?> box) {
		System.out.println(box);
	}
}

public class WildcardExample {

	public static void main(String[] args) {
		
		Box<String> box = new Box<>();
		box.setObj("Hello Java");
		
		Unboxer.peekBox(box);
		
		Unboxer.openBox(box);
		
		String msg = Unboxer.openBox(box); // 또는 해당 방법으로도 기재 가능
		System.out.println(msg);
			
	}

}
