package com.test;

public class Main {
    public static void main(String[] args) {
        Flight.FlightDataBase flightDataBase = new Flight.FlightDataBase();
        flightDataBase.checkIfFlightExists("Madryt", "Paryż");
        flightDataBase.getFlightsFromCity("Toruń");
    }

}
