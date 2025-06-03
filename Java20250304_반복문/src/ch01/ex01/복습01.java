package ch01.ex01;

public class 복습01 {

	public static void main(String[] args) {
		
		int num = 0;
		int num2 = 0;
		int num3 = 0;
		
		// 아래 4개는 동일하게 +1 증가를 표현하는 방법
		
		num = num + 1; //num(1)
		
		num += 1; // num(2)
		
		num2 = ++ num; // 전위연산자(증감) : num에 +1 이후 num2에 대입, num과 num2 (3)
		
		num3 = num ++; // 후위연산자(증감) : num3에 대입 후 num에 +1, num3는 (3), num은 (4)
		
		System.out.printf("%d %d %d\n", num, num2, num3);
	}

}
