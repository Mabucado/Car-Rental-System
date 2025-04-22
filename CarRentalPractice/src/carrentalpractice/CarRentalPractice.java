/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalpractice;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class CarRentalPractice {

    /**
     * @param args the command line arguments
     */
   static Scanner scanner;
   static List<Customer> customer =new ArrayList<>();
   static List<Car> car=new ArrayList<>();
    public static void main(String[] args) {
        // TODO code application logic here
        scanner =new Scanner(System.in);
        int selection=0;
        while(selection!=7){
        System.out.println(" 1. Register customer \n 2. Add a car \n 3. Rent a car \n 4. Display all Cars \n 5. Return a car \n 6. Display all customers \n 7. Exit");
        selection = scanner.nextInt();
        scanner.nextLine(); 
        switch(selection){
            case 1: registerCustomer();
            break;
            case 2: if(customer.size()>0){addCar();}else{System.out.println("Register first.");}
            break;
            case 3: if(customer.size()>0){rentCar();}else{System.out.println("Register first.");}
            break;
            case 4: if(customer.size()>0){displayAllCars();}else{System.out.println("Register first.");}
            break;
            case 5: if(customer.size()>0){returnRentedCar();}else{System.out.println("Register first.");}
            break;
            case 6: if(customer.size()>0){displayAllCustomers();}else{System.out.println("Register first.");}
            break;
        }
        }
    }
    public static void registerCustomer(){
    System.out.println("Enter your name: ");
    String name = scanner.nextLine();
    System.out.println("Enter your surname: ");
    String surname = scanner.nextLine();
    String email="";
    while(!email.contains("@")){
    System.out.println("Enter your email: ");
     email= scanner.nextLine();
     if(!email.contains("@")){
     System.out.println("Invalid email! ");
     }
    }
    System.out.println("Enter your age: ");
    int age = scanner.nextInt();
    int length=customer.size();
    if(length>0){
    customer.add(new Customer(customer.get(length-1).getId()+1,name,surname,email,age,0));
    System.out.println(("Your ID is: "+customer.get(length-1).getId())+1);
      }else{
    customer.add(new Customer(101,name,surname,email,age,0));
    System.out.println( "Your ID is: "+101);
    }
    }
    public static void addCar(){
    System.out.println("Enter car brand: ");
    String brand= scanner.nextLine();
    System.out.println("Enter car model: ");
    String model= scanner.nextLine();
    System.out.println("Enter car year: ");
    String year= scanner.nextLine();
    System.out.println("Enter car price: ");
    int price= scanner.nextInt();
    
    int length=car.size();
    if(length>0){
    car.add(new Car((car.get(length-1).getId())+1,brand,model,year,price,false));
    
           
      }else{
    car.add(new Car(201,brand,model,year,price,false));
    
    }
    }
    public static void rentCar(){
    System.out.println("Enter your id: ");
    int id = scanner.nextInt();
    System.out.println("Enter car id: ");
    int carId=scanner.nextInt();
    boolean alreadyRented = false;
    for(Customer c:customer){
        System.out.println(c.getId());
    if(c.getId()==id){
        if(c.getRentedCar()==0){
    c.setRentedCar(carId);
        }
        else{
        System.out.println("You have already rented a car");
        alreadyRented=true;
        }
    }
    }
    for(Car c:car){
        System.out.println(c.getId());
    if(c.getId()==carId){
       if(alreadyRented){
    c.setIsRented(true);
    
       }
    }else{
    System.out.println("Car doesnt exist.");
    }
    }
    }
     public static void returnRentedCar(){
    System.out.println("Enter your id: ");
    int id = scanner.nextInt();
    
    boolean alreadyRented = false;
    for(Customer c:customer){
    if(c.getId()==id){
        if(c.getRentedCar()>0){
    c.setRentedCar(0);
    for(Car r:car){
    if(r.getId()==c.getRentedCar()){
       if(alreadyRented){
    r.setIsRented(false);
    break;
       }
    }else{
    System.out.println("Car doesnt exist.");
    }
    }
        }
        else{
        System.out.println("You don't have a rented a car");
        alreadyRented=true;
        }
    }
    }
    
    }
    public static void displayAllCars(){
    for(Car c:car){
    c.display();
    }
    }
    public static void displayAllCustomers(){
    for(Customer c:customer){
    c.displayCustomers();
    }
    }
}
