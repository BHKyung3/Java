package ex04;

import java.util.Arrays;
import java.util.StringTokenizer;

public class SrtingTokenizerExample {

	public static void main(String[] args) {

		String data1 = "홍길동&이수홍,박연수-박수홍";
		String[] arr = data1.split("&|,|-");
		
//		for(String token : arr) {
//			System.out.println(token); } ↓ 아래 내용과 같은 표현 방법
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		
		String data2 = "홍길동/이수홍/박연수/박수홍";
		StringTokenizer st = new StringTokenizer(data2, "/");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
