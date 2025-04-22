/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.inheritance;

/**
 *
 * @author mathe
 */
public class VehicleInheritance {

    /**
     * @param args the command line arguments
     */
    String brand ="Toyota";
    String model ="Corolla";
    int year =2020;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
                
    public static void startEngine(){
    System.out.println("Engine started");
    }
    public void displayInfo(String brand,String model,int year,int noOfDoors,boolean hasSideCar){
    System.out.println(brand);
    System.out.println(model);
    System.out.println(year);
    }
}
