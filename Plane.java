//Project Airport: (score 100)
//        classes - Plane , PlaneService, AirportTest(main)
//        Plane (score 10)
//        model - name of the plane (Any not empty string)
//        country - country the plane belongs to (Any not empty string)
//        year - year of publishing  (from 1903 to 2020)
//        hours - hours in air (from 0 to 10000)
//        military - is military or not
//        engineType - type of engine (Any not empty string, for ex: "Rolls-Royce Trent 900" )
//        weight - weight of plane (from 1000 KG to 160000 KG)
//        wingspan - the maximum extent across the wings of an aircraft (from 10 - 45)
//        topSpeed - maximal speed per hour (1000 km/h) (any not negative value)
//        seats - number of seats (any not negative value)
//        cost - cost of the plane (ex: 445.6$) (any not negative value)

package model;

public class Plane {
    private String model;
    private String country;
    private int year;
    private short hours;
    private boolean military;
    private String engineType;
    private int weight;
    private byte wingspan;
    private int topSpeed;
    private int seats;
    private double cost;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (!model.isEmpty())
            this.model = model;

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (!country.isEmpty())
            this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1903 && year <= 2020)
            this.year = year;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(short hours) {
        if (hours >= 0 && hours <= 10000)
            this.hours = hours;
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        if (!engineType.isEmpty())
            this.engineType = engineType;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 1000 && weight <= 160000)
            this.weight = weight;
    }

    public byte getWingspan() {
        return wingspan;
    }

    public void setWingspan(byte wingspan) {
        if (wingspan >= 10 && wingspan <= 45)
            this.wingspan = wingspan;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed >= 0)
            this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats >= 0)
            this.seats = seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost >= 0)
            this.cost = cost;
    }
}
