package Example0311;

public class 배열_연습04 {

	public static void main(String[] args) {

//		정수형 배열 1~100중 10개의 숫자로 랜덤하게 표출하시오.
		
		int [ ] num = new int [10];
		
		for(int i=0; i<num.length; i++) {
			num [i] = (int)(Math.random()*100)+1;
		}
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
//		총점, 평균 구하기
		
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		
		avg = sum / num.length;
		System.out.println("총점: " + sum + ", 평균: " + avg);
	}
	
}
