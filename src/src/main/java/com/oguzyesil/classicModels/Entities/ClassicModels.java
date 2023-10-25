package com.oguzyesil.classicModels.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="products")
public class ClassicModels {
	@Id
	@Column(name="productcode")
	String productCode;
	
	@Column(name="productname")
	String productName;
	
	@Column(name="productline")
	String productLine;
	
	@Column(name="productscale")
	String productScale;
	
	@Column(name="productvendor")
	String productVendor;
	
	@Column(name="productdescription")
	String productDescription;

	@Column(name="quantityinstock")
	int quantityInStock;
	
	@Column(name="buyprice")
	double buyPrice;
	
	@Column(name="msrp")
	double MSRP;
	
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

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getProductScale() {
		return productScale;
	}

	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}

	public String getProductVendor() {
		return productVendor;
	}

	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public double getMSRP() {
		return MSRP;
	}

	public void setMSRP(double mSRP) {
		MSRP = mSRP;
	}
	
	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

}
