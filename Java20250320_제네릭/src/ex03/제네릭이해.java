package ex03;

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
class Box { 
	private Object obj;
			
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
}
public class 제네릭이해 { //사과, 오렌지 2개를 1개의 박스에 담는다.
			
	public static void main(String[] args) {
				
	Box aBox = new Box();
	Box oBox = new Box();
				
	aBox.setObj(new Apple());
	oBox.setObj(new Orange());
				
	Apple ap = (Apple)aBox.getObj();
	Orange op = (Orange)oBox.getObj();
	
	System.out.println(ap);
	System.out.println(op);
				
	}

}
