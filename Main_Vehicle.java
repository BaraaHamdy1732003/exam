//2
import java.util.List;

public class Main_Vehicle {
    public static void main(String[] args) {
        VehicleDatabase db = new VehicleDatabase();
       // db.addVehicle(new Car("Honda", "Civic", 2020, 4));
     //   db.addVehicle(new Car("Toyota", "Corolla", 2021, 4));
        db.addVehicle(new Motorcycle("Harley-Davidson", "Street Glide", 2019,1204));

        List<Vehicle> honda2020Cars = db.searchByMakeAndYear("Honda", 2020);
        System.out.println("Cars made by Honda in 2020:");
        for (Vehicle vehicle : honda2020Cars) {
            if (vehicle instanceof Cars) {
                Cars car = (Cars) vehicle;
                System.out.println(car.getMake() + " " + car.getModel() + " with " + car.getNumDoors() + " doors");
            }
        }
        System.out.println();

        List<Vehicle> motorcycles = db.searchByType("motorcycle");
        System.out.println("Motorcycles:");
        for (Vehicle vehicle : motorcycles) {
            if (vehicle instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                System.out.println(motorcycle.getMake() + " " + motorcycle.getModel() + " with " + motorcycle.getModel() + " cc engine");
            }
        }
    }
}