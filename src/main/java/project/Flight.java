package project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Flight {
    String departure;
    String arrival;
    int price;


    public String getDetails(){
        return "Flight from " + this.departure + " to " + this.arrival + " coins " + this.price;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", price=" + price +
                '}';
    }
}
