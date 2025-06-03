package ex01;

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


class appleBox { 
	private Apple ap;
	
	public Apple getAp() {
		return ap;
	}

	public void setAp(Apple ap) {
		this.ap = ap;
	}
}


class orangeBox {
	private Orange op;

	public Orange getOp() {
		return op;
	}

	public void setOp(Orange op) {
		this.op = op;
	}
}

public class 제네릭이해 { //사과, 오렌지, 사과박스, 오렌지 박스 4개의 클래스, 사과는 사과박스에만 오렌지는 오렌지박스에만 넣는다.

	public static void main(String[] args) {
		
		appleBox aBox = new appleBox(); //사과클래스만 담는다
		orangeBox oBox = new orangeBox(); //오렌지클래스만 담는다
		
		aBox.setAp(new Apple()); //사과박스에 사과를 담는다
		oBox.setOp(new Orange()); //오렌지박스에 오레렌지를 담는다
		
		Apple ap = aBox.getAp();
		System.out.println(ap);
		
		Orange op = oBox.getOp();
		System.out.println(op);
		
	}

}
