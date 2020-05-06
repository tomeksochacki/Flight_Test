package com.test;

import java.util.ArrayList;

class Flight {
    private String deperture;
    private String arrival;

    public Flight(String arrival, String deperture) {
        this.arrival = arrival;
        this.deperture = deperture;
    }

    public String getDetails() {
        return "Flight from: " + this.deperture + " Flight to: " + this.arrival;
    }


    static class FlightDataBase {
        ArrayList<Flight> flights = new ArrayList<>();

        public FlightDataBase() {
            this.flights.add(new Flight("Warszawa", "Toruń"));
            this.flights.add(new Flight("Kraków", "Wroław"));
        }

        public void getFlightsFromCity(String city){
            boolean isNotFound = true;
            for (int i = 0; i < this.flights.size(); i ++){
                Flight flight = this.flights.get(i);
                if (city.equals(flight.deperture)){
                    System.out.println(flight.getDetails());
                    isNotFound = false;
                }
                if (isNotFound){
                    System.out.println("Flight not found");
                }
            }
        }

        public void checkIfFlightExists(String start, String stop) {
            //boolean notExists = true;
            for (int i = 0; i < this.flights.size(); i++) {
                Flight flight = this.flights.get(i);
                if (start.equals(flight.deperture) && stop.equals(flight.arrival)) {
                    System.out.println("Flight exists");
                    //notExists = false;
                    //break;
                    return;
                }
            }
            //if (notExists) {
                System.out.println("Flihgt with given params not exists.");
            //}
        }

    }
}