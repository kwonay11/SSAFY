package com.ssafy.product;

public class Product {
	//필드
	private int num;
	private String name;
	private int price;
	private int count;
	
	
	public Product(int num, String name, int price, int count) { //필드값 생성자
		super();
		this.num = num;
		this.name = name;
		this.price = price;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Product [num=" + num + ", name=" + name + ", price=" + price + ", count=" + count + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	
	

}
