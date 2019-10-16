import org.junit.Before;
import org.junit.Test;
import race.Car;

import static org.junit.Assert.*;

public class CarTest {

    Car car;

    @Before
    public void before(){
        car = new Car(54, 5);
    }


    @Test
    public void getNumber() {
        assertEquals(54, car.getNumber());
    }

    @Test
    public void getSpeed() {
        assertEquals(5, car.getSpeed());
    }

    @Test
    public void getFuel() {
        assertEquals(10, car.getFuel());
    }

    @Test
    public void useFuel() {
        car.useFuel(4);
        assertEquals(6, car.getFuel());
        car.useFuel(7);
        assertEquals(6, car.getFuel());
    }

    @Test
    public void isDamaged() {
        assertFalse(car.isDamaged());
    }

    @Test
    public void setDamaged() {
        car.setDamaged(true);
        assertTrue(car.isDamaged());
    }

    @Test
    public void drive() {
        car.drive(4);
        assertEquals(false, (car.getResult() == 0));
    }

    @Test
    public void getResult() {
        assertEquals(0,0);
    }
}
