package com.ssafy.product;

import java.util.ArrayList;



public class ProductMgrImpl implements IProductMgr {

	ArrayList<Product> list = new ArrayList<>();  //ArrayList로 구현
//	private static int MAX = 100;
//	private Product[] products = new Product[MAX];
//	private int count;
	
	
	@Override
	public void add(Product product) {
//		if(count<MAX)
//			products[count++] = product ;
		list.add(product);
	}
	ProductMgrImpl() { //생성자
		
	}
	@Override
	public ArrayList<Product> getList() { //상품정보 전체를 검색하는 기능
		return list;
	} 
	@Override
	public Product searchByP_num(int p_num) { //상품번호로 상품을 검색하는 기능
		Product tmp = null;
		for(Product p : list) {
			if(p.getP_num() == p_num)
				tmp = p;
		}
		return tmp;
	}
	@Override
	public ArrayList<Product> searchByName(String name) { //상품명으로 상품을 검색하는 기능 
		ArrayList<Product> tmp = new ArrayList<>();
		for (Product p: list) {
			if (p.getName().equals(name))
				tmp.add(p);
		}
		return tmp ;
	}
//	TV 정보만 검색
	@Override
	public ArrayList<TelVision> getTv() {
		ArrayList<TelVision> result = new ArrayList();
		for(Product p : list) {
			if(p instanceof TelVision)
				result.add((TelVision) p);
		}
		return result;
	} 
//	Refrigerator 만 검색
	@Override
	public ArrayList<Ref> getRef() {
		ArrayList<Ref> result = new ArrayList();
		for(Product p : list) {
			if(p instanceof Ref)
				result.add((Ref) p);
		}
		return result;
	} 
	//400L이상 냉장고만 검색
	@Override
	public ArrayList<Ref> getRefLiter() {
		ArrayList<Ref> result = new ArrayList();
		for(Ref p : getRef() ) {
			if(p.getLiter() >= 400)
				result.add(p);
		}
		return result;
	}
	//50인치이상의 티비만 검색
	@Override
	public ArrayList<TelVision> getTvInch() {
		ArrayList<TelVision> result = new ArrayList();
		for(TelVision p : getTv() ) {
			if(p.getInch() >= 50)
				result.add(p);
		}
		return result;
	} 
//상품번호와 가격을 입력 받아 상품 가격을 변경할 수 있는 기능
	public void update(int p_num, int price ){
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getNum()== p_num) {
				list.get(i).setPrice(price);
			}
		}
	}
	
//	상품번호로 상품을 삭제하는 기능
	@Override
	public void remove(int p_num) {
		for(Product p : list) {
			if(p.getP_num() == p_num)
				list.remove(p);
			break;
		}
	}
//	전체 재고 상품 금액을 구하는 기능
	@Override
	public int getTotalPrice() {
		int total = 0;
		for(Product p : list) {
			total += p.getPrice();
		}
		
		return total;
	}

	

}