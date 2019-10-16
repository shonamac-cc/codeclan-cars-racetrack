package race;

public class Car implements IDrive {

    private int number;
    private int speed;
    private int fuel = 10;
    private boolean damaged = false;
    private int result;

    public Car(int number, int speed) {
        this.number = number;
        this.speed = speed;
    }

    public int getNumber() {
        return this.number;
    }

    public int getSpeed() {
        return speed;
    }

    public int getFuel() {
        return fuel;
    }

    public void useFuel(int fuel) {
        if (this.fuel >= fuel) {
            this.fuel -= fuel;
        }
    }

    public boolean isDamaged() {
        return damaged;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    public void drive(int skill) {
        int randomInt = (int) (4.0 * Math.random());
        result = randomInt * skill * speed;
        randomInt = (int) (5.0 * Math.random());
        if (randomInt >= skill) {
            damaged = true;
            result -= 25;
        }
    }

    public int getResult() {
        return result;
    }
}
