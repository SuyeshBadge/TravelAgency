package Main;

import java.util.ArrayList;

public class Package {
    String name;
    int passengerCapacity;
    ArrayList<Passenger> passengers = new ArrayList<Passenger>();
    ArrayList<Destination> destinations = new ArrayList<Destination>();

    public Package(String name, int passengerCapacity) {
        setName(name);
        setPassengerCapacity(passengerCapacity);
        setPassengers(new ArrayList<>());
        setDestinations(new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public ArrayList<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(ArrayList<Destination> destinations) {
        this.destinations = destinations;
    }

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    /**
     * The function "showPackageDetails" prints out the details of a package, including its name, passenger
     * capacity, passengers, destinations, and activities.
     */
    public void showPackageDetails() {
        System.out.println("Package Name: " + this.name);
        System.out.println("Passenger Capacity: " + this.passengerCapacity);
        System.out.println("Passengers: ");
        for (Passenger passenger : this.passengers) {
            System.out.println(passenger.getName());
        }
        System.out.println("Destinations: ");
        for (Destination destination : this.destinations) {
            System.out.println(destination.getName());
            System.out.println("Activities: ");
            for (Activity activity : destination.getActivities()) {
                System.out.println("Name: " + activity.getName());
                System.out.println("Cost: " + activity.getPrice());
                System.out.println("Capacity: " + activity.getCapacity());
                System.out.println("Description: " + activity.getDescription());
            }
        }
    }

    /**
     * The function prints the package name, passenger capacity, number of passengers, and the name and
     * code of each passenger in a list.
     */
    public void printPassengerList() {
        System.out.println("Package Name: " + this.name);
        System.out.println("Passenger Capacity: " + this.passengerCapacity);
        System.out.println("Number of Passengers: " + this.passengers.size());
        for (Passenger passenger : this.passengers) {
            System.out.println(passenger.getName() + " " + passenger.getPassengerCode());
        }
    }


    /**
     * The function "printPassengerDetails" prints out the details of a passenger, including their name,
     * passenger number, balance (if applicable), and the activities they are enrolled in.
     *
     * @param passenger The parameter "passenger" is of type Passenger, which is a class representing a
     *                  passenger. It contains information such as the passenger's name, passenger number, balance, and
     *                  activities enrolled.
     */
    public void printPassengerDetails(Passenger passenger) {
        System.out.println("Name: " + passenger.getName());
        System.out.println("Passenger Number: " + passenger.getPassengerCode());
        if (passenger.getBalance() > 0) {
            System.out.println("Balance: " + passenger.getBalance());
        }
        System.out.println("Activities: ");
        for (Activity activity : passenger.getActivitiesEnrolled()) {
            System.out.println("Name: " + activity.getName());
            System.out.println("Destination: " + activity.getDestination().getName());
            System.out.println("Price: " + activity.getPrice());
        }
    }


    /**
     * The function prints the details of available activities, including their name, destination, price,
     * and number of spaces available.
     */
    public void printAvailableActivities() {
        for (Destination destination : this.destinations) {
            for (Activity activity : destination.getActivities()) {
                if (activity.getCapacity() > activity.getPassengers().size()) {
                    System.out.println("Name: " + activity.getName());
                    System.out.println("Destination: " + activity.getDestination().getName());
                    System.out.println("Price: " + activity.getPrice());
                    System.out.println("Spaces Available: " + (activity.getCapacity() - activity.getPassengers().size()));
                }
            }
        }
    }


}
