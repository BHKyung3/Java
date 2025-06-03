package Example0311;

public class 배열_연습 {

	public static void main(String[] args) {
		/*
		 10개 값 중 랜덤, 총점, 평균, 최소값, 최대값, 정렬 진행
		 */

		int [] num = new int [10];
		
//		빈배열 1~100사이 랜덤하게 저장
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*100)+1;
		}
		
//		배열값 출력
		for(int i=0; i<num.length; i++)
			System.out.print(num[i] + " ");
		System.out.println();
		
//		총점, 평군 구하기
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		avg = (double)sum / num.length;
		System.out.println("총점: " + sum + "," + "평균: " + avg);
		System.out.println();
		
//		최대, 최소값
		int max = num[0];
		int min = num[0];
		
		for(int i=0; i<num.length; i++) {
			if(max < num[i])
				max = num[i];
			if(min > num[i])
				min = num[i];
		}
		
		System.out.println("최대값: " + max + ", 최소값: " + min);
		
//		정렬
		for(int i=0; i<num.length-1; i++) {
	         for(int j=0; j<num.length-1-i; j++) {
	            
	            if(num[j]> num[j+1]) {
	               int tmp = num[j];
	               num[j] = num[j+1];
	               num[j+1] = tmp;
				}
			}
		}
		for(int i=0; i<num.length; i++)
			System.out.print(num[i] + " ");
		System.out.println();
	}

}
