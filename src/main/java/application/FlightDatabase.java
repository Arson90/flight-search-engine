package application;

import application.data.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightDatabase {
    private List<Flight> flights;

    public FlightDatabase(){
        this.flights = new ArrayList<>();
        init();
    }

    private void init(){
        this.flights.add(new Flight(1,"Warsaw", "Berlin", 120));
        this.flights.add(new Flight(2,"Berlin", "Warsaw", 135));
        this.flights.add(new Flight(3,"Berlin", "Madrid", 230));
        this.flights.add(new Flight(4,"Madrid", "Berlin", 245));
        this.flights.add(new Flight(5,"Porto", "Paris", 300));
        this.flights.add(new Flight(6,"Paris", "Porto", 290));
        this.flights.add(new Flight(7,"Madrid", "Porto", 185));
        this.flights.add(new Flight(8,"Porto", "Madrid", 175));
        this.flights.add(new Flight(9,"Paris", "Madrid", 115));
        this.flights.add(new Flight(10,"Madrid", "Paris",140));
        this.flights.add(new Flight(11,"Paris", "Berlin", 500));
        this.flights.add(new Flight(12,"Berlin", "Paris", 550));
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }
}
