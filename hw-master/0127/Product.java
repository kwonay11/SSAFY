package com.ssafy.product;

public class Product { //부모 클래스
	private int p_num;//제품번호
	private String name; //제품이름
	private int price; //가격
	private int num; //수량
	
	
	public Product() {}
	public Product(int p_num, String name, int price, int num) {
		super();
		this.p_num = p_num;
		this.name = name;
		this.price = price;
		this.num = num;
	}




	public int getP_num() {
		return p_num;
	}



	public void setP_num(int p_num) {
		this.p_num = p_num;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	@Override
	public String toString() {
		return "Product [p_num=" + p_num + ", name=" + name + ", price=" + price + ", num=" + num + "]";
	}
	
	
	

}
