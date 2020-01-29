package com.CarProject;

import java.util.ArrayList;

public class NewCar {
	
	String imgUrl;
	String id;
	String year;
	String make;
	String model;
	String price;

	
	public NewCar() {}
	
	public NewCar(String imgUrl, String id,String year,String make,String model ,String price)
	{
		
	}
	
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public String toString() {
		return getImgUrl() + " "+ getId() + " " + getYear() + " " + getMake() + " " + 
				getModel() +" " + getPrice();
	}


			     	
		  
		
	
	public static int findCarInArraylist(ArrayList<NewCar> newCars, String s)
	{
		
		
		  for(NewCar findCar : newCars) 
		  {
			     if(findCar.getId().equals(s))
			         return (newCars.indexOf(findCar));
			    
		  }
		  return -1;
	}
		  	
	

	
	

	


}


