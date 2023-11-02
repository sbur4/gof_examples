package grasp.low_coupling;

public interface Engine { // Low Coupling
    void start();
}

class GasEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Gas engine started");
    }
}

class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric engine started");
    }
}

class Car {
    private Engine engine;

    // Constructor-based dependency injection
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        engine.start();
    }
}