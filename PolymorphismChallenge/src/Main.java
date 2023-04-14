public class Main {
    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS",15.4,6);
        runRace(ferrari);

        Car telsa = new ElectricCar("2022 Red Telsa Model 3",568,75);
        runRace(telsa);

        Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale",16,8,8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
