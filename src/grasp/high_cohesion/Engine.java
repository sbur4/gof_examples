package grasp.high_cohesion;

public class Engine {
    public void start() {
        System.out.println("Engine started.");
    }
}

class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    public void start() {
        System.out.println("Car starting...");
        engine.start(); // The Car class directly depends on the Engine class.
    }
}
