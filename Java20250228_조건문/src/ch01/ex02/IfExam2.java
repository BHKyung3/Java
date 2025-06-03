package ch01.ex02;

public class IfExam2 {

	public static void main(String[] args) {

		/* 
		 * if : 조건을 만족할 경우 if
		 * if ~ else : 조건을 만족할 경우 if, 만족하지 못할 경우 esle
		 * if ~ else if ~ else : 경우의수가 많을 때 > 직관적으로 보기 편하게 만든것이 swich(활용범위는 if가 더 높음)
		 */
		
	     int kor = 40;
	     int eng = 70;
		
	     if(kor >= 50) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
			
		}
	System.out.println("종료");
	}

}
