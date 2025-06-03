package ch01.ex02;

public class IfExam3 {

	public static void main(String[] args) {
	
	/*
	 * String result = (korScore >= 80) ? "상" : 
	 * (korScore >= 60) ? "중" : "하"; >> 요거랑 같은 내용인데 다르게 표현하는 법
	 */
	int korScore = 80;
	
	if(korScore >= 80) {
		System.out.println("상");
	}else {
	}if(korScore >= 60) {
			System.out.println("중");
	}else {
		System.out.println("하");
	}
	
}

}
