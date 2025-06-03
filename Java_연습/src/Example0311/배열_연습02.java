package Example0311;

public class 배열_연습02 {

	public static void main(String[] args) {

//		정수형 배열 1~100중 5개의 숫자로 랜덤하게 표출하시오.
		
		int [] num = new int [5];
		
		for(int i=0; i<num.length; i++) {
			num [i] = (int)(Math.random()*100)+1;
		}
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
	
}
