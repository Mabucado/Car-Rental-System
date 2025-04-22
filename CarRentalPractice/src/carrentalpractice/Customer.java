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
public class Customer {

    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private int rentedCar;
    
    public Customer(int id,String name, String surname, String email, int age, int rentedCar){
    this.id=id;
    this.name=name;
    this.surname=surname;
    this.email=email;
    this.age=age;
    this.rentedCar=rentedCar;
    }
    
    public int getId(){return id;}
    public String getName(){return name;}
    public String getSurname(){return surname;}
    public String getEmail(){return email;}
    public int getAge(){return age;}
    public int getRentedCar(){return rentedCar;}
    
    public void setRentedCar(int id){
       this.rentedCar=id;
    }
    public void displayCustomers(){
        
        System.out.println("Name: "+this.name);
        System.out.println("Surname: "+this.surname);
        System.out.println("Email: "+this.email);
        System.out.println("Age: "+this.age);
        System.out.println("Rented car: "+this.rentedCar);
    
    }
    
}
