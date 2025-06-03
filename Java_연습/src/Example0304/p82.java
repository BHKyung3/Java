package Example0304;

public class p82 {

	public static void main(String[] args) {

//		문자열) +, -가 앞에 있으면 +1 이후 대입 뒤에 있으면 대입 후 +1
		
		int x = 8;
		int y = 10;
		int z;
		
		x--; --x;
		System.out.println("x= " + x);
		
		y++; ++y;
		System.out.println("y= " + y);
		
		z = x++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		z = ++x;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		z = --x + y++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		
	}

}