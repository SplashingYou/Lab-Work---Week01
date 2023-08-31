/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_work_01_assignment_aug_31;

/**
 *
 * @author Richard Williams IV
 */
public class Vehicle {
    protected int numberOfWheels;
    protected String color;
    protected float engineSize;
    protected String fuelType;
    
    public Vehicle(){
        numberOfWheels = 0;
        color = "NO_COLOR";
        engineSize = 0;
        fuelType = "NO_FUEL_TYPE";
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public int getNumberOfWheels(){
        return numberOfWheels;
    }
    
    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }
    
    public String getFuelType(){
        return fuelType;
    }
    
    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }
    
    public float getEngineSize(){
        return engineSize;
    }
    
    public void setEngineSize(float engineSize){
        this.engineSize = engineSize;
    }
    
    
    
}
