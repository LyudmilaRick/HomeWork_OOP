package ru.skypro;

/**
 * второй наследник. Машина, это велосипед с двмгателем
 * свой новый метод
 */
public class Car extends Bicycle {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
