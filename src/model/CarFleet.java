/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author TT
 */
public class CarFleet {
    private ArrayList<Car> carList;
    private Date updateTime;
    
    public CarFleet(){
        this.carList = new ArrayList<Car>();
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }

    
    public Car addNewCar(){
        
        Car newCar = new Car();
        carList.add(newCar);  // add this new car to ArrayList carFleet
        return newCar;
                
    }

    public void deleteCar(Car che) {
        carList.remove(che);
        
    }
    
    public void addNewCar(Car che){
        carList.add(che);  // add  to ArrayList 
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    
}
