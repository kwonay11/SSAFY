package com.ssafy.product;

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product(123, "Samsung", 10000, 2);
		Product p2 = new Product(456, "LG", 12000, 5);
		Product p3 = new Product(789, "Apple", 9000, 6);
		
		ProductManager man = new ProductManager();
		
		man.add(p1);
		man.add(p2);
		man.add(p3);
		
		System.out.println("--------리스트 보기---------");
		man.list();
		
		System.out.println("--------상품 검색---------");
		System.out.println(man.list(123));
		
		man.delete(456);
		System.out.println("--------삭제 후 리스트 보기---------");
		man.list();
		
		System.out.println("--------10000원이하 검색---------");
		Product[] pp = man.priceList(10000) ;
		for(Product x: pp) {
			System.out.println(x);
		}
		
		
		
		
		
		
		
	}

}
