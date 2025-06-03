package ex04;

public class GradeExpr {
	
	private int[] jumsu;
//	private int sum = 0; 해당 방식으로도 표현 가능
	public GradeExpr() {}
	
	public GradeExpr(int[] jumsu){
		this.jumsu = jumsu;
		
	}
	
	int getTotal() {
		int sum = 0;
		for(int i=0; i<jumsu.length; i++)
			sum += jumsu[i];
		return sum;
	}
	double getAverage() {
		return (double)getTotal()/jumsu.length;
	}
	public int getGoodScore() {
		int max = jumsu[0];
		for(int i=0; i<jumsu.length; i++) {
			if(max < jumsu[i])
				max = jumsu[i];
		}
		return max;
	}
	int getBadScore() {
		int min = jumsu[0];
		for(int i=0; i<jumsu.length; i++) {
			if(min > jumsu[i])
				min = jumsu[i];
		}
		return min;
	}
}
