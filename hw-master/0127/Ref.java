package com.ssafy.product;

public class Ref extends Product{
	int liter ;//¿ë·®
	
	public Ref() {}

	public Ref(int p_num, String name, int price, int num, int liter) {
		super( p_num, name, price, num);
		this.liter = liter;
	}

	public int getLiter() {
		return liter;
	}

	public void setLiter(int liter) {
		this.liter = liter;
	}

	@Override
	public String toString() {
		return "Ref [liter=" + liter + ",  toString()=" + super.toString() + "]";
	}

	
	
	

}
