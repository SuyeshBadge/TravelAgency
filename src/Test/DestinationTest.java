
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import src.Main.Activity;
import src.Main.Destination;




public class DestinationTest {

    @Test
    public void testAddActivity() {
        Destination destination = new Destination("Mountain Resort");

        Activity activity1 = new Activity("Hiking", "Enjoy hiking in the mountains", 50.0, 5);
        Activity activity2 = new Activity("Skiing", "Experience skiing on the slopes", 80.0, 8);

        destination.addActivity(activity1);
        destination.addActivity(activity2);

        assertEquals(2, destination.getActivities().size());
    }
}
