package ch01.ex01;

public class 정렬 {

	public static void main(String[] args) {
// 10개의 값을  {} 를 사용하여 직접 넣어도 되고 키보드로 입력 받을 수도 있고 
		int[] numArr = new int[10];
		int tmp;
		
//		랜덤하게 1~100사이 값을 배열헤 넣는다.
		for(int i=0; i<10; i++) {
			tmp = (int) (Math.random()*100)+1; // +1를 하는 이유는 10개의 방 10개를 실행하면 0~99까지 임으로 +1 하여 100으로 맞춘것
			numArr[i] = tmp;
		}
//		랜덤하게 배열 저장된 값 출력
		for(int i=0; i<10; i++)
			System.out.print(numArr[i] + " ");
	}

}
