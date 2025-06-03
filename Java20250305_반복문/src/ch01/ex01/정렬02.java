package ch01.ex01;

import java.util.Random;

public class 정렬02 {
//	정렬 class와 동일하게 랜덤 추출이 가능하나 반드시 Random random = new Random(); 단어가 들어가야함.

	public static void main(String[] args) {
		
//		int seed = 12345; // int 사용하여 값을 지정할 경우 랜덤숫자가 지속적으로 추출됨.
//		Random random = new Random(seed);
		
		Random random = new Random(); // seed값이 없으면 랜덤하게 추출.
		
		int[] numArr = new int[6];
		int tmp;
		
//		문제1) 랜덤하게 1~100사이 값을 배열헤 넣는다.
		for(int i=0; i<numArr.length; i++) {  // numArr.length 의미: "int[] numArr = new int[5];"안에 숫자가 변경되면 자동으로 변경됨.
			tmp = (int)random.nextInt(100)+1;
			numArr[i] = tmp;
		}
//		랜덤하게 배열 저장된 값 출력
		for(int i=0; i<numArr.length; i++)
			System.out.print(numArr[i] + " ");
		
		System.out.println();
		
//		문제2) 최대값, 최소값 출력
		int max, min;
		max = min = numArr[0];
		
		for(int i=1; i<numArr.length; i++) { // i=0이 아닌 i=1를 한 이유 : 첫번값은 비교하는 값과 동일하기 때문에 제외하고 보기 위하여
			if(max < numArr[i])
				max = numArr[i];
			
			if(min > numArr[i])
				min = numArr[i];
		}
//		코드구현
		System.out.println();
		System.out.println("최대값: " + max + ", 최소값: " + min);
		System.out.println();
		
//		문제3) 총점, 평균 출력
		int sum=0;
		double avg=0;
		
		for(int i=0; i<numArr.length; i++) {
			sum += numArr[i]; // 총점
		}
		avg = (double)sum/numArr.length; // avg, sum은 정수이기에 double을 표기함으로 실수로 변경하여 표기
		
//		코드구현
		System.out.printf("총점: %d, 평균: %.2f\n", sum, avg);
		System.out.println();
		
// 정렬(버블정렬): 앞에 기재된 숫자와 뒤에 숫자를 비교하여 앞에 숫자가 클 경우 순서가 바뀌는것
//		       예제) 50, 80, 70 -> 50과 80을 비교하여 50이 작으니 변동 없음, 80과 70을 비교하여 80이 크니 순서 변경
		int temp; // 임시로 값을 가지고 있을꺼
		for(int i=0; i<numArr.length; i++) { //i는 회전 1회전, 2회전...
			for(int j=0; j<numArr.length-1-i; j++) { //j는 값비교.. -1한 이유는 0~8개 방이 있으나 +1를 할경우 9번째 방을 찾아 오류 발생으로 -1 기재
				
				if(numArr[j] > numArr[j+1]) {
					temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
				}
			}
		}
		for(int i=1; i<numArr.length; i++)
			System.out.print(numArr[i] + " ");
		
	}

}
