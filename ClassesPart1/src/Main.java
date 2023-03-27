public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setColor("Red");
        car.setConvertible(true);
        car.setDoors(2);


        System.out.println("make = "+car.getMake());
        System.out.println("model = "+car.getModel());
        car.describeCar();

    }
}
