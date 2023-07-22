package Main;

import java.util.ArrayList;

public class Activity {
    private String name;
    private String description;
    private double price;
    private int capacity;
    private Destination destination;
    private ArrayList<Passenger> passengers;

    public Activity(String name, String description, double cost, int capacity) {
        setName(name);
        setDescription(description);
        setCapacity(capacity);
        setPrice(cost);
        setPassengers(new ArrayList<>());
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    /**
     * The function adds a passenger to a list if there is still capacity available.
     *
     * @param passenger The parameter "passenger" is of type "Passenger", which is a class representing a passenger object.
     * @return The method is returning a boolean value. If the passenger was successfully added to the list, it will return
     * true. If the list is already at capacity and the passenger cannot be added, it will return false.
     */
    public boolean addPassenger(Passenger passenger) {
        if (passengers.size() < capacity) {
            passengers.add(passenger);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }
}
