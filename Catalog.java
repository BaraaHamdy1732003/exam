import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalog {
    private Map<String, List<Vehicle>> vehiclesByType;


    public Catalog() {
        this.vehiclesByType = new HashMap<>();
    }

    public void addVehicle(Vehicle vehicle) {
        String type = vehicle.getType();
        List<Vehicle> vehicles = vehiclesByType.get(type);

        if (vehicles == null) {
            vehicles= new ArrayList<>();
            vehiclesByType.put(type, vehicles);
        }

        vehicles.add(vehicle);
    }

    public List<Vehicle> getVehiclesByType(String type) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        List<Vehicle> vehicles = vehiclesByType.get(type);
        if (vehicles != null) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getType().equalsIgnoreCase(type)) {
                    filteredVehicles.add(vehicle);
                }
            }
        }
        return filteredVehicles;
    }

}
