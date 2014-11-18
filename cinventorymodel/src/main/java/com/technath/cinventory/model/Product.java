package com.technath.cinventory.model;

public class Product {
	private String productCode;
	
	private String productName;

	private String description ;
	
	private String supplierCode ;
	
	private String supplierName;
	
	private double costPriceINR ;
	
	private double costPriceUSD ;
	
	private String orderId ;

	
	public Product(String productCode, String productName, String description,
			String supplierCode, String supplierName, double costPriceINR,
			double costPriceUSD, String orderId) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.description = description;
		this.supplierCode = supplierCode;
		this.supplierName = supplierName;
		this.costPriceINR = costPriceINR;
		this.costPriceUSD = costPriceUSD;
		this.orderId = orderId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public double getCostPriceINR() {
		return costPriceINR;
	}

	public void setCostPriceINR(double costPriceINR) {
		this.costPriceINR = costPriceINR;
	}

	public double getCostPriceUSD() {
		return costPriceUSD;
	}

	public void setCostPriceUSD(double costPriceUSD) {
		this.costPriceUSD = costPriceUSD;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	
	



}
