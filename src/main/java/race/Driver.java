package race;

public class Driver {

    private String name;
    private int skill;
    private IDrive ride;

    public Driver(String name, int skill, IDrive ride){
        this.name = name;
        this.skill = skill;
        this.ride = ride;
    }

    public String getName() {
        return name;
    }

    public int getSkill() {
        return skill;
    }

    public IDrive getRide() {
        return ride;
    }

    public void setRide(IDrive ride) {
        this.ride = ride;
    }

    public void driveRide(){
        ride.drive(skill);
    }
}
