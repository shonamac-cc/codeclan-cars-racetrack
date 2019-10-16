package race;

public class Car implements IDrive {

    private int number;
    private int speed;
    private int fuel = 10;
    private boolean damaged = false;

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
        if(this.fuel >= fuel) {
            this.fuel -= fuel;
        }
    }

    public boolean isDamaged() {
        return damaged;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }
}
