package ex06;

public class GuGuDanExpr extends Multiplication {
	
	private GuGuDanExpr() {}
	
	GuGuDanExpr(int dan) {
		super();
	}

	public GuGuDanExpr(int dan, int number) {
		super(dan, number);
		 } 
	public static void printAll() {
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");			
			}
			System.out.println();
		}
	}
}
