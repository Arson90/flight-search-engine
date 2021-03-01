package application;

import application.data.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightService {
    public static final String RESPONDER = "Flight doesn't exists!";
    private FlightDatabase flightDatabase;

    public FlightService(){
        this.flightDatabase = new FlightDatabase();
    }

    public Flight checkIfFlightExists(String departure, String arrival){

        if (departure != null && arrival != null){
            for (Flight flight : this.flightDatabase.getFlights()) {
                if (flight.getDeparture().equals(departure) && flight.getArrival().equals(arrival)){
                    return flight;
                }
            }
        }
        return null;
    }

    public List<Flight> getFlightsFromCity(String city) {
        List<Flight> list = new ArrayList<>();

        for (Flight flight : this.flightDatabase.getFlights()){
            if (city.equals(flight.getDeparture())){
                list.add(flight);
            }
        }
        return list;
    }

    public List<Flight> getFlightToCity(String city){
        List<Flight> list = new ArrayList<>();

        for (Flight flight : this.flightDatabase.getFlights()){
            if (city.equals(flight.getArrival())){
                list.add(flight);
            }
        }
        return list;
    }

    public List<Flight> getAllFlights() {
        List<Flight> list = new ArrayList<>();

        for (Flight flight : this.flightDatabase.getFlights()){
            list.add(flight);
        }
        return list;
    }

    public Flight getTheCheapestFlight(){
        Flight cheapestFlight = null;

        for (Flight flight : this.flightDatabase.getFlights()){
            if (cheapestFlight == null || flight.getPrice() < cheapestFlight.getPrice()){
                cheapestFlight = flight;
            }
        }
        return cheapestFlight;
    }
}
