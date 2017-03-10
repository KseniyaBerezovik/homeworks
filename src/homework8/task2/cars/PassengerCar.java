package homework8.task2.cars;

public class PassengerCar extends Car {
    private String bodyType;

    public PassengerCar(String brand, String model, int yearOfIssue, String color, String bodyType) {
        super(brand, model, yearOfIssue, color);
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerCar)) return false;
        if (!super.equals(o)) return false;

        PassengerCar that = (PassengerCar) o;

        return bodyType != null ? bodyType.equals(that.bodyType) : that.bodyType == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (bodyType != null ? bodyType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PassengerCar{" + super.toString() +
                "body type='" + bodyType + '\'' +
                '}';
    }
}
