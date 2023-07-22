package src.Main;

public class Main {
    public static void main(String[] args) {
        // Create a new package.
        Package package1 = new Package("Package 1", 2);

        // Create new destination.
        Destination destination1 = new Destination("Destination 1");
        Destination destination2 = new Destination("Destination 2");
        Destination destination3 = new Destination("Destination 3");


        // Create new activities.
        Activity activity1 = new Activity("Activity 1", "Description 1", 150, 100);
        Activity activity2 = new Activity("Activity 2", "Description 2", 432, 200);
        Activity activity3 = new Activity("Activity 3", "Description 3", 250, 50);
        Activity activity4 = new Activity("Activity 4", "Description 4", 100, 20);
        Activity activity5 = new Activity("Activity 5", "Description 5", 10, 10);
        Activity activity6 = new Activity("Activity 6", "Description 6", 150, 700);


        // Add the activity to the destination.
        destination1.addActivity(activity1);
        destination1.addActivity(activity2);
        destination2.addActivity(activity3);
        destination2.addActivity(activity4);
        destination3.addActivity(activity5);
        destination3.addActivity(activity6);


        // Add the destination to the package.
        package1.addDestination(destination1);
        package1.addDestination(destination2);
        package1.addDestination(destination3);

        // Create new passengers.
        Passenger passenger1 = new Passenger("Passenger 1", "P1", Passenger.Tier.standard, 1000);
        Passenger passenger2 = new Passenger("Passenger 2", "P2", Passenger.Tier.gold, 1000);
        Passenger passenger3 = new Passenger("Passenger 3", "P3", Passenger.Tier.premium, 1000);
        Passenger passenger4 = new Passenger("Passenger 4", "P4", Passenger.Tier.standard, 1000);
        Passenger passenger5 = new Passenger("Passenger 5", "P5", Passenger.Tier.gold, 1000);


        // Add the passenger to the package.
        package1.addPassenger(passenger1);
        package1.addPassenger(passenger2);
        package1.addPassenger(passenger3);
        package1.addPassenger(passenger4);
        package1.addPassenger(passenger5);


        // Enroll the passenger in the activity.
        passenger1.enrollActivity(activity1);
        passenger1.enrollActivity(activity5);
        passenger2.enrollActivity(activity2);
        passenger2.enrollActivity(activity3);
        passenger3.enrollActivity(activity4);
        passenger3.enrollActivity(activity6);
        passenger4.enrollActivity(activity1);
        passenger4.enrollActivity(activity2);
        passenger5.enrollActivity(activity3);
        passenger5.enrollActivity(activity4);


//      Show the package details.
        package1.showPackageDetails();

        System.out.println("Package 1 available activities:");
        package1.printAvailableActivities();

        System.out.println("Passenger Details");
        package1.printPassengerDetails(passenger1);


    }
}
