package com.tcs.ilp;

public class Stationay {

	private static int IdGenerator = 1;
	private int ProductId;
	private String Name;
	private String ProductType;
	private double Quantity;
	private double Price;
	
	public Stationay(String Name, double Quantity, double Price) {
		this.ProductId = IdGenerator++;
		this.Name = Name;
		this.ProductType = "Stationay";
		this.Quantity = Quantity;
		this.Price = Price;
	}

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getProductType() {
		return ProductType;
	}

	public void setProductType(String productType) {
		ProductType = productType;
	}

	public double getQuantity() {
		return Quantity;
	}

	public void setQuantity(double quantity) {
		Quantity = quantity;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}
}
