package project;

import java.util.ArrayList;

public class FlyDatabase {
    ArrayList<Flight> flights = new ArrayList<>();

    public void FlightDatabase(){
        this.flights.add(new Flight("Berlin", "Tokyo"));
        this.flights.add(new Flight("Paris", "Berlin"));
        this.flights.add(new Flight("Warsaw", "Paris"));
        this.flights.add(new Flight("Madrid", "Berlin"));
        this.flights.add(new Flight("Berlin", "Warsaw"));
        this.flights.add(new Flight("Paris", "Madrid"));
        this.flights.add(new Flight("Porto", "Warsaw"));
        this.flights.add(new Flight("Madrid", "Porto"));
        this.flights.add(new Flight("Warsaw", "Madrid"));
    }

    public void checkIfFlightExists(String departure, String arrival){
        for (Flight flight : flights) {
            if(flight.getDeparture().equals(departure) && flight.getArrival().equals(arrival)){
                System.out.println("this flight exist");
            }else {
                System.out.println("flight dosent exist");
            }
        }
    }
}
