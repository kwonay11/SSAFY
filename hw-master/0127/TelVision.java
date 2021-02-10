package com.ssafy.product;

public class TelVision extends Product{
	private int inch;
	private String type;

	
	public TelVision() {}
	
	public TelVision(int p_num, String name, int price, int num,int inch, String type) {
		super( p_num, name, price, num);
		this.inch = inch;
		this.type = type;
	}


	public int getInch() {
		return inch;
	}


	public void setInch(int inch) {
		this.inch = inch;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "TelVision [inch=" + inch + ", type=" + type + ", getP_num()=" + getP_num() + ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + ", getNum()=" + getNum() + ", toString()=" + super.toString()
				+ "]";
	}

	
	
	

}
