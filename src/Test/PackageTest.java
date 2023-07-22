
import src.Main.Destination;
import src.Main.Package;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PackageTest {
    @Test
    public void testAddDestination() {
        Package travelPackage = new Package("Mountain Adventure", 20);

        Destination destination1 = new Destination("Mountain Resort");
        Destination destination2 = new Destination("Alpine Meadows");

        travelPackage.addDestination(destination1);
        travelPackage.addDestination(destination2);

        assertEquals(2, travelPackage.getDestinations().size());
    }
}
