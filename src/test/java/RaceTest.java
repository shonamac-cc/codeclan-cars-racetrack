import org.junit.Before;
import org.junit.Test;
import race.Car;
import race.Driver;
import race.Race;

import static org.junit.Assert.assertEquals;

public class RaceTest {

    Race race;
    Driver driver;
    Car car;

    @Before
    public void before(){
        race = new Race("Piston Cup");
        car = new Car(95, 5);
        driver = new Driver("Lighting McQueen", 5, car);
    }

    @Test
    public void getName() {
        assertEquals("Piston Cup", race.getName());
    }

    @Test
    public void getDrivers() {
        assertEquals(0, race.getDrivers().size());
    }

    @Test
    public void addDriver_driverAsParam_addsDriverToList() {
        race.addDriver(driver);
        assertEquals(1, race.getDrivers().size());
    }

    @Test
    public void canCreateResult(){

    }
}
