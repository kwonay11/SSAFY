package com.ssafy.algo;

public class ProductTest {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		Refrigerator rf = new Refrigerator();
		
		tv.setP_num(1234);
		tv.setName("PAVV");
		tv.setPrice(230);
		tv.setNum(3);
		tv.setInch(50);
		tv.setType("OLED");
		
		rf.setP_num(54321);
		rf.setName("Samsung");
		rf.setPrice(300);
		rf.setNum(2);
		rf.setLiter(100);
		
		System.out.println("==TV 정보==");
		System.out.println(tv.toString());
		System.out.println("==냉장고 정보==");
		System.out.println(rf.toString());
		

	}

}

class Tv {
	private int p_num;//제품번호
	private String name; //제품이름
	private int price; //가격
	private int num; //수량
	private int inch; //인치
	private String type; //디스플레이 타입
	
	public String toString() {
		String s =("제품번호: " + p_num +" 제품이름: "+ name + " 가격 : " + price +" 수량 : " + num + " 인치 : "+inch+" 타입 : " + type );
		return s;
	}
	
	public void setP_num(int a) {
		p_num = a;
	}
	public int getP_num() {
		return p_num;
	}
	public void setName(String a) {
		name = a;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int a) {
		price = a;
	}
	public int getPrice() {
		return price;
	}
	public void setNum(int a) {
		num = a;
	}
	public int getNum() {
		return num;
	}
	public void setInch(int a) {
		inch = a;
	}
	public int getInch() {
		return inch;
	}
	public void setType(String a) {
		type = a;
	}
	public String getType() {
		return type;
	}
	

}

 class Refrigerator {
	private int p_num;//제품번호
	private String name; //제품이름
	private int price; //가격
	private int num; //수량
	private int liter ;//용량
	
	public String toString() {
		String s =("제품번호: " + p_num +" 제품이름: "+ name + " 가격 : " + price +" 수량 : " + num + " 용량(L) : "+ liter );
		return s;
	}
	
	

	public void setP_num(int a) {
		p_num = a;
	}
	public int getP_num() {
		return p_num;
	}
	public void setName(String a) {
		name = a;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int a) {
		price = a;
	}
	public int getPrice() {
		return price;
	}
	public void setNum(int a) {
		num = a;
	}
	public int getNum() {
		return num;
	}
	public void setLiter(int a) {
		liter = a;
	}
	public int getLiter() {
		return liter;
	}
	

}

