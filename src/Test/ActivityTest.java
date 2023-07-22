
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import src.Main.Activity;
import src.Main.Passenger;

public class ActivityTest {
    @Test
    public void testAddPassenger() {
        Activity activity = new Activity("Hiking", "Enjoy hiking in the mountains", 50.0, 2);
        Passenger passenger1 = new Passenger("John", "P1", Passenger.Tier.standard, 100.0);
        Passenger passenger2 = new Passenger("Emma", "P2", Passenger.Tier.gold, 150.0);

        assertTrue(activity.addPassenger(passenger1));
        assertTrue(activity.addPassenger(passenger2));
        assertEquals(2, activity.getPassengers().size());

        // Adding more passengers than capacity should return false.
        Passenger passenger3 = new Passenger("Alice", "P3", Passenger.Tier.standard, 80.0);
        Passenger passenger4 = new Passenger("Mike", "P4", Passenger.Tier.standard, 120.0);
        assertFalse(activity.addPassenger(passenger3));
        assertFalse(activity.addPassenger(passenger4));
    }
}

