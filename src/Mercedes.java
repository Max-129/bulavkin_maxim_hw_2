public class Mercedes extends Car {
    private int comfortable;

    @Override
    public void print() {
        System.out.println("Mercedes model: " + getModel()+ " Comfortable: " + comfortable);
    }

    public Mercedes(String model, int comfortable) {
        super(model);
        this.comfortable = comfortable;
    }
}
