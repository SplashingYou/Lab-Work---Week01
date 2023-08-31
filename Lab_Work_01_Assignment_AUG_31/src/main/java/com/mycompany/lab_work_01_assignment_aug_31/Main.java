/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_work_01_assignment_aug_31;

/**
 *
 * @author Richard Williams IV
 */
public class Main {
    public static void main(String[] args){
        Car Toyota = new Car();
        Toyota.setColor("Blue");
        Toyota.setNumberOfWheels(4);
        Toyota.setEngineSize((float)2.5);
        Toyota.setFuelType("Gas");
        
        Toyota.displayInfo();
        
    }
    
}
