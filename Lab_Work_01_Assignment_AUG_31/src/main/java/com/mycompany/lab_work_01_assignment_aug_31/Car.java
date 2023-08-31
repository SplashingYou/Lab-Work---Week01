/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_work_01_assignment_aug_31;

/**
 *
 * @author Richard Williams IV
 */
public class Car extends Vehicle {
    String brand;
    
    public void Honk(){
    System.out.println("Honk, honk!");
    }
    
    public void displayInfo(){
        System.out.println("Number of wheels: " + "" + numberOfWheels);
        System.out.println("Color: " + color);
        System.out.println("Engine Size: " + engineSize);
        System.out.println("Fuel Type: " + fuelType);
    }
    
}