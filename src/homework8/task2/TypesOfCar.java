package homework8.task2;

public enum TypesOfCar {
    BUS {
        @Override
        public String toString() {
            return "Bus";
        }
    }, PASSANGER_CAR {
        @Override
        public String toString() {
            return "PassangerCar";
        }
    }, TRUCK {
        @Override
        public String toString() {
            return "Truck";
        }
    }, ELECTROMOBILE {
        @Override
        public String toString() {
            return "Electromobile";
        }
    }
}