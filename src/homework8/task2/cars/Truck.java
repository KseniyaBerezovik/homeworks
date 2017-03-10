package homework8.task2.cars;

public class Truck extends Car {
    private int carryingCapacity;

    public Truck(String brand, String model, int yearOfIssue, String color, int carryingCapacity) {
        super(brand, model, yearOfIssue, color);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;
        if (!super.equals(o)) return false;

        Truck truck = (Truck) o;

        return carryingCapacity == truck.carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + carryingCapacity;
        return result;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() +
                " carrying capacity=" + carryingCapacity +
                '}';
    }
}
