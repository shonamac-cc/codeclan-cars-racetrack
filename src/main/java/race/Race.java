package race;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private String name;
    private List<Driver> drivers = new ArrayList<Driver>();
    private List<Result> results = new ArrayList<Result>();

    public Race(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addDriver(Driver driver){
        drivers.add(driver);
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void race() {
        for (Driver driver : drivers) {
            driver.driveRide();
            results.add(createResult(driver));
        }
    }

    private Result createResult(Driver driver) {
        return new Result(
                driver.getName(),
                ((Car) driver.getRide()).getNumber(),
                ((Car) driver.getRide()).getResult(),
                ((Car) driver.getRide()).isDamaged()
        );
    }
}
