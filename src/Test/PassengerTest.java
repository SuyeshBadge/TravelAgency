
import src.Main.Activity;
import src.Main.Passenger;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {

    @Test
    public void testEnrollActivity() {
        Activity activity1 = new Activity("Hiking", "Enjoy hiking in the mountains", 50.0, 5);
        Activity activity2 = new Activity("Skiing", "Experience skiing on the slopes", 80.0, 8);

        Passenger passenger1 = new Passenger("John", "P1", Passenger.Tier.standard, 100.0);
        Passenger passenger2 = new Passenger("Emma", "P2", Passenger.Tier.gold, 150.0);

        assertTrue(passenger1.enrollActivity(activity1));
        assertTrue(passenger2.enrollActivity(activity2));

        assertEquals(50.0, passenger1.getBalance(), 0.01);
        assertEquals(78.0, passenger2.getBalance(), 0.01);

        // Gold passenger should get a discount of 10% on the activity cost.
        assertEquals(activity2, passenger2.getActivitiesEnrolled().get(0));
    }
}