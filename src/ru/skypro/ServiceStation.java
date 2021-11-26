package ru.skypro;

public class ServiceStation {
    /**
     * @param vehicle интерфейс
     *                имя у каждого будет свое , но геттер общий из абстрактного класса
     */
    public void check(IVehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        vehicle.updateAllTyres();
        // здесь отработаеи и машина и грузовик как машина
        if (vehicle instanceof Car car) {
            car.checkEngine();
        }

        // отработает только для грузовика
        if (vehicle instanceof Truck truck) {
            truck.checkTrailer();
        }
    }
}
