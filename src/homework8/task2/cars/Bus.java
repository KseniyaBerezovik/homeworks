package homework8.task2.cars;

public class Bus extends Car {
    private int numberOfPassengers;

    public Bus(String brand, String model, int yearOfIssue, String color, int numberOfPassengers) {
        super(brand, model, yearOfIssue, color);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;
        if (!super.equals(o)) return false;

        Bus bus = (Bus) o;

        return numberOfPassengers == bus.numberOfPassengers;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberOfPassengers;
        return result;
    }

    @Override
    public String toString() {
        return "Bus{" + super.toString() +
                " number of passengers=" + numberOfPassengers +
                '}';
    }
}
