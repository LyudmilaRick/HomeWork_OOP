package ru.skypro;

public class Main {
    public static void main(String[] args) {
        IVehicle[] vehicles = new IVehicle[10];
        ServiceStation serviceStation = new ServiceStation();
        vehicles[0] = new Bicycle("bicycle1", 2);
        vehicles[1] = new Bicycle("bicycle2", 3);
        vehicles[2] = new Car("car2", 4);
        vehicles[3] = new Car("car1", 4);
        vehicles[4] = new Car("car3", 4);
        vehicles[5] = new Truck("truck1", 6);
        vehicles[6] = new Truck("truck2", 8);

        for (IVehicle vehicle : vehicles) {
            if (vehicle == null ){
                return;
            }
            serviceStation.check(vehicle);
        }
    }
}

