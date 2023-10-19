public class Main {
    public static void main(String[] args){
        Car car = new Car("1496", "GM668AT", "Mazda", "2 2022 Homura");
        System.out.println("Car:");
        System.out.println("Displacement: " + car.getDisplacement());
        System.out.println("Plate: " + car.getPlate());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
    }

}
