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
public class Motocycle extends VehicleInheritance {
    boolean hasSideCar =true;
    
    @Override
    public void displayInfo(String brand,String model,int year,int noOfDoors,boolean hasSideCar){
     System.out.println(hasSideCar);
     
    }
    
}
