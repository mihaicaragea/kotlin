package challenge3.java;

public class RoadBike extends Bicycle {

    // In millimetres
    private int tireWidth;

    public RoadBike(int cadence,
                    int speed,
                    int gear,
                    int tireWidth) {
        super(cadence, speed, gear);
        this.tireWidth = tireWidth;
    }

    public int getTireWidth() {
        return tireWidth;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The mountain bike has tire width  " + tireWidth + "MM.");
    }
}
