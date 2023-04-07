
public class Motorcycle extends Vehicle {
    private int  hasSidecar;

    public Motorcycle(String make, String model, int year, int hasSidecar) {
        super(make, model, year);
        this.hasSidecar = hasSidecar;
    }

    public int hasSidecar() {
        return hasSidecar;
    }

    public String getType() {
        return "Motorcycle";
    }

    public String getSpecs() {
        return "Has sidecar: " + hasSidecar;
    }
}
