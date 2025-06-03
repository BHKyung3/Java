package ex06;

class DBox<L, R> { //상속과는 다르게 class를 만들고 box를 만든다
	private L left;
	private R right;
	
	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return left + " & " + right;
	}
}

class Person{}
	

public class MutiTypeParam {

	public static void main(String[] args) {
		
		DBox<String, Integer> iBox = new DBox<>(); //< > 안에 int 기재 불가 // 문자열, 정수 순서로만 가능하고 두 타입만 기재 가능하다.
		
		iBox.set("홍길동", 20);
		
		System.out.println(iBox);
		
		DBox<Person, String> pBox = new DBox<>();
		Person p = new Person();
		pBox.set(p, "한국인");
		
		System.out.println(pBox);

	}

}
