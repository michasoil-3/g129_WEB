package second_module.stream_api;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarCity {
    private ArrayList<Car2> cars = new ArrayList<>();

    public CarCity() {
    }

    public CarCity(ArrayList<Car2> cars) {
        this.cars = cars;
    }

    void addCar(Car2 car) {
        cars.add(car);
    }

    public Car2 firstGreatVolumeCar() {
        return cars.stream().filter(car -> car.getEngineVolume() > 3).findFirst().orElseThrow();
    }

    public ArrayList<Car2> search(String name) {
        return cars.stream().filter(car -> car.getName().equals(name)).collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Car2> filterCars(
            int fromSpeed, int toSpeed, double fromVolume, double toVolume
    ) {
        Stream<Car2> stream = cars.stream().filter(car -> (car.getMaxSpeed() >= fromSpeed && car.getMaxSpeed() <= toSpeed &&
                car.getEngineVolume() >= fromVolume && car.getEngineVolume() <= toVolume));
        return stream.collect(Collectors.toCollection(ArrayList::new));
    }
}
