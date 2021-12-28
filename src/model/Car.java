/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author TT
 */
public class Car {
    private int availTime;
    private int availFlag;
    private String madeCompany;
    private int year;
    private int seat;
    private String serialNumber;
    private String modelNumber;
    private String city;
    private int maintenanceState;

    
    
    
    public int getAvailTime() {
        return availTime;
    }

    public void setAvailTime(int availTime) {
        this.availTime = availTime;
    }

    public int getAvailFlag() {
        return availFlag;
    }

    public void setAvailFlag(int availFlag) {
        this.availFlag = availFlag;
    }

    public String getMadeCompany() {
        return madeCompany;
    }

    public void setMadeCompany(String madeCompany) {
        this.madeCompany = madeCompany;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getMaintenanceState() {
        return maintenanceState;
    }

    public void setMaintenanceState(int maintenanceState) {
        this.maintenanceState = maintenanceState;
    }
    
    @Override
    public String toString(){
        return serialNumber;
    
    }
    
}
