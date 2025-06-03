package ch01.ex10;

public class OperationExample {

	public static void main(String[] args) {

		int a = 1;
		
		// a = a + 1 == a += 1; 같다
		
		a = a + 1;
		a += 1;
		System.out.println(a);
		
		a *=3;
		System.out.println(a);
		
		a -=8;
		System.out.println(a);
		
		a += 4;
		System.out.println(a);
		
		a %= 8;
		System.out.println(a);
		
		a >>= 7;
		System.out.println(a);
		
		
		
	}

}
