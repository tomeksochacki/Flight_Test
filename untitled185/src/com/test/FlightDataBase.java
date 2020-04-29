package com.test;

import java.util.ArrayList;

public class FlightDataBase {
    ArrayList<Flight> flights = new ArrayList<>();
    public FlightDataBase(){
        this.flights.add(new Flight("Warszawa", "Toruń"));
        this.flights.add(new Flight("Kraków", "Wroław"));
    }

}
