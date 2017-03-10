package homework8.task2;

import homework8.task2.cars.Car;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    private Map<Car, Integer> cars = new HashMap<>();

    public void park(Car car) {
        if (cars.containsKey(car)) {
            cars.put(car, cars.get(car) + 1);
        } else {
            cars.put(car, 1);
        }
        System.out.println(car.getClass().getSimpleName() + " park in garage");
    }

    public void leave(Car car) {
        if (!cars.containsKey(car)) {
            System.out.println("This car is not in the garage");
            return;
        }
        if (cars.get(car) == 1) {
            cars.remove(car);
        } else {
            cars.put(car, cars.get(car) - 1);
        }
        System.out.println(car.getClass().getSimpleName() + " to leave garage");

    }

    public int getNumberEqualCars(Car car) {
        if(!cars.containsKey(cars)) {
            return 0;
        }
        return cars.get(car);
    }

    public int getNumberSpecificTypeCars (String type) throws ClassNotFoundException {
        int count = 0;
        for (Car car : cars.keySet()) {
            if (car.getClass().getSimpleName().equalsIgnoreCase(type)) {
                count += cars.get(car);
            }
        }
        return count;
    }
}
