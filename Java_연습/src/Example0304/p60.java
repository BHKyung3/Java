package Example0304;

public class p60 {

	public static void main(String[] args) {

//		자동변환타입) 작은 정수(실수)를 큰 정수(실수)로 변환하는 방법
//		작은 허용 범위 타입 = (작은허용범위타입)큰 허용 범위 타입
		
		int var1 = 100;
		byte var2 = (byte)var1;
			System.out.println(var2);
		
		int v10 = 1;
		int v11 = 2;
		double result = (double) v10 / v11;
			System.out.println(result);
	}

}
