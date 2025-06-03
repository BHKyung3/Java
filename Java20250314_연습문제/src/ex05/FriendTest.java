package ex05;

import exercise.Student;

public class FriendTest {

	public static void main(String[] args) {

		Friend[] friends = new Friend[5];
		
		friends[0] = new Friend("갤럭시", "01011112222", "a@naver.com");
		friends[1] = new Friend("아이폰", "01033334444", "b@naver.com");
		friends[2] = new Friend("소니", "01055556666", "c@naver.com");
		friends[3] = new Friend("베가", "01077778888", "d@naver.com");
		friends[4] = new Friend("LG", "01099990000", "e@naver.com");
		
		System.out.println("이름\t전화번호\t메일주소\t");
		for(int i=0; i<friends.length; i++) {
			System.out.println(friends[i].getInfo());
		}
	}

}
