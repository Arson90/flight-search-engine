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

    public String checkIfFlightExists(String departure, String arrival){

        if (departure != null && arrival != null){
            for (Flight flight : flightDatabase.flights) {
                if (flight.getDeparture().equals(departure) && flight.getArrival().equals(arrival)){
                    return flight.getDetails() + " exists";
                }
            }
        }
        return RESPONDER;
    }

    public List<String> getFlightsFromCity(String city) {

        List<String> list = new ArrayList<>();

        for (Flight flight : flightDatabase.flights){
            if (city.equals(flight.getDeparture())){
                list.add(flight.getDetails());
            }
        }
        return list;
    }

    public List<String> getFlightToCity(String city){
        List<String> list = new ArrayList<>();

        for (Flight flight : flightDatabase.flights){
            if (city.equals(flight.getArrival())){
                list.add(flight.getDetails());
            }
        }
        return list;
    }

    public List<Flight> getAllFlights() {
        List<Flight> list = new ArrayList<>();

        for (Flight flight : flightDatabase.flights){
            list.add(flight);
        }
        return list;
    }

    public String getTheCheapestFlight(){
        Flight cheapestFlight = null;

        for (Flight flight : flightDatabase.flights){
            if (cheapestFlight == null || flight.getPrice() < cheapestFlight.getPrice()){
                cheapestFlight = flight;
            }
        }
        return cheapestFlight.getDetails();
    }
}
