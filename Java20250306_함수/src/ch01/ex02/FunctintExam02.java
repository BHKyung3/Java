package ch01.ex02;

public class FunctintExam02 {


		/* 
		 함수 2개 생성
		 매개변수로 100 정수값을 전달하면 
		 함수1은 1~100 사이 홀수 값을 리턴하고
		 함수2는 1~100 사이 짝수 값을 리턴한다.
		 메인함수에서 두 함수 호출하고, 각 전달 값을 출력한다.
		 */
	public static void main(String[] args) {
		
		int[] number = new int[10]; //10개의 방을 잡는다.
		
		for(int i=0; i<10; i++) {
			number[i] = (i+1)*10;
		}
				
		for(int i=0; i<10; i++)
			System.out.print(number[i] + " ");
		System.out.println();
			
		int resultA = evenSum(number);
		System.out.println(resultA);
		
		int resultB = oddSum(number);
		System.out.println(resultB);
	}
		
		public static int evenSum(int[] numA) { //짝수의 합
		
			int sum = 0;
			for(int i=0; i<numA.length; i++) { //=의미를 사용할 경우 0~10까지 총 11번 실행으로 맞지 않아 부호 제외.
				
				int num = numA[i] / 10;
				if(num % 2 == 0) //와 같은 표현으로는 if( (numA[i] / 10) % 2 == 0)
				sum += numA[i];
			}
			return sum;
		}
		
		public static int oddSum(int[] numB) { //홀수의 합
			int sum = 0;
			
			for(int i=0; i<numB.length; i++) {
				
				if((numB[i] / 10) % 2 == 1) // == if( !(i%2 == 0) ) 나머지가 0이 아닌 경우
				sum += numB[i];
		}
			return sum;
	}

}
