package application.data;

public class Flight {
    private int id;
    private String departure;
    private String arrival;
    private double price;

    public Flight(Integer id, String departure, String arrival, double price) {
        this.id = id;
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetails() {
        return "Flight from " + this.departure + " to " + this.arrival + " costs " + this.price + "$";
    }
}
