package homework8.task2;

import homework8.task2.cars.*;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        Garage garage = new Garage();

        Car bus = new Bus("IVECO", "T-170", 2005, "Yellow", 25);
        Car electromobile = new Electromobile("Tesla", "Model-X", 2016, "Black", 5000);
        Car passengerCar = new PassengerCar("Volvo", "S-40", 2014, "Red", "Sedan");
        Car truck = new Truck("MAZ", "666", 1990, "Grey", 1000);

        garage.park(bus);
        garage.park(bus);
        garage.park(electromobile);
        garage.park(passengerCar);
        garage.park(truck);


        System.out.println("Now in garage " + garage.getNumberSpecificTypeCars("Bus") +" bus");

        garage.leave(bus);

        System.out.println("Now in garage " + garage.getNumberSpecificTypeCars("Bus") +" bus");
    }
}
