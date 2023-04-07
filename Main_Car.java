//1
import java.util.List;

public class Main_Car {

        public static void main(String[] args) {
                Catalog catalog = new Catalog();

                 ObjectMapper objectMapper = new ObjectMapper();
                try {
                        Vehicle[] vehicles = objectMapper.readValue(new File("catalog.json"), Vehicle[].class);
                        for (Vehicle vehicle : vehicles) {
                                catalog.addVehicle(vehicle);
                        }
                } catch (IOException e) {
                        e.printStackTrace();
                }

                // search for vehicles by attributes
                List<Vehicle> matchingVehicles = catalog.getVehiclesByAttributes("Sedan", "Gasoline", "Automatic", "Black");
                for (Vehicle vehicle : matchingVehicles) {
                        System.out.println(vehicle.getModel() + " - " + vehicle.getPrice());
                }

                // read search data from json file
                try {
                        SearchCriteria searchCriteria = objectMapper.readValue(new File("search_criteria.json"), SearchCriteria.class);
                        List<Vehicle> foundVehicles = catalog.getVehiclesByAttributes(searchCriteria.getBodyType(), searchCriteria.getEngineType(), searchCriteria.getTransmissionType(), searchCriteria.getColor());
                        for (Vehicle vehicle : foundVehicles) {
                                System.out.println(vehicle.getModel() + " - " + vehicle.getPrice());
                        }
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }
}
}