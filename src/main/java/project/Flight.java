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


    public String getDetails(){
        return "Flight from " + this.departure + " to " + this.arrival;
    }
}
