//1
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarCatalog {
    private List<Car> cars;

    public CarCatalog() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCarsBySearchQuery(String bodyType, String engineType, String transmission, String color) {
        return cars.stream()
                .filter(car -> car.getBody().equals(bodyType)
                        && car.getEnTybe().equals(engineType)
                        && car.getTransmissoin().equals(transmission)
                        && car.getColor().equals(color))
                .collect(Collectors.toList());
    }

}