package ch01.ex03;

	class GrandParent{
		private String 할아버지성함; // private 기재로 다른 곳에서 접근을 할 수 없다면 get, return 기재하여 사용.
		
		String get할아버지성함() {
			return 할아버지성함;
		}
		GrandParent() {}
		
		GrandParent(String 할아버지성함){
			this.할아버지성함 = 할아버지성함;
		}
	}

	class Parent extends GrandParent {
		private int 아버지나이;
		
		int get아버지나이() {
			return 아버지나이;
		}
		
		Parent () {}
		
		Parent(String 할아버지성함, int 아버지나이){
			super(할아버지성함); //상위클래스 생성자 호출(인자값 1개 받을 수 있는)
			this.아버지나이 = 아버지나이;
		}
	}

	class Child extends Parent{
		String 나의취미;
		
		Child() {}
		
		public Child(String 할아버지성함, int 아버지나이, String 나의취미){
			super(할아버지성함, 아버지나이); //상위클래스 생성자 호출(인자값 2개 받을 수 있는)
			this.나의취미 = 나의취미;
		}
		
		void displayInfo() {
		}

		public static void main(String[] args) {
			
			Child child = new Child("김철수", 50, "야구");
			child.displayInfo();
			System.out.println("할아버지 성함은" + " " + 할아버지성함 + "입니다.");
			System.out.println("아버지 연세는" + " " + 아버지나이 + "세입니다.");
			System.out.println("나의 취미는" + " " + 나의취미 + "입니다.");
		}

}
