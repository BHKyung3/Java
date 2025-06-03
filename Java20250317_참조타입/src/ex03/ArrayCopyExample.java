package ex03;

public class ArrayCopyExample {
//	배열복사 => 일반 배열은 확장이 불가하다. 확장을 하려면 새로운 배열을 만들고 이주 시켜야 한다.

	public static void main(String[] args) {

//		int[] oldInArray = new int[] {10, 20, 30, 40, 50};
		
		int[] oldIntArray = {1, 2, 3};
		
		System.out.println(oldIntArray.length);
		
		int[] newIntArray = new int[6];
		
//		배열복사
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i]; // 배열복사 
		}
//		배열출력
		for(int i=0; i<newIntArray.length; i++)
			System.out.print(newIntArray[i] + " ");
		
		System.out.println();
		
		int[] intArray = new int[10];
//		배열복사 (위에 내용과 동일하게 배열을 복사하나 기재 방법이 다름)
		System.arraycopy(newIntArray, 0, intArray, 0, newIntArray.length);
//		배열출력
		for(int i=0; i<newIntArray.length; i++)
			System.out.print(intArray[i] + " ");
			
		System.out.println();

//			향상된 for 문
		for(int i : intArray)
			System.out.print(i + " ");
	}
}
