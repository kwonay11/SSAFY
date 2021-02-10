package com.ssafy.product;

import java.util.ArrayList;

public interface IProductMgr {

	void add(Product product);

	ArrayList<Product> getList();

	ArrayList<Product> searchByP_num(int p_num);

	ArrayList<Product> searchByName(String name);

	//	TV 정보만 검색
	TelVision[] getTv();

	//	Refrigerator 만 검색
	Ref[] getRef();

	//400L이상 냉장고만 검색
	Ref[] getRefLiter();

	//50인치이상의 티비만 검색
	TelVision[] getTvInch();

	//	상품번호로 상품을 삭제하는 기능
	void remove(int p_num);

	//	전체 재고 상품 금액을 구하는 기능
	int getTotalPrice();

}