package ex04;

public class StringBuilderExample {

	public static void main(String[] args) {

		String data = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 4) //ABCDEF 중 3번째(0~5) D를 삭제 후 표기함
				.toString();
		
		System.out.println(data);
		
		String data2 = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 5) //ABCDEF 중 3번째, 4번째(0~5) DE를 삭제 후 표기함
				.toString();
		
		System.out.println(data2);
		
		String data3 = new StringBuffer()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 5) //ABCDEF 중 3번째, 4번째(0~5) DE를 삭제 후 표기함
				.toString();
		
		System.out.println(data3);
			
	}

}
