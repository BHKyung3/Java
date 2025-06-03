package Example0305;

import java.util.Random;

public class 정렬_연습 {

	public static void main(String[] args) {
		
//		랜덤추출
		Random random = new Random();
//		몇 개의 방을 만들껀지
		int[] numArr = new int[5];
		int temp;
		
//		문제1) 랜덤하게 1~100사이 값을 배열헤 넣는다.
		for(int i=0; i<numArr.length; i++) { // 만든 방의 갯수 numArr.length로 표현
			temp = (int)random.nextInt(100)+1;
			numArr[i] = temp;
		}
		for(int i=0; i<numArr.length; i++) // 출력하려면 for 한 번 더 사용하기
			System.out.println(numArr[i] + " ");
	}

}
