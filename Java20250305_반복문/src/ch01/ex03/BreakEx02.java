package ch01.ex03;

public class BreakEx02 {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("* ");
				
				if(i ==j) break;
			}
			System.out.println();
			
/*
 이중 for문과 동일하게 나타냄
 for(int i=0; i<5; i++) {
				for(int j=0; j<i+1; j++) {
					System.out.print("* ");
			
				}
				System.out.println();
			}
			System.out.println();
 */
		}
	}

}
