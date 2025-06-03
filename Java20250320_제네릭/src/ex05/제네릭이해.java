package ex05;

import lombok.Getter;
import lombok.Setter;

class Apple {
	@Override
	public String toString() {
		return "I am an apple";
	}
}
class Orange {
	@Override
	public String toString() {
		return "I am an Orange";
	}
}

class Box<T> { // Object > T로 수정 후 Box 뒤에 <T> 기재
	private T obj;
	
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
}
public class 제네릭이해 { //사과, 오렌지 2개를 1개의 박스에 담는다.
			
	public static void main(String[] args) {
				
		Box<Apple> aBox = new Box<Apple>(); //<> 괄호 안에 있는 내용이 19번째 줄 Box<T>로 인해 T로 기재되어 있는 안으로 내용이 반영된다.
		Box<Orange> oBox = new Box<Orange>();
				
		aBox.setObj(new Apple()); // new Apple 외에 다른건 절대 넣을 수 없음. 넣으면 오류 발생
		oBox.setObj(new Orange());
				
		Apple ap = aBox.getObj();
		Orange op = oBox.getObj();
				
		System.out.println(ap);
		System.out.println(op);	
	}

}
