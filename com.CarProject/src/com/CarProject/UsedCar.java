package com.CarProject;

public class UsedCar {


	String imgUrl;
	String saleId;
	String year;
	String make;
	String model;
	String mileage;
	String price;
	String purchaseDate;
	
	
	
	public UsedCar() {}
	
	public UsedCar(String imgUrl, String saleId,String year,String make,String model,String mileage , String price, String purchaseDate)
	{
		
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getSaleId() {
		return saleId;
	}

	public void setSaleId(String saleId) {
		this.saleId = saleId;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Override
	public String toString() {
		return "UsedCar [imgUrl=" + imgUrl + ", saleId=" + saleId + ", year=" + year + ", make=" + make + ", model="
				+ model + ", mileage=" + mileage + ", price=" + price + ", purchaseDate=" + purchaseDate + "]";
	}


	
	
	
	
	
	
	
	
}
