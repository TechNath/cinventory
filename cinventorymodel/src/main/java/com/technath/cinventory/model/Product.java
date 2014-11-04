package com.technath.cinventory.model;

public class Product {
	private String productCode;

	private String productDescription ;

	private String notes ; 

	private String barcode ;

	private String units;

	private long minStockAlertLevel;

	private long maxStockAlertLevel;

	private String	binLocation;

	private String supplierCode;

	private String 	supplierName;

	private String supplierProductCode;

	private double defaultPurchasePrice;

	private double sellPriceTier1;

	private double sellPriceTier2;

	private double sellPriceTier3;

	private double sellPriceTier4;

	private double sellPriceTier5;

	private double sellPriceTier6;

	private double sellPriceTier7;

	private double sellPriceTier8;

	private double sellPriceTier9;

	private double sellPriceTier10;

	private int packSize;
	
	private long weight;
	
	private long width ;
	
	private long height;
	
	private long depth;
	
	private double lastCost;
	
	private double neverDimishing;
	
	private String productGroup;
	
	private String salesAccount;
	
	private String purchaseTaxType ;
	
	private float purchaseTaxRate ;
	
	private String salesTaxType ;
	
	private float salesTaxRate ;
	
	private boolean isAssembledProduct;
	
	private boolean isComponent;
	
	private boolean canAutoAssemble;
	
	private boolean isObsoleted;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public long getMinStockAlertLevel() {
		return minStockAlertLevel;
	}

	public void setMinStockAlertLevel(long minStockAlertLevel) {
		this.minStockAlertLevel = minStockAlertLevel;
	}

	public long getMaxStockAlertLevel() {
		return maxStockAlertLevel;
	}

	public void setMaxStockAlertLevel(long maxStockAlertLevel) {
		this.maxStockAlertLevel = maxStockAlertLevel;
	}

	public String getBinLocation() {
		return binLocation;
	}

	public void setBinLocation(String binLocation) {
		this.binLocation = binLocation;
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

	public String getSupplierProductCode() {
		return supplierProductCode;
	}

	public void setSupplierProductCode(String supplierProductCode) {
		this.supplierProductCode = supplierProductCode;
	}

	public double getDefaultPurchasePrice() {
		return defaultPurchasePrice;
	}

	public void setDefaultPurchasePrice(double defaultPurchasePrice) {
		this.defaultPurchasePrice = defaultPurchasePrice;
	}

	public double getSellPriceTier1() {
		return sellPriceTier1;
	}

	public void setSellPriceTier1(double sellPriceTier1) {
		this.sellPriceTier1 = sellPriceTier1;
	}

	public double getSellPriceTier2() {
		return sellPriceTier2;
	}

	public void setSellPriceTier2(double sellPriceTier2) {
		this.sellPriceTier2 = sellPriceTier2;
	}

	public double getSellPriceTier3() {
		return sellPriceTier3;
	}

	public void setSellPriceTier3(double sellPriceTier3) {
		this.sellPriceTier3 = sellPriceTier3;
	}

	public double getSellPriceTier4() {
		return sellPriceTier4;
	}

	public void setSellPriceTier4(double sellPriceTier4) {
		this.sellPriceTier4 = sellPriceTier4;
	}

	public double getSellPriceTier5() {
		return sellPriceTier5;
	}

	public void setSellPriceTier5(double sellPriceTier5) {
		this.sellPriceTier5 = sellPriceTier5;
	}

	public double getSellPriceTier6() {
		return sellPriceTier6;
	}

	public void setSellPriceTier6(double sellPriceTier6) {
		this.sellPriceTier6 = sellPriceTier6;
	}

	public double getSellPriceTier7() {
		return sellPriceTier7;
	}

	public void setSellPriceTier7(double sellPriceTier7) {
		this.sellPriceTier7 = sellPriceTier7;
	}

	public double getSellPriceTier8() {
		return sellPriceTier8;
	}

	public void setSellPriceTier8(double sellPriceTier8) {
		this.sellPriceTier8 = sellPriceTier8;
	}

	public double getSellPriceTier9() {
		return sellPriceTier9;
	}

	public void setSellPriceTier9(double sellPriceTier9) {
		this.sellPriceTier9 = sellPriceTier9;
	}

	public double getSellPriceTier10() {
		return sellPriceTier10;
	}

	public void setSellPriceTier10(double sellPriceTier10) {
		this.sellPriceTier10 = sellPriceTier10;
	}

	public int getPackSize() {
		return packSize;
	}

	public void setPackSize(int packSize) {
		this.packSize = packSize;
	}

	public long getWeight() {
		return weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}

	public long getWidth() {
		return width;
	}

	public void setWidth(long width) {
		this.width = width;
	}

	public long getHeight() {
		return height;
	}

	public void setHeight(long height) {
		this.height = height;
	}

	public long getDepth() {
		return depth;
	}

	public void setDepth(long depth) {
		this.depth = depth;
	}

	public double getLastCost() {
		return lastCost;
	}

	public void setLastCost(double lastCost) {
		this.lastCost = lastCost;
	}

	public double getNeverDimishing() {
		return neverDimishing;
	}

	public void setNeverDimishing(double neverDimishing) {
		this.neverDimishing = neverDimishing;
	}

	public String getProductGroup() {
		return productGroup;
	}

	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}

	public String getSalesAccount() {
		return salesAccount;
	}

	public void setSalesAccount(String salesAccount) {
		this.salesAccount = salesAccount;
	}

	public String getPurchaseTaxType() {
		return purchaseTaxType;
	}

	public void setPurchaseTaxType(String purchaseTaxType) {
		this.purchaseTaxType = purchaseTaxType;
	}

	public float getPurchaseTaxRate() {
		return purchaseTaxRate;
	}

	public void setPurchaseTaxRate(float purchaseTaxRate) {
		this.purchaseTaxRate = purchaseTaxRate;
	}

	public String getSalesTaxType() {
		return salesTaxType;
	}

	public void setSalesTaxType(String salesTaxType) {
		this.salesTaxType = salesTaxType;
	}

	public float getSalesTaxRate() {
		return salesTaxRate;
	}

	public void setSalesTaxRate(float salesTaxRate) {
		this.salesTaxRate = salesTaxRate;
	}

	public boolean isAssembledProduct() {
		return isAssembledProduct;
	}

	public void setAssembledProduct(boolean isAssembledProduct) {
		this.isAssembledProduct = isAssembledProduct;
	}

	public boolean isComponent() {
		return isComponent;
	}

	public void setComponent(boolean isComponent) {
		this.isComponent = isComponent;
	}

	public boolean isCanAutoAssemble() {
		return canAutoAssemble;
	}

	public void setCanAutoAssemble(boolean canAutoAssemble) {
		this.canAutoAssemble = canAutoAssemble;
	}

	public boolean isObsoleted() {
		return isObsoleted;
	}

	public void setObsoleted(boolean isObsoleted) {
		this.isObsoleted = isObsoleted;
	}
	
	



}
