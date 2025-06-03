package Example0305;

import java.util.Scanner;

public class if_연습01 {

	public static void main(String[] args) {
//		아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를, 종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
//		입력, 수정, 조회, 삭제, 종료
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴 번호를 눌러주세요: ");
		int num = Integer.parseInt(sc.nextLine());
		
		while(true) {
			if(num == 1) {
				System.out.println("입력 메뉴입니다.");
				break;
			}else if(num == 2) {
				System.out.println("수정 메뉴입니다.");
				break;
			}else if(num == 3) {
				System.out.println("조회 메뉴입니다.");
				break;
			}else if(num == 4) {
				System.out.println("삭제 메뉴입니다.");
				break;
			}else if(num == 5) {
				break;
		}
		}
		System.out.println("종료 되었습니다.");
	}

}
