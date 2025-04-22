/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalpractice;

/**
 *
 * @author mathe
 */
public class Car {
    
   private int id;
   private String brand;
   private String model;
   private String year;
   private int price;
   private boolean isRented;
   
  public Car(int id, String brand, String model, String year,int price,boolean isRented){
      
  this.id=id;
  this.brand=brand;
  this.model=model;
  this.year=year;
  this.price=price;
  this.isRented=isRented;
  
  }
  public int getId(){return id;}
  public String getBrand(){return brand;}
  public String getModel(){return model;}
  public String getYear(){return year;}
  public int getPrice(){return price;}
  public boolean getIsRented(){return isRented;}
  
  public void setIsRented(boolean rented){
  this.isRented=rented;
  }
  
  public void display(){
  System.out.println("ID: "+id);  
  System.out.println("Brand: "+brand);
  System.out.println("Model: "+model);
  System.out.println("Year: "+year);
  System.out.println("Price: "+price);
  if(isRented){
  System.out.println("Avialable: No");
  }
  else{System.out.println("Avialable: Yes");}
  }
    
}
