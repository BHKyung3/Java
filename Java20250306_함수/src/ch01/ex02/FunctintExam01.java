package ch01.ex02;

public class FunctintExam01 {


		/* 
		 함수 2개 생성
		 매개변수로 100 정수값을 전달하면 
		 함수1은 1~100 사이 홀수 값을 리턴하고
		 함수2는 1~100 사이 짝수 값을 리턴한다.
		 메인함수에서 두 함수 호출하고, 각 전달 값을 출력한다.
		 */
	public static void main(String[] args) {
		
		int number = 100;
		
		int evenResult = evenSum1(number);
		int oddRedult = oddSum(number);
		
		System.out.println("짝수합: "+ evenResult);
		System.out.println("홀수합: " + oddRedult);
		
	}
		
		public static int evenSum1(int number) { //짝수의 합
			int sum = 0;
			for(int i=0; i <=number; i++) {
				if(i%2 == 0)
				sum += i;
			}
			return sum;
		}
		
		public static int oddSum(int number) { //홀수의 합
			int sum = 0;
			for(int i=0; i <=number; i++) {
				if(i%2 == 1) // == if( !(i%2 == 0) ) 나머지가 0이 아닌 경우
				sum += i;
		}
			return sum;
	}

}
