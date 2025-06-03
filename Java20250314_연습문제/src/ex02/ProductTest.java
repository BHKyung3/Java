package ex02;

import ex02.Product;

/*
	5개의 원소를 갖는 Product 타입의 배열을 생성한 후에Product 객체를 5개 
생성하여 각각의 원소로 대입하고 Product 객체들의 각 정보들을 행 단위로 
출력한다.(상품명   재고량   가격)–가격은 천단위로 , 를 붙이고 금액 끝에 
‘원’도 붙여서 출력한다
*/

public class ProductTest {

public static void main(String[] args) {

Product[] products = new Product[5];

products[0] = new Product();
products[1] = new Product("파산핑", 100, 18000);
products[2] = new Product("소주", 20, 1800);
products[3] = new Product("담배", 10, 4500);
products[4] = new Product("틈새라면", 45, 1250);

 for(int i=0; i<products.length; i++) {
	 System.out.println(products[i]);
 }
}

}