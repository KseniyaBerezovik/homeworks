package homework8.task2;

import homework8.task2.cars.Car;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    private static Map<Car, Integer> cars = new HashMap<>();

    public static void park(Car car) {
        if (cars.containsKey(car)) {
            cars.put(car, cars.get(car) + 1);
        } else {
            cars.put(car, 1);
        }
    }

    public static void leave(Car car) {
        if (!cars.containsKey(car)) {
            System.out.println("This car isn't in the garage");
            return;
        }
        if (cars.get(car) == 1) {
            cars.remove(car);
        } else {
            cars.put(car, cars.get(car) - 1);
        }
        System.out.println(car.getClass().getSimpleName() + " has left the garage");
    }

    public static int getNumberOfCarsOfCertainType(TypesOfCar type) {
        int count = 0;
        for (Car car : cars.keySet()) {
            if (car.getClass().getSimpleName().equals(type.toString())) {
                count += cars.get(car);
            }
        }
        return count;
    }

    public static void printCars() {
        System.out.println();
        for (Map.Entry<Car, Integer> entry : cars.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println();
    }
}