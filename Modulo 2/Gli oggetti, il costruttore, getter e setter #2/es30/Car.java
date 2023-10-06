public class Car {
    private final String displacement;
    private final String plate;
    private final String brand;
    private final String model;
    public Car(String displacement, String plate, String brand, String model) {
        this.displacement = displacement;
        this.plate = plate;
        this.brand = brand;
        this.model = model;
    }
    public String getDisplacement() {
        return displacement;
    }
    public String getPlate() {
        return plate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    @Override
    public String toString() {
        return "Car{" +
                "displacement='" + displacement + '\'' +
                ", plate='" + plate + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
