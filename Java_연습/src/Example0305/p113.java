package Example0305;

public class p113 {

	public static void main(String[] args) {

//		if문 사용
		
		int score = 80;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A등급 입니다.");
		}
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B등급 입니다.");
//			위에 코딩보다 간결하게 사용하는 법 esle 사용하기.
			
		int score1 = 80;
				
		if(score1 >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A등급 입니다.");
		}else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B등급 입니다.");
		}
		}
	}

}
