package Example0311;

public class 배열_연습03 {

	public static void main(String[] args) {

//		배열에 들어있는 모든 값의 합을 구하는 프로그램을 작성하세요.
		
		int num [] = new int [10];
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*100)+1;
		}
		
		for(int i=0; i<10; i++) {
			System.out.print(num[i] + " ");
			System.out.println();
		}
		
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		
		
		avg = (double)sum / num.length;
		System.out.println("총점: " + sum + "," + "평균: " + avg);
	}

}
