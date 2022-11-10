public class Lamborgyni extends Car {
    private int speed;

    @Override
    public void print() {
        System.out.println("Lamborgyni model: " + getModel() + " speed: " + speed);
    }

    public Lamborgyni(String model, int speed) {
        super(model);
        this.speed = speed;
    }
}
