package ch01.ex02;

public class DoWhile01 {

	public static void main(String[] args) {

//	do~while, 조건이 참이던 거짓이던 1회는 실행한다. for의 경우 조건이 맞지 않으면 미추출
		int sum = 0;
		int i = 1000; //초기값
		do {
			i++; //증가, 변동값
			sum += i;
		}while(i<100); //조건
		System.out.println(sum);
	}

}
