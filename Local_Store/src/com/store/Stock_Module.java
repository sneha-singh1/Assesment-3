package com.store;

public class Stock_Module {
	private int productCode;
	private String productName;
	private float cost;
	private int quantity;
	
	public Stock_Module(int productCode, String productName, float cost, int quantity) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.cost = cost;
		this.quantity = quantity;
	}

	public int getProductCode() {
		return productCode;
	}


	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public float getCost() {
		return cost;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "stockModule [productCode=" + productCode + ", productName=" + productName + ", cost=" + cost + ", quantity=" + quantity + "]";
	}
	

}


