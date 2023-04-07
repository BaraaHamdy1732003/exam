import java.util.ArrayList;
import java.util.List;

class VehicleDatabase {
    private List<Vehicle> vehicles;

    public VehicleDatabase() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> searchByMakeAndYear(String make, int year) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMake().equals(make) && vehicle.getYear() == year) {
                result.add(vehicle);
            }
        }
        return result;
    }

    public List<Vehicle> searchByType(String type) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals(type)) {
                result.add(vehicle);
            }
        }
        return result;
    }
}