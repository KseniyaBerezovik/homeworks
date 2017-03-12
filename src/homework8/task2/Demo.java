package homework8.task2;

import homework8.task2.cars.*;

public class Demo {
    public static void main(String[] args) {

        Car bus1 = new Bus("IVECO", "T-170", 2005, "Yellow", 25);
        Car bus2 = new Bus("IVECO", "T-170", 2005, "Yellow", 25);
        Car bigBus = new Bus("IVECO", "T-170", 2005, "Yellow", 50);
        Car electromobile = new Electromobile("Tesla", "Model-X", 2016, "Black", 75);
        Car passengerCar = new PassengerCar("Volvo", "S-40", 2014, "Red", "Sedan");
        Car truck = new Truck("MAZ", "666", 1990, "Grey", 1000);

        Garage.park(bus1);
        Garage.park(bus2);
        Garage.park(bigBus);
        Garage.park(electromobile);
        Garage.park(passengerCar);
        Garage.park(truck);

        Garage.printCars();

        System.out.println("In garage " + Garage.getNumberOfCarsOfCertainType(TypesOfCar.BUS) +" buses");

        Garage.leave(bus1);
        Garage.printCars();

        System.out.println("In garage " + Garage.getNumberOfCarsOfCertainType(TypesOfCar.BUS) +" buses");
    }
}
