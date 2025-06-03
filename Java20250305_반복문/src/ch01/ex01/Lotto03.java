package ch01.ex01;

public class Lotto03 {

	public static void main(String[] args) {

		/* 
		 로또 프로그램
		 배열: 6칸짜리 int 배열
		 로또는 1~45 중 랜덤으로 저장
		 단, 중복 불가
		 */
		
		int[] lotto = new int[45];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		System.out.println("이번 주 예상 로또 번호 :");
		for(int j=0; j<5; j++) {
			//배열 썩기~
			for(int i=0; i<5000; i++) {
				int index = (int)(Math.random()*45); //0~44			
				
				int temp = lotto[0];			
				lotto[0] = lotto[index];
				lotto[index] = temp;
			}
			
			//배열45개 칸 중 앞자리 6자리만 출력			
			for(int i=0; i<6; i++)
				System.out.print(lotto[i] + " ");	
			
			System.out.println();
		}
	}

}
