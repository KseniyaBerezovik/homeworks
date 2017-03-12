package homework8.task2.cars;

public class Electromobile extends Car {
    private int batteryCapacity;

    public Electromobile(String brand, String model, int yearOfIssue, String color, int batteryCapacity) {
        super(brand, model, yearOfIssue, color);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Electromobile)) return false;
        if (!super.equals(o)) return false;

        Electromobile that = (Electromobile) o;

        return batteryCapacity == that.batteryCapacity;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + batteryCapacity;
        return result;
    }

    @Override
    public String toString() {
        return "Electromobile{" + super.toString() +
                " battery capacity=" + batteryCapacity +
                '}';
    }
}
