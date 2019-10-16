import org.junit.Before;
import org.junit.Test;
import race.Car;
import race.Driver;

import static org.junit.Assert.assertEquals;

public class DriverTest {

    Driver driver;
    Car car;
    Car car2;

    @Before
    public void before(){
        car = new Car(95, 5);
        car2 = new Car(43, 4);
        driver = new Driver("Lightning McQueen", 5, car);
    }

    @Test
    public void getName() {
        assertEquals("Lightning McQueen", driver.getName());
    }

    @Test
    public void getSkill() {
        assertEquals(5, driver.getSkill());
    }

    @Test
    public void getRide() {
        assertEquals(car, driver.getRide());
    }

    @Test
    public void setRide() {
        driver.setRide(car2);
        assertEquals(car2, driver.getRide());
    }
}
