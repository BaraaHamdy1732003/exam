public class Cars extends Vehicle{
    private int numDoors;

    public Cars(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public String getType() {
        return "car";
    }
    public String getSpecs() {
        return "Number of doors: " + numDoors;
    }
}

