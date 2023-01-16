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

    public void checkIfFlightExists(String start, String end){
//        boolean noExist = true;
        for (Flight flight : flights) {
            if(flight.departure.equals(start) && flight.arrival.equals(end)){
                System.out.println("flight exist");
                return;
//                noExist = false;
            }
        }
//        if(noExist){
//            System.out.println("flight not exist");
//        }
        System.out.println("flight not exist");
    }

    public ArrayList<Flight> getFlightFromCity(String city){
        ArrayList<Flight> findFlight = new ArrayList<>();
        boolean noExist = true;
        for (Flight flight : flights) {
            if(city.equals(flight.departure)){
//                System.out.println(flight.getDetails());
                findFlight.add(flight);
                noExist = false;
            }
        }
        if(noExist){
            System.out.println("Flight not exist");
        }
        return findFlight;
    }

    public ArrayList<Flight> getFlightToCity(String city){
        ArrayList<Flight> findFlight = new ArrayList<>();
        boolean noExist = true;
        for (Flight flight : flights) {
            if(city.equals(flight.arrival)){
//                System.out.println(flight.getDetails());
                findFlight.add(flight);
                noExist = false;
            }
        }
        if(noExist){
            System.out.println("Flight not exist");
        }
        return findFlight;
    }

    public void displayFlights(ArrayList<Flight> result){
        if(result.isEmpty()){
            System.out.println("Flight not exist");
        }
        for (Flight flight : result) {
            System.out.println(flight.getDetails());
        }

    }

    public void displayFlightsFromCity(String city){
        ArrayList<Flight> result = getFlightFromCity(city);
        displayFlights(result);
    }
    public void displayFlightsToCity(String city){
        ArrayList<Flight> result = getFlightToCity(city);
        displayFlights(result);
    }

    public ArrayList<String> cities(){
        ArrayList<String> allCities = new ArrayList<>();
        for (Flight flight : flights) {
            if (!allCities.contains(flight.getArrival())) {
                allCities.add(flight.arrival);
            }
            if (!allCities.contains(flight.getDeparture())) {
                allCities.add(flight.departure);
            }
        }
        return allCities;
    }
}
