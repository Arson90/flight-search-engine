package application;

import application.data.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightDatabase {
    List<Flight> flights = new ArrayList<>();

    FlightDatabase(){
        init();
    }

    private void init(){
        flights.add(new Flight(1,"Warsaw", "Berlin", 120));
        flights.add(new Flight(2,"Berlin", "Warsaw", 135));
        flights.add(new Flight(3,"Berlin", "Madrid", 230));
        flights.add(new Flight(4,"Madrid", "Berlin", 245));
        flights.add(new Flight(5,"Porto", "Paris", 300));
        flights.add(new Flight(6,"Paris", "Porto", 290));
        flights.add(new Flight(7,"Madrid", "Porto", 185));
        flights.add(new Flight(8,"Porto", "Madrid", 175));
        flights.add(new Flight(9,"Paris", "Madrid", 115));
        flights.add(new Flight(10,"Madrid", "Paris",140));
        flights.add(new Flight(11,"Paris", "Berlin", 500));
        flights.add(new Flight(12,"Berlin", "Paris", 550));
    }
}
