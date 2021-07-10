package test.ashishjaintechg.jpa;

import java.math.BigDecimal;

public class Coupon {
	
	private int id;
	private String name;
	private float discount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	
	public static Coupon getCouponByCode(String code) {
		Coupon c1 = new Coupon();
		c1.setId(101);
		c1.setName(code);
		c1.setDiscount(10.0f);
		return c1;
	}
	
	
}
