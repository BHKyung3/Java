package ch04.ex01;

public class WhileExample01 {

	public static void main(String[] args) {

		/* 아래 내용과 같음.
		 int sum = 0;
		     초기값; 조건; 증가(감소)
		 for(int i=1; i<=5; i++ {
		     sum += i;
		 }
		 System.out.println("sum = " + sum);
		 */
		
		int sum = 0;
		int i=1;
//		조건이 참일 경우에만 사용 가능, 불일 시 튕겨져 나감.
		while(i<=5) {
			sum +=i;
			i++;
		}
		System.out.println("sum = " + sum);
	}

}
