package com.tcs.ilp;

public class Stationay {

	private static int idGenerator = 1;
	private int productId;
	private String name;
	private String productType;
	private int quantity;
	private double price;
	
	public Stationay(String name, int quantity, double price) {
		this.productId = idGenerator++;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
        return ("ProductId: " + this.productId +
                    ", Name: " + this.name +
                    ", Product Type: " + this.getClass().getSimpleName() +
                    ", Quantity: " + this.quantity +
        			", Price: $" + this.price);
   }   
}
