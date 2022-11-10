public class Main {
    public static void main(String[] args) {
        Car bugatti = createObject("Bugatti");
        Car lamborgyni = createObject("Lamborgyni");
        Car mercedes = createObject("Mercedes");

        bugatti.print();
        lamborgyni.print();
        mercedes.print();

    }
    public static Car createObject(String className){
        switch (className){
        case"Bugatti":
            Bugatti bugatti = new Bugatti("Veyron", "engine1" );
            return bugatti;
            case "Lamborgyni":
                Lamborgyni lamborgyni = new Lamborgyni("Vulcano", 240);
                return lamborgyni;
            case "Mercedes":
                Mercedes mercedes = new Mercedes("Benz", 10);
                return mercedes;
    }
    return null;
    }

}