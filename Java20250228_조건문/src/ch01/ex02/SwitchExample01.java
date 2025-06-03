package ch01.ex02;

public class SwitchExample01 {

	public static void main(String[] args) {

		/*
		 * 학점 계산(grade) 
		 90 : A, 80 : B, 70 : C, 60 : D, 59점이하 : F 'IfExam5'와 동일한 내용이나 잘 보이기 위한 본
		 IfExam5는 else if 를 사용한 예시이며 해당 페이지는 switch 를 사용한 예시
		 'break' 넣은 이유 : 없을 경우 조건 값이 맞으면 그 뒤에 내용도 다 조건 값이 맞는 것으로 실행함 그렇기에 break를 걸어서 조건 값이 맞는거 이후로 따라오지 않도록 함.
		 switch를 사용하려면 무조건 break를 사용하여 조건 값 외에 항목이 따라오지 않도록 해야함.
		 */
		int grade = 87;
		
		switch(grade / 10) {
	case 10: //정수, 문자, 문자열만 올 수 있음.(실수 불가)
		System.out.println("A");
		break;
	case 9:
		System.out.println("A");
		break;
	case 8:
		System.out.println("B");
		break;
	case 7:
		System.out.println("C");
		break;
	case 6:
		System.out.println("D");
		break;
	default: 
		System.out.println("F");
		}
	      
	      System.out.println("종료");
	}
}
