package com.test;

public class Flight {
    private String deperture;
    private String arrival;

    public Flight(String arrival, String deperture){
        this.arrival = arrival;
        this.deperture = deperture;
    }

    public String getDetails(){
        return "Flight from: " + this.deperture + "Flight to: " + this.arrival;
    }

}
