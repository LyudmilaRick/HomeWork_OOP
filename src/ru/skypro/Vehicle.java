package ru.skypro;

/**
 * абстрактный класс. Импользую как шаблон
 */
public abstract class Vehicle implements IVehicle {
    protected final String modelName;
    protected final int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }

    /**
     * абстрактный метод - будет реализован в наследниках
     */
    @Override
    public abstract void updateTyre();

    /**
     * метод - общий метод, который вызовет имлементировнный метод
     */
    @Override
    public void updateAllTyres() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}
