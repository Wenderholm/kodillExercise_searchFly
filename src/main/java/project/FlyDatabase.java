package project;

import java.util.ArrayList;

public class FlyDatabase {
    ArrayList<Flight> flights = new ArrayList<>();

    public void FlightDatabase(){
        this.flights.add(new Flight("Berlin", "Tokyo",1800));
        this.flights.add(new Flight("Berlin", "Madrid",2100));
        this.flights.add(new Flight("Paris", "Berlin", 79));
        this.flights.add(new Flight("Warsaw", "Paris",120));
        this.flights.add(new Flight("Warsaw", "New York",20));
        this.flights.add(new Flight("Madrid", "Berlin",200));
        this.flights.add(new Flight("Berlin", "Warsaw",77));
        this.flights.add(new Flight("Paris", "Madrid",180));
        this.flights.add(new Flight("Porto", "Warsaw",412));
        this.flights.add(new Flight("Madrid", "Porto",102));
    }
//    this.flights.add(new Flight("Warsaw", "Paris",120));
//    this.flights.add(new Flight("Paris", "Madrid",180));
//     this.flights.add(new Flight("Warsaw", "New York",20));

// sprawdzenie czy dany lot istnieje
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

//    lista lotów z danego miasta
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

//    lista lotów do danego miasta
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
//wypisanie lotów z danego miasta
    public void displayFlightsFromCity(String city){
        ArrayList<Flight> result = getFlightFromCity(city);
        displayFlights(result);
    }

//    wypisanie lotów do podanego miasta
    public void displayFlightsToCity(String city){
        ArrayList<Flight> result = getFlightToCity(city);
        displayFlights(result);
    }

//    wypisanie wszystkich misat bez duplikatów
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

//    wyznaczenie najtańszego lotu
    public Flight getCheapestFlight(){
        Flight cheapestFlight = null;
        for (Flight flight : flights) {
            if(cheapestFlight == null || flight.price < cheapestFlight.price){
                cheapestFlight = flight;
            }
        }
        return cheapestFlight;
    }
// znalezienie najtańszego lotu z danego miasta
    public Flight getCheapestFlightFromCity(String city){
        ArrayList<Flight> flights = getFlightFromCity(city);
        Flight cheapestFlight = null;
        for (Flight flight : flights) {
            if(cheapestFlight == null || flight.price < cheapestFlight.price){
                cheapestFlight = flight;
            }
        }
        return cheapestFlight;
    }
// wypisanie lotu z przesiadką
    public ArrayList<Flight> getFlight(String start, String end) {
        ArrayList<Flight> startCity = getFlightFromCity(start);
        ArrayList<Flight> endCity = getFlightToCity(end);
        ArrayList<Flight> result = new ArrayList<>();
        for (Flight startCit : startCity) {
            for (Flight endCit : endCity) {
                if(startCit.arrival.equals(endCit.departure)){
                    result.add(startCit);
                    result.add(endCit);

                }
            }
        }
    return result;
    }

//TODO dodanie czasu lotu
//TODO obliczenie kosztu podróży
//TODO jeżeli jest kilka lotów z przesiadka zwróć najtańszy
//TODO jeżeli jest kilka lotów z przesiadka zwróć najszybszy
//TODO podanie dwóch miast jezeli jest bezpośredni zwróć go jeżeli nie to szukaj z przesiadką
// TODO dodanie bazy danych postgreSQL do zapytań
// TODO dodanie możliwości edycji lotów




}
