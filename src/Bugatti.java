public class Bugatti extends Car {
    private String engine;

    @Override
    public void print() {
        System.out.println("Bugatti model: " + getModel() + " engine: " + engine);
    }

    public Bugatti(String model, String engine) {
        super(model);
        this.engine = engine;
    }
}
