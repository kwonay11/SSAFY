package com.ssafy.product;


public class ProductTest {

	public static void main(String[] args) {
		
		IProductMgr productmgr = new ProductMgrImpl();
		
		productmgr.add(new TelVision(1234, "Samsung",1000, 232, 50, "OLED"));
		productmgr.add(new TelVision(123, "Apple",2000, 23442, 30, "QLED"));
		productmgr.add(new TelVision(12364, "One",2000, 10003, 80, "QLED"));
		productmgr.add(new Ref(2355, "LG", 34204, 234, 400));
		productmgr.add(new Ref(348, "Win", 472, 200, 800));
		
		System.out.println("**********************상품 전체 목록**********************");
		for (Product p : productmgr.getList()) {
			System.out.println(p);
		}
		System.out.println("**********************TV 목록**********************");
		for (Product p : productmgr.getTv()) {
			System.out.println(p);
		}
		System.out.println("**********************냉장고 목록**********************");
		for (Product p : productmgr.getRef()) {
			System.out.println(p);
		}
		System.out.println("**********************상품 번호:1234**********************");
		System.out.println( productmgr.searchByP_num(1234));
		
		System.out.println("*********************상품 번호:123 삭제*********************");
		productmgr.remove(123);
		for (Product p : productmgr.getList()) {
			System.out.println(p);
		}
		System.out.println("*********************상품명 LG 찾기*********************");
		System.out.println(productmgr.searchByName("LG"));
		
		System.out.println("*********************400L이상 냉장고*********************");
		System.out.println(productmgr.getRefLiter());
		
		System.out.println("*********************50인치이상 티비*********************");
		System.out.println(productmgr.getTvInch());
		
		
		System.out.println();
		
		System.out.println("상품 가격 총합 : "+ productmgr.getTotalPrice());

	}

}





